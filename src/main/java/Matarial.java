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
	private String [] beveragenames = {"물", "코카콜라", "스프라이트", "오렌지쥬스", "웰치스", "환타파인"};
	private String [] beverageicon = {"imgs/물.jpg", "imgs/코카콜라.jpg", "imgs/스프라이트.jpg", "imgs/오렌지쥬스.jpg", "imgs/웰치스.jpg", "imgs/환타파인.jpg"};
	
	public void CheckBoxBeverage() {
		JFrame frame = new JFrame ("Material Design UI for Swing by atharva washimkar");
		frame.setMinimumSize (new Dimension (600, 400));
		setTitle("상품주문");
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
		sumLabel = new JLabel("현재 0원 입니다.");
		frame.add(sumLabel);
		setSize(250,200);
		setVisible(true);
	}
		
	}

