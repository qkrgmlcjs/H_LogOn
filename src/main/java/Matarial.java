import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import mdlaf.MaterialLookAndFeel;
import mdlaf.animation.MaterialUIMovement;
import mdlaf.utils.MaterialColors;

public class Matarial extends JFrame{
	private JLabel sumLabel;
	private JCheckBox [] beverage = new JCheckBox [6];
	private String [] names = {"물", "코카콜라", "스프라이트", "오렌지쥬스", "웰치스", "환타파인"};
	
	public void CheckBoxBeverage() {
		setTitle("상품주문");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// configuring a simple JButton
				ImageIcon cokeIcon = new ImageIcon("imgs/코카콜라.jpg");
				JCheckBox coke = new JCheckBox ("COKE", cokeIcon);
				coke.setBackground (MaterialColors.LIGHT_BLUE_400);
				coke.setForeground (Color.WHITE);
				coke.setMaximumSize (new Dimension (200, 200));
				
				ImageIcon spriteIcon = new ImageIcon("imgs/스프라이트.jpg");
				JButton sprite = new JButton ("Sprite");
				sprite.setBackground (MaterialColors.LIGHT_BLUE_400);
				sprite.setForeground (Color.WHITE);
				sprite.setMaximumSize (new Dimension (200, 200));
				
				ImageIcon fantaIcon = new ImageIcon("imgs/환타파인.jpg");
				JButton fanta = new JButton("Fanta");
				fanta.setBackground (MaterialColors.LIGHT_BLUE_400);
				fanta.setForeground (Color.WHITE);
				fanta.setMaximumSize (new Dimension (100, 100));
		
	}
}
