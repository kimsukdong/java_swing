package test;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
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
		JLabel textLabel = new JLabel("사랑합니다.");
		ImageIcon apple = new ImageIcon("images/apple.jpg");
		JLabel imageLabel = new JLabel(apple);
		JLabel label = new JLabel("사랑합니다.",apple,JLabel.CENTER);
		JButton jb = new JButton("Click");

		jp.add(textLabel);
		jp.add(imageLabel);
		jp.add(jb);
		add(jp);

		setSize(300,600);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new T1();
	}

}
