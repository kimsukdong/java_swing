package test2;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class T2 extends JFrame implements ItemListener{
	JCheckBox apple,pear,cherry;
	int sum=0;
	JLabel sumLabel;
	T2(){
		setTitle("���̺� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jp = new JPanel();

		jp.setLayout(new FlowLayout());

		jp.add(new JLabel("���  100��, �� 500��, ü�� 20000��"));

		apple = new JCheckBox("���");
		pear = new JCheckBox("��");
		cherry = new JCheckBox("ü��");

		apple.addItemListener(this);
		pear.addItemListener(this);
		cherry.addItemListener(this);
		sumLabel= new JLabel("���� "+sum+"�� �Դϴ�.");

		jp.add(apple);
		jp.add(pear);
		jp.add(cherry);
		jp.add(sumLabel);
		add(jp);


		setSize(250,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new T2();
	}

	public void itemStateChanged(ItemEvent e) {
		int selected=1;
		if(e.getStateChange() == ItemEvent.SELECTED)
			selected = 1;
		else
			selected = -1;
		if(e.getItem() == apple) 
			sum = sum + selected*100;
		else if(e.getItem() == pear) 
			sum = sum + selected*500;
		else
			sum = sum + selected*20000;

		sumLabel.setText("���� "+sum+"�� �Դϴ�.");
	}

}
