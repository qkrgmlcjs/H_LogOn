import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

//import BeverageMatarial.MyItemListener;
import mdlaf.utils.MaterialColors;

public class BeverageMatarial extends JFrame{
	JCheckBox [] beverage = new JCheckBox [6];
	public String [] beveragenames = {"Water", "Coke", "Sprite", "OrangeJuice", "Welchis", "Fanta_pine"};
	private ImageIcon [] beverageicon = {new ImageIcon("imgs/물.jpg"), 
			new ImageIcon("imgs/코카콜라.jpg"), new ImageIcon("imgs/스프라이트.jpg"), new ImageIcon("imgs/오렌지쥬스.jpg"), 
			new ImageIcon("imgs/웰치스.jpg"), new ImageIcon("imgs/환타파인.jpg")};
	
	
	public  BeverageMatarial(){
		MyItemListener listener = new MyItemListener();
		for(int i=0; i<beverage.length; i++) {
			beverage[i] = new JCheckBox(beveragenames[i],beverageicon[i]);
			beverage[i].setBackground (MaterialColors.LIGHT_BLUE_400);
			beverage[i].setForeground (Color.WHITE);
			//beverage[i].setMaximumSize (new Dimension (200, 200));
			beverage[i].setBorderPainted(true);
			beverage[i].addItemListener(listener);
		}
		for(int i=0; i<beverage.length; i++) {
			ImageIcon selectedicon = new ImageIcon();
			beverage[i].setSelectedIcon(selectedicon);
		}
	}
}

