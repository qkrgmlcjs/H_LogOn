import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import mdlaf.utils.MaterialColors;

public class Matarial extends JFrame{
	private JLabel sumLabel;
	private JCheckBox [] beverage = new JCheckBox [6];
	private String [] beveragenames = {"��", "��ī�ݶ�", "��������Ʈ", "�������꽺", "��ġ��", "ȯŸ����"};
	private String [] beverageicon = {"imgs/��.jpg", "imgs/��ī�ݶ�.jpg", "imgs/��������Ʈ.jpg", "imgs/�������꽺.jpg", "imgs/��ġ��.jpg", "imgs/ȯŸ����.jpg"};
	
	public void CheckBoxBeverage() {
		JFrame frame = new JFrame ("Material Design UI for Swing by atharva washimkar");
		frame.setMinimumSize (new Dimension (600, 400));
		setTitle("��ǰ�ֹ�");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//MyItemListener listener = new MyItemLister();
		for(int i=0; i<beverage.length; i++) {
			beverage[i] = new JCheckBox(beveragenames[i]);
			beverage[i].setBackground (MaterialColors.LIGHT_BLUE_400);
			beverage[i].setForeground (Color.WHITE);
			beverage[i].setMaximumSize (new Dimension (200, 200));
			beverage[i].setBorderPainted(true);
			frame.add(beverage[i]);
			beverage[i].addItemListener(listener);
		}
		for(int i=0; i<beverage.length; i++) {
			ImageIcon selectedicon = new ImageIcon(beverageicon[i]);
			beverage[i].setSelectedIcon(selectedicon);
		}
		sumLabel = new JLabel("���� 0�� �Դϴ�.");
		frame.add(sumLabel);
		setSize(250,200);
		setVisible(true);
	}
		
	}

