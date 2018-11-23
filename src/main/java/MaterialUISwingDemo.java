import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
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

		// configuring the JMenuBar as well as its menus and items
		// 메뉴 부분
		JMenuBar bar = new JMenuBar ();
		JMenu menu1 = new JMenu ("Menu1");
		JMenu menu2 = new JMenu ("Menu2");

		JMenuItem item1 = new JMenuItem("I don't know");
		JMenuItem item2 = new JMenuItem("I don't know");
		menu1.add(item1);
		menu2.add(item2);
		menu1.addSeparator ();
		menu2.addSeparator ();
		
		bar.add (menu1);
		bar.add (menu2);

		// configuring a simple JButton
		JButton button = new JButton ("PRESS ME");
		button.setBackground (MaterialColors.LIGHT_BLUE_400);
		button.setForeground (Color.WHITE);
		button.setMaximumSize (new Dimension (200, 200));
		
		JButton menubtn = new JButton ("ORDER");
		menubtn.setBackground (MaterialColors.LIGHT_BLUE_400);
		menubtn.setForeground (Color.WHITE);
		menubtn.setMaximumSize (new Dimension (200, 200));
		
		JButton bev_btn = new JButton("Beverage");
		bev_btn.setBackground (MaterialColors.LIGHT_BLUE_400);
		bev_btn.setForeground (Color.WHITE);
		bev_btn.setMaximumSize (new Dimension (100, 100));
		
		JPanel content = new JPanel ();
		content.add (button);
		content.add (menubtn);
		content.add(bev_btn);

		// add everything to the frame
		frame.add (bar, BorderLayout.PAGE_START);
		frame.add (content, BorderLayout.CENTER);
		
		// start animating!
		// here, 'gray' is the color that the JComponent will transition to when the user hovers over it
		MaterialUIMovement.add (menu1, MaterialColors.GRAY_200);
		

		// you can also pass in extra parameters indicating how many intermediate colors to display, as well as the "frame rate" of the animation
		// there will be 5 intermediate colors displayed in the transition from the original components color to the new one specified
		// the "frame rate" of the transition will be 1000 / 30, or 30 FPS
		// the animation will take 5 * 1000 / 30 = 166.666... milliseconds to complete
		MaterialUIMovement.add (button, MaterialColors.LIGHT_BLUE_600, 5, 1000 / 30);
		MaterialUIMovement.add (menubtn, MaterialColors.LIGHT_BLUE_600, 5, 1000 / 30);
		MaterialUIMovement.add (bev_btn, MaterialColors.LIGHT_BLUE_600, 5, 1000 / 30);
	
		//일단은 놔둬보자 
		JToolBar tb = new JToolBar ("toolbar");
		JButton button1 = new JButton ("f");

		
		
		
		//툴바 버튼 액션이벤트리스너 
		button1.setAction (new AbstractAction () {
			@Override
			public void actionPerformed (ActionEvent e) {
				putValue (Action.NAME, "f");
				putValue (Action.SHORT_DESCRIPTION, "Test tool tip");

				JDialog dialog = new JDialog ();
				JPanel jPanel = new JPanel ();
				jPanel.add (new JColorChooser ());
				dialog.setContentPane (jPanel);
				dialog.setLocationRelativeTo (null);
				dialog.setVisible (true);
				dialog.pack ();
			}
		});
		//얘도 놔둬 보자
		JButton button2 = new JButton ("e");
		button1.setBackground (MaterialColors.LIGHT_BLUE_400);
		button1.setForeground (Color.WHITE);
		button2.setBackground (MaterialColors.LIGHT_BLUE_400);
		button2.setForeground (Color.WHITE);
		tb.add (button1);
		tb.addSeparator ();
		tb.add (button2);
		tb.setFloatable (true);
		content.add (tb);

		JScrollPane sp = new JScrollPane (content);
		sp.setHorizontalScrollBarPolicy (JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		sp.setVerticalScrollBarPolicy (JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		JPanel pn = new JPanel ();
		JTabbedPane tp = new JTabbedPane ();
		tp.addTab ("salmon", sp);
		tp.addTab ("chicken", pn);

		frame.add (tp, BorderLayout.CENTER);

		JEditorPane editorPane = new JEditorPane ();
		editorPane.setText ("a-a");
		pn.add (editorPane);

		// make everything visible to the world
		frame.pack ();
		frame.setVisible (true);

	}
}