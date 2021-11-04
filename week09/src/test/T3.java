package test;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class T3 extends JFrame implements ActionListener {
	JLabel jj;
	ImageIcon apple;
	int i =0;
	public T3() {
		setTitle("øπ¡¶");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		
		jj = new JLabel("Testing",JLabel.CENTER);
		JButton jp = new JButton("Click");
		jp1.add(jj);
		jp2.add(jp);
		
		jp.addActionListener(this);
		
		add(jj, BorderLayout.CENTER);
		add(jp2, BorderLayout.SOUTH);
		
		setSize(400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new T3();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		i++;
		jj.setFont(new Font("∞ÌµÒ√º", Font.BOLD, 30));
		jj.setForeground(Color.blue);
		jj.setText(i+ "th Clicks");
	}

}
