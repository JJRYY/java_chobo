package java_chobo.ch07.anonymous;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MyFrame() {
		setTitle("첫 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JButton btn = new JButton("버튼");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "버튼을 눌렀습니다.");
			}
		});
		contentPane.add(btn, BorderLayout.CENTER);

		JButton btnNorth = new JButton("상건");
		btnNorth.addActionListener(new EventHandler());
		contentPane.add(btnNorth, BorderLayout.NORTH);

		JButton btnSouth = new JButton("반장");
		btnSouth.addActionListener(new EventHandler());
		contentPane.add(btnSouth, BorderLayout.SOUTH);
	}

	class EventHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "상건아~~");
		}

	}
} // end of class
