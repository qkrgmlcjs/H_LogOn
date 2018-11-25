import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.AbstractButton;

public class MyItemListener implements ItemListener {
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
			else if(e.getItem()==beveragenames[5])
				sum+=1200;
			else if(e.getItem()==Ramen_names[0])
				sum+=1400;
			else if(e.getItem()==Ramen_names[1])
				sum+=1050;
			else if(e.getItem()==Ramen_names[2])
				sum+=1050;
			else if(e.getItem()==Ramen_names[3])
				sum+=1050;
			else if(e.getItem()==Ramen_names[4])
				sum+=1400;
			else if(e.getItem()==Ramen_names[5])
				sum+=1050;
			
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
		sumLabel.setText("현재 " + sum + "원 입니다.");	
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
}
