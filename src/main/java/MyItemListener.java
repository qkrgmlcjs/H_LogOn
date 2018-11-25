import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.AbstractButton;

public class MyItemListener implements ItemListener {
	public int sum=0;
	public AbstractButton sumLabel;
	
	BeverageMatarial BM = new BeverageMatarial();
	Matarial_Ramen MR = new Matarial_Ramen();
	Matarial_Snack MS = new Matarial_Snack();
	public void itemStateChange(ItemEvent e) {
		if(e.getStateChange()==ItemEvent.SELECTED) {
			if(e.getItem()==BM.beveragenames[0])
				sum+=800;
			else if(e.getItem()==BM.beveragenames[1])
				sum+=1000;
			else if(e.getItem()==BM.beveragenames[2])
				sum+=1000;
			else if(e.getItem()==BM.beveragenames[3])
				sum+=2000;
			else if(e.getItem()==BM.beveragenames[4])
				sum+=1300;
			else if(e.getItem()==BM.beveragenames[5])
				sum+=1200;
			else if(e.getItem()==MR.Ramen_names[0])
				sum+=1400;
			else if(e.getItem()==MR.Ramen_names[1])
				sum+=1050;
			else if(e.getItem()==MR.Ramen_names[2])
				sum+=1050;
			else if(e.getItem()==MR.Ramen_names[3])
				sum+=1050;
			else if(e.getItem()==MR.Ramen_names[4])
				sum+=1400;
			else if(e.getItem()==MR.Ramen_names[5])
				sum+=1050;
			else if(e.getItem()==MS.Snack_names[0])
				sum+=1100;
			else if(e.getItem()==MS.Snack_names[1])
				sum+=1100;
			else if(e.getItem()==MS.Snack_names[2])
				sum+=1000;
			else if(e.getItem()==MS.Snack_names[3])
				sum+=1100;
			else if (e.getItem()==MS.Snack_names[4])
				sum+=2000;
			else 
				sum+=1200;
			
			
		}
		else {
			if(e.getItem()==BM.beveragenames[0])
				sum-=800;
			else if(e.getItem()==BM.beveragenames[1])
				sum-=1000;
			else if(e.getItem()==BM.beveragenames[2])
				sum-=1000;
			else if(e.getItem()==BM.beveragenames[3])
				sum-=2000;
			else if(e.getItem()==BM.beveragenames[4])
				sum-=1300;
			else if (e.getItem()==BM.beveragenames[5])
				sum-=1200;
			else if(e.getItem()==MR.Ramen_names[0])
				sum-=1400;
			else if(e.getItem()==MR.Ramen_names[1])
				sum-=1050;
			else if(e.getItem()==MR.Ramen_names[2])
				sum-=1050;
			else if(e.getItem()==MR.Ramen_names[3])
				sum-=1050;
			else if(e.getItem()==MR.Ramen_names[4])
				sum-=1400;
			else if(e.getItem()==MR.Ramen_names[5])
				sum-=1050;
			else if(e.getItem()==MS.Snack_names[0])
				sum-=1100;
			else if(e.getItem()==MS.Snack_names[1])
				sum-=1100;
			else if(e.getItem()==MS.Snack_names[2])
				sum-=1000;
			else if(e.getItem()==MS.Snack_names[3])
				sum-=1100;
			else if (e.getItem()==MS.Snack_names[4])
				sum-=2000;
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
