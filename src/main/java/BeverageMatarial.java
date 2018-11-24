import java.awt.Color;
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
	private JLabel sumLabel;
	private JCheckBox [] beverage = new JCheckBox [6];
	private String [] beveragenames = {"��", "��ī�ݶ�", "��������Ʈ", "�������꽺", "��ġ��", "ȯŸ����"};
	private ImageIcon [] beverageicon = {new ImageIcon("imgs/��.jpg"), 
			new ImageIcon("imgs/��ī�ݶ�.jpg"), new ImageIcon("imgs/��������Ʈ.jpg"), new ImageIcon("imgs/�������꽺.jpg"), 
			new ImageIcon("imgs/��ġ��.jpg"), new ImageIcon("imgs/ȯŸ����.jpg")};
	
	public void CheckBoxBeverage(){
		MyItemListener listener = new MyItemListener();
		for(int i=0; i<beverage.length; i++) {
			beverage[i] = new JCheckBox(beveragenames[i]);
			beverage[i].setBackground (MaterialColors.LIGHT_BLUE_400);
			beverage[i].setForeground (Color.WHITE);
			beverage[i].setMaximumSize (new Dimension (200, 200));
			beverage[i].setBorderPainted(true);
			beverage[i].addItemListener(listener);
		}
		for(int i=0; i<beverage.length; i++) {
			ImageIcon selectedicon = new ImageIcon();
			beverage[i].setSelectedIcon(selectedicon);
		}
	}
}
class MyItemListener implements ItemListener{
	public int sum=0;
	public Object[] beveragenames;
	public AbstractButton sumLabel;
	public void itemStateChange(ItemEvent e) {
		if(e.getStateChange()==ItemEvent.SELECTED) {
			if(e.getItem()==beveragenames[0])
				sum+=800;
			else if(e.getItem()==beveragenames[1])
				sum+=1000;
			else if(e.getItem()==beveragenames[2])
				sum+=1000;
			else if(e.getItem()==beveragenames[3])
				sum+=2000;
			else if(e.getItem()==beveragenames[4])
				sum+=1300;
			else
				sum+=1200;
		}
		else {
			if(e.getItem()==beveragenames[0])
				sum-=800;
			else if(e.getItem()==beveragenames[1])
				sum-=1000;
			else if(e.getItem()==beveragenames[2])
				sum-=1000;
			else if(e.getItem()==beveragenames[3])
				sum-=2000;
			else if(e.getItem()==beveragenames[4])
				sum-=1300;
			else
				sum-=1200;
		}
		sumLabel.setText("���� " + sum + "�� �Դϴ�.");	
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
