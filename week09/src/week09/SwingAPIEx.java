package week09;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SwingAPIEx extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	Container contentPane;
	JLabel la;
	JButton b1, b2, b3, b4;

	SwingAPIEx() {
		setTitle("Swing ���� �޼ҵ� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		b1 = new JButton("��ġ�� ũ�� ����");
		b1.addActionListener(this);
		contentPane.add(b1);

		b2 = new JButton("��� ����");
		b2.setOpaque(true);
		b2.setForeground(Color.MAGENTA);
		b2.setBackground(Color.YELLOW);
		b2.setFont(new Font("���ü", Font.ITALIC, 20));
		b2.addActionListener(this);
		contentPane.add(b2);

		b3 = new JButton("�۵����� �ʴ� ��ư");
		b3.setEnabled(false);
		b3.addActionListener(this);
		contentPane.add(b3);

		b4 = new JButton("�����/���̱�");
		b4.addActionListener(this);
		contentPane.add(b4);

		setSize(250,200);
		setVisible(true);
	}
		public void actionPerformed(ActionEvent e) {
			Object source = e.getSource();
			if(source == b1) {
				System.out.println("��ư�� ��ġ�� ũ��");
				System.out.println("��ġ = (" + b1.getX() + "," + b1.getY() + ")");
				System.out.println("ũ�� = (" + b1.getWidth() + "x" 
						+ b1.getHeight() + ")");

				JPanel c = (JPanel)b2.getParent(); 
				System.out.println("����Ʈ���� ��ġ�� ũ��");
				System.out.println("��ġ = (" + c.getX() + "," + c.getY() + ")");
				System.out.println("ũ�� = (" + c.getWidth() + "x" 
						+ c.getHeight() + ")");
			}
			else if(source == b2) {
				System.out.println("��Ʈ = " + b2.getFont());
				System.out.println("���� = " + b2.getBackground());
				System.out.println("���ڻ� = " + b2.getForeground());
			}
			else {
				if(b1.isVisible()) {
						b1.setVisible(false);
						b2.setVisible(false);
						b3.setVisible(false);
				}
				else {
					b1.setVisible(true);
					b2.setVisible(true);
					b3.setVisible(true);
				}
			}
		}

	public static void main(String [] args) {
		new SwingAPIEx();
	}
} 
