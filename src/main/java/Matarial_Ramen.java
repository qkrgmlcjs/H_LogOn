import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

import mdlaf.utils.MaterialColors;

public class Matarial_Ramen {
	public JCheckBox [] Ramen_Check = new JCheckBox [6];
	private String [] Ramen_names = {"Firechicken", "Samyang", "Spicyramen", "KingDDuGGung", "Jin_ramen", "JJapagetti"};
	private ImageIcon [] Ramen_icon = {new ImageIcon("imgs/ºÒ´ßººÀ½¸é.jpg"), new ImageIcon("imgs/»ï¾ç¶ó¸é.jpg"), 
			new ImageIcon("imgs/½Å¶ó¸é.jpg"), new ImageIcon("imgs/¿Õ¶Ñ²±.jpg"), new ImageIcon("imgs/Áø¶ó¸é.jpg"), new ImageIcon("imgs/Â¥ÆÄ°ÔÆ¼.jpg")};

	public void Mataial_Ramen(){
		MyItemListener listener = new MyItemListener();
		for(int i=0; i<Ramen_Check.length; i++) {
			Ramen_Check[i] = new JCheckBox(Ramen_names[i]);
			Ramen_Check[i].setBackground (MaterialColors.LIGHT_BLUE_400);
			Ramen_Check[i].setForeground (Color.WHITE);
			Ramen_Check[i].setMaximumSize (new Dimension (200, 200));
			Ramen_Check[i].setBorderPainted(true);
			//frame.add(beverage[i]);
			Ramen_Check[i].addItemListener(listener);
		}
		for(int i=0; i<Ramen_Check.length; i++) {
			ImageIcon selectedicon = new ImageIcon(Ramen_icon[i]);
			Ramen_Check[i].setSelectedIcon(selectedicon);
		}
	
	}
}
