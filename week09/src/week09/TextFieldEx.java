package week09;
import javax.swing.*;
import java.awt.*;

public class TextFieldEx extends JFrame {
	private static final long serialVersionUID = 1L;

	TextFieldEx() {
		setTitle("�ؽ�Ʈ �ʵ� �����  ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		add(new JLabel("�̸� : "));
		add(new JTextField(10));
		add(new JLabel("�а� : "));
		add(new JTextField("��ǻ�� ���а�"));
		add(new JLabel("�ּ� : "));
		add(new JTextField("�ƻ�� ...", 20));
		
		add(new JLabel("id : "));
		add(new JTextField(10));
		add(new JLabel("password : "));
		add(new JPasswordField(10));

		setSize(550,100);
		setVisible(true);
	}

	public static void main(String [] args) {
		new TextFieldEx();
	}
} 
