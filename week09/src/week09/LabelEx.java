package week09;
import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame {
	private static final long serialVersionUID = 1L;
	Container contentPane;
	LabelEx() {
		setTitle("���̺� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		JLabel textLabel = new JLabel("����մϴ�.");
		ImageIcon beauty = new ImageIcon("images/beauty.jpg");
		JLabel imageLabel = new JLabel(beauty);
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
		JLabel label = new JLabel("��������� ��ȭ�ϼ���", normalIcon, SwingConstants.LEFT);

		contentPane.add(textLabel);
		contentPane.add(imageLabel);
		contentPane.add(label);

		setSize(400,600);
		setVisible(true);
	}
	public static void main(String [] args) {
		new LabelEx();
	} 
} 
