import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import mdlaf.MaterialLookAndFeel;
import mdlaf.animation.MaterialUIMovement;
import mdlaf.utils.MaterialColors;

public class Matarial extends JFrame{
	private JLabel sumLabel;
	private JCheckBox [] beverage = new JCheckBox [6];
	private String [] names = {"��", "��ī�ݶ�", "��������Ʈ", "�������꽺", "��ġ��", "ȯŸ����"};
	
	public void CheckBoxBeverage() {
		setTitle("��ǰ�ֹ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// configuring a simple JButton
				ImageIcon cokeIcon = new ImageIcon("imgs/��ī�ݶ�.jpg");
				JCheckBox coke = new JCheckBox ("COKE", cokeIcon);
				coke.setBackground (MaterialColors.LIGHT_BLUE_400);
				coke.setForeground (Color.WHITE);
				coke.setMaximumSize (new Dimension (200, 200));
				
				ImageIcon spriteIcon = new ImageIcon("imgs/��������Ʈ.jpg");
				JButton sprite = new JButton ("Sprite");
				sprite.setBackground (MaterialColors.LIGHT_BLUE_400);
				sprite.setForeground (Color.WHITE);
				sprite.setMaximumSize (new Dimension (200, 200));
				
				ImageIcon fantaIcon = new ImageIcon("imgs/ȯŸ����.jpg");
				JButton fanta = new JButton("Fanta");
				fanta.setBackground (MaterialColors.LIGHT_BLUE_400);
				fanta.setForeground (Color.WHITE);
				fanta.setMaximumSize (new Dimension (100, 100));
		
	}
}
