package week09;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TextAreaEx extends JFrame {
	private static final long serialVersionUID = 1L;
	Container contentPane;
	TextAreaEx() {
		setTitle("�ؽ�Ʈ ���� �����  ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.add(new MyCenterPanel(),
				 BorderLayout.CENTER);
		setSize(280,300);
		setVisible(true);
	}
	class MyCenterPanel extends JPanel {
		private static final long serialVersionUID = 1L;
		JTextField tf;
		JButton btn;
		JTextArea ta;
		MyCenterPanel() {
			tf = new JTextField(20);
			btn = new JButton("�߰�");
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ta.append("\n"+tf.getText());
				}
			});
			ta = new JTextArea("hello", 7, 20);
			add(new JLabel("�Ʒ� â�� ���ڿ��� �Է��ϰ� ��ư�� Ŭ���ϼ���"));
			add(tf);
			add(btn);
			add(new JScrollPane(ta));		
	//		add(ta);	
		}
	}		
	public static void main(String [] args) {
		new TextAreaEx();
	}
} 
