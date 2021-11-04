package test;

import java.awt.*;

import javax.swing.*;

public class T2 extends JFrame{

	public T2() {
		setTitle("¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		
		JLabel jj = new JLabel("Testing",JLabel.CENTER);
		JButton jp = new JButton("Click");
		jp1.add(jj);
		jp2.add(jp);
		
		add(jj, BorderLayout.CENTER);
		add(jp2, BorderLayout.SOUTH);
		
		setSize(400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new T2();
	}

}
