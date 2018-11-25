import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

import mdlaf.utils.MaterialColors;

public class Matarial_Snack {
	public JCheckBox [] Snack_Check = new JCheckBox [6];
	public String [] Snack_names = {"GGoggalcon", "bananaKick", "SaewooGGang", "Conchip", "Pringles", "ChipPotato"};
	private ImageIcon [] Snack_icon = {new ImageIcon("imgs/꼬칼콘.jpg"), new ImageIcon("imgs/바나나킥.jpg"), 
			new ImageIcon("imgs/새우깡.jpg"), new ImageIcon("imgs/콘칩.jpg"), new ImageIcon("imgs/프링글스.jpg"), 
			new ImageIcon("imgs/칩포테토.jpg")};

	
	
	public void Set_sna_CheckBox() {
		
		MyItemListener listener = new MyItemListener();
		for(int i=0; i<Snack_Check.length; i++) {
			Snack_Check[i] = new JCheckBox(Snack_names[i],Snack_icon[i]);
			Snack_Check[i].setBackground (MaterialColors.LIGHT_BLUE_400);
			Snack_Check[i].setForeground (Color.WHITE);
			Snack_Check[i].setMaximumSize (new Dimension (200, 200));
			Snack_Check[i].setBorderPainted(true);
			//frame.add(beverage[i]);
			Snack_Check[i].addItemListener(listener);
		}
		/*
		for(int i=0; i<Snack_Check.length; i++) {
			ImageIcon selectedicon = new ImageIcon(Snack_names[i]);
			Snack_Check[i].setSelectedIcon(selectedicon);
		}
		*/
	}
}


