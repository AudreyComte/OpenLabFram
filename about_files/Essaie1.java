package about_files;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.CompoundBorder;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class Essaie1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Essaie1 frame = new Essaie1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Essaie1() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(200, 200, 860, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new CompoundBorder());

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(64, 84, 99, 26);
		contentPane.add(btnNewButton);
	}
}
