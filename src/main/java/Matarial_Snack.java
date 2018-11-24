import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

import mdlaf.utils.MaterialColors;

public class Matarial_Snack {
	public JCheckBox [] Snack_Check = new JCheckBox [6];
	private String [] Snack_names = {"������", "�ٳ���ű", "�����", "��Ĩ", "�����۽�", "Ĩ������"};
	private String [] Snack_icon = {"imgs/��Į��.jpg", "imgs/�ٳ���ű.jpg", "imgs/�����.jpg", "imgs/��Ĩ.jpg", "imgs/�����۽�.jpg", "imgs/Ĩ������.jpg"};

	
	
	public void Matarial_snack() {
		
		MyItemListener listener = new MyItemListener();
		for(int i=0; i<Snack_Check.length; i++) {
			Snack_Check[i] = new JCheckBox(Snack_names[i]);
			Snack_Check[i].setBackground (MaterialColors.LIGHT_BLUE_400);
			Snack_Check[i].setForeground (Color.WHITE);
			Snack_Check[i].setMaximumSize (new Dimension (200, 200));
			Snack_Check[i].setBorderPainted(true);
			//frame.add(beverage[i]);
			Snack_Check[i].addItemListener(listener);
		}
		for(int i=0; i<Snack_Check.length; i++) {
			ImageIcon selectedicon = new ImageIcon(Snack_names[i]);
			Snack_Check[i].setSelectedIcon(selectedicon);
		}
	}
}


