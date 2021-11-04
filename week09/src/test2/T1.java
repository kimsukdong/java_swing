package test2;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class T1 extends JFrame{
	T1(){
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jp = new JPanel();

		jp.setLayout(new FlowLayout());

		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배", true);
		JCheckBox cherry = new JCheckBox("체리");

		jp.add(apple);
		jp.add(pear);
		jp.add(cherry);
		add(jp);

		setSize(250,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new T1();
	}

}
