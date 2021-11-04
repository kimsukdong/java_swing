package test;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class T4 extends JFrame implements ActionListener {
	JLabel jj;
	ImageIcon apple,pear;
	JButton b1,b2;
	public T4() {
		setTitle("¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();

		apple = new ImageIcon("images/apple.jpg");
		pear = new ImageIcon("images/pear.jpg");
		jj = new JLabel("Fruits",null,JLabel.CENTER);
		b1 = new JButton("apple");
		b2 = new JButton("pear");
		jp1.add(jj);
		jp2.add(b1);
		jp2.add(b2);

		b1.addActionListener(this);
		b2.addActionListener(this);

		add(jj, BorderLayout.CENTER);
		add(jp2, BorderLayout.SOUTH);

		setSize(400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new T4();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			jj.setFont(new Font("Arial", Font.BOLD, 30));
			jj.setForeground(Color.red);
			jj.setIcon(apple);
			jj.setText("Apple");
		}
		else
		{
			jj.setFont(new Font("Arial", Font.BOLD, 30));
			jj.setForeground(Color.orange);
			jj.setIcon(pear);
			jj.setText("Pear");
		}
	}

}

