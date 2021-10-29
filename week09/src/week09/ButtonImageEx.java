package week09;

import javax.swing.*;
import java.awt.*;

public class ButtonImageEx extends JFrame {
	private static final long serialVersionUID = 1L;
	Container contentPane;
	ButtonImageEx() {
		setTitle("��ư�� ������ �ޱ� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout()); 

		ImageIcon normalIcon = new 
				ImageIcon("images/normalIcon.gif");
		ImageIcon rolloverIcon = new 
				ImageIcon("images/rolloverIcon.gif");
		ImageIcon pressedIcon = new 
				ImageIcon("images/pressedIcon.gif");
		
		JButton btn = new JButton("call~~", normalIcon);
		btn.setRolloverIcon(rolloverIcon);
		btn.setPressedIcon(pressedIcon);
		contentPane.add(btn);

		setSize(250,200);
		setVisible(true);
	}
	public static void main(String [] args) {
		new ButtonImageEx();
	}
} 
