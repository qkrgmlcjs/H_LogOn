import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import mdlaf.MaterialLookAndFeel;
import mdlaf.animation.MaterialUIMovement;
import mdlaf.utils.MaterialColors;

public class MaterialUISwingDemo {

	public static void main (String[] args) {
		try {
			UIManager.setLookAndFeel (new MaterialLookAndFeel ());
		}
		catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace ();
		}

		// basic instantiation of JFrame with various components, including a
		// JMenuBar with some menus and items, as well as a button
		JFrame frame = new JFrame ("Material Design UI for Swing by atharva washimkar");
		frame.setMinimumSize (new Dimension (600, 400));
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// configuring a simple JButton
		JButton button = new JButton ("COKE");
		button.setBackground (MaterialColors.LIGHT_BLUE_400);
		button.setForeground (Color.WHITE);
		button.setMaximumSize (new Dimension (200, 200));
		
		JButton menubtn = new JButton ("Sprite");
		menubtn.setBackground (MaterialColors.LIGHT_BLUE_400);
		menubtn.setForeground (Color.WHITE);
		menubtn.setMaximumSize (new Dimension (200, 200));
		
		JButton bev_btn = new JButton("Fanta");
		bev_btn.setBackground (MaterialColors.LIGHT_BLUE_400);
		bev_btn.setForeground (Color.WHITE);
		bev_btn.setMaximumSize (new Dimension (100, 100));
		
		JPanel content = new JPanel ();
		content.add (button);
		content.add (menubtn);
		content.add(bev_btn);
		
		//음료메뉴 CheckBox
		JCheckBox[] bev_check = new JCheckBox[6];
		String[]  names = {"Coca Cola","Sprite","Orange Juice","Fanta","Wellchis","Water"};
		
		//과자메뉴 CheckBox
		JCheckBox[] snack_check = new JCheckBox[6];
		//String[] names = {}
		
		
		
		

		// add everything to the frame
		//frame.add (bar, BorderLayout.PAGE_START);
		frame.add (content, BorderLayout.CENTER);
		
		// start animating!
		// here, 'gray' is the color that the JComponent will transition to when the user hovers over it
		
		

		// you can also pass in extra parameters indicating how many intermediate colors to display, as well as the "frame rate" of the animation
		// there will be 5 intermediate colors displayed in the transition from the original components color to the new one specified
		// the "frame rate" of the transition will be 1000 / 30, or 30 FPS
		// the animation will take 5 * 1000 / 30 = 166.666... milliseconds to complete
		MaterialUIMovement.add (button, MaterialColors.LIGHT_BLUE_600, 5, 1000 / 30);
		MaterialUIMovement.add (menubtn, MaterialColors.LIGHT_BLUE_600, 5, 1000 / 30);
		MaterialUIMovement.add (bev_btn, MaterialColors.LIGHT_BLUE_600, 5, 1000 / 30);
	
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

		JEditorPane editorPane = new JEditorPane ();
		editorPane.setText ("a-a");
		pn.add (editorPane);

		// make everything visible to the world
		frame.pack ();
		frame.setVisible (true);

	}
}

