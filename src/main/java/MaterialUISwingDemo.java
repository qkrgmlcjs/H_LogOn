import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import mdlaf.MaterialLookAndFeel;
import mdlaf.utils.MaterialColors;

public class MaterialUISwingDemo extends JFrame{
	public static void main(String[] args) {
		/*try {
			UIManager.setLookAndFeel (new MaterialLookAndFeel ());
		}
		catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace ();
		}
	*/
		// basic instantiation of JFrame with various components, including a
		// JMenuBar with some menus and items, as well as a button
		JFrame frame = new JFrame ("Material Design UI for Swing by atharva washimkar");
		frame.setMinimumSize (new Dimension (600, 400));
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("상품주문");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// configuring a simple JButton
		ImageIcon cokeIcon = new ImageIcon("imgs/코카콜라.jpg");
		JCheckBox coke = new JCheckBox ("COKE", cokeIcon);
		coke.setBackground (MaterialColors.LIGHT_BLUE_400);
		coke.setForeground (Color.WHITE);
		coke.setMaximumSize (new Dimension (200, 200));
		coke.setBorderPainted(true);
		
		
		BeverageMatarial BM = new BeverageMatarial();
		BM.Set_bev_CheckBox();
		Matarial_Ramen MR = new Matarial_Ramen();
		MR.Set_ram_CheckBox();
		Matarial_Snack MS = new Matarial_Snack();
		MS.Set_sna_CheckBox();
		
		JPanel content = new JPanel ();
		content.setLayout(new GridLayout(3,2));
		
		for(int i = 0; i<BM.beverage.length;i++) {
			content.add(BM.beverage[i]);
		}
		
		//content.add(coke);
		
		
		

		// add everything to the frame
		//frame.add (bar, BorderLayout.PAGE_START);
		frame.add (content, BorderLayout.CENTER);
		
		// start animating!
		// here, 'gray' is the color that the JComponent will transition to when the user hovers over it
		
		

		// you can also pass in extra parameters indicating how many intermediate colors to display, as well as the "frame rate" of the animation
		// there will be 5 intermediate colors displayed in the transition from the original components color to the new one specified
		// the "frame rate" of the transition will be 1000 / 30, or 30 FPS
		// the animation will take 5 * 1000 / 30 = 166.666... milliseconds to complete
		//MaterialUIMovement.add (button, MaterialColors.LIGHT_BLUE_600, 5, 1000 / 30);
		//MaterialUIMovement.add (menubtn, MaterialColors.LIGHT_BLUE_600, 5, 1000 / 30);
		//MaterialUIMovement.add (bev_btn, MaterialColors.LIGHT_BLUE_600, 5, 1000 / 30);
	
		//일단은 놔둬보자 

		JScrollPane sp = new JScrollPane (content);
		sp.setHorizontalScrollBarPolicy (JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sp.setVerticalScrollBarPolicy (JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		JPanel pn = new JPanel ();
		JPanel rn = new JPanel();
		JTabbedPane tp = new JTabbedPane ();
		tp.addTab ("Beverage", sp);
		tp.addTab ("Snack", pn);
		tp.addTab("Ramen", rn);
		frame.add (tp, BorderLayout.CENTER);

		pn.setLayout(new GridLayout(3,2));
		
		for(int i = 0; i<MS.Snack_Check.length;i++) {
			pn.add(MS.Snack_Check[i]);
		}
		
		rn.setLayout(new GridLayout(3,2));
		
		for(int i = 0; i<MR.Ramen_Check.length;i++) {
			rn.add(MR.Ramen_Check[i]);
		}
		
		// make everything visible to the world
		frame.pack ();
		frame.setVisible (true);

		
	}

}