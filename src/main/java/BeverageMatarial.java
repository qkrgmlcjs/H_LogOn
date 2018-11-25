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
	public JCheckBox [] beverage = new JCheckBox [6];
	public String [] beveragenames = {"Water", "Coke", "Sprite", "OrangeJuice", "Welchis", "Fanta_pine"};
	public ImageIcon [] beverageicon = {new ImageIcon("c:\\Temp\\²¿±òÄÜ.jpg"), 
			new ImageIcon("c:\\Temp\\ºÒ´ß ¼öÁ¤.jpg"), new ImageIcon("c:\\Temp\\½ºÇÁ¶óÀÌÆ®.jpg"), new ImageIcon("c:\\Temp\\¿À·»ÁöÁê½º.jpg"), 
			new ImageIcon("c:\\Temp\\À£Ä¡½º.jpg"), new ImageIcon("c:\\Temp\\È¯Å¸ÆÄÀÎ.jpg")};
	
	

	public void Set_bev_CheckBox(){
		MyItemListener listener = new MyItemListener();
		
		for(int i=0; i<beverage.length; i++) {
			beverage[i] = new JCheckBox(beveragenames[i], beverageicon[i], false);
			beverage[i].setBackground (MaterialColors.LIGHT_BLUE_400);
			beverage[i].setForeground (Color.WHITE);
			beverage[i].setMaximumSize (new Dimension (200, 200));
			beverage[i].setBorderPainted(true);
			beverage[i].addItemListener(listener);
			beverage[i].setSelectedIcon(beverageicon[i]);
		}
	}
}

