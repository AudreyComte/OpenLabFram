package about_files;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;

public class Syringe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void Syringe1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Syringe frame = new Syringe();
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
	public Syringe() {
		setBackground(new Color(0, 0, 0));
		setTitle("OpenLabFrame");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Audrey\\eclipse-workspace\\Audrey\\res\\logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
		// Panel North //
		
		JPanel panel_North = new JPanel();
		contentPane.add(panel_North, BorderLayout.NORTH);
		panel_North.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 15));
		
		JLabel lblLabel_Syringe = new JLabel("Syringe");
		lblLabel_Syringe.setToolTipText("");
		panel_North.add(lblLabel_Syringe);
		
		
		// Panel South //
		JPanel panel_South = new JPanel();
		contentPane.add(panel_South, BorderLayout.SOUTH);
		panel_South.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 20));
								
		JPanel panel = new JPanel();
		panel_South.add(panel);
		panel.setLayout(new GridLayout(0, 2, 275, 0));
				
				
		// Button Back //
				
		JButton btnButton_Back = new JButton("Back");
		btnButton_Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();	
			}
		});
		panel.add(btnButton_Back);
		
		
		// Button Save //
				
		JButton btnButton_Save = new JButton("Save");
		panel.add(btnButton_Save);
		
		
		// Panel West //
		
		JPanel panel_West = new JPanel();
		contentPane.add(panel_West, BorderLayout.WEST);
		panel_West.setLayout(new GridLayout(3, 1, 0, 15));
				
				
		// Panel Type of syringe //
				
		JPanel panel_Type_of_syringe = new JPanel();
		panel_West.add(panel_Type_of_syringe);
		panel_Type_of_syringe.setLayout(new GridLayout(2, 1, 0, 0));
				
				
		JLabel lblLabel_Type_of_syringe = new JLabel("Type of syringe");
		panel_Type_of_syringe.add(lblLabel_Type_of_syringe);
				
		String [] message_type_of_syringe = {"2 ml syringe", "5 ml syringe", "10 ml syringe", "20 ml syringe", "50 ml syringe"};
		JComboBox comboBox_Type_of_syringe = new JComboBox(message_type_of_syringe);
		panel_Type_of_syringe.add(comboBox_Type_of_syringe);
				
				
		// Panel Dispensed volume //
				
		JPanel panel_Dispensed_volume = new JPanel();
	    panel_West.add(panel_Dispensed_volume);
		panel_Dispensed_volume.setLayout(new GridLayout(2, 1, 0, 0));
				
		JLabel lblLabel_Dispensed_volume = new JLabel("Dispensed volume");
		panel_Dispensed_volume.add(lblLabel_Dispensed_volume);
				
		String [] message_Dispensed_volume = {"0.5 ml", "1 ml", "2 ml", "3 ml", "4 ml", "5 ml", "10 ml"};
		JComboBox comboBox_Dispensed_volume = new JComboBox(message_Dispensed_volume);
		panel_Dispensed_volume.add(comboBox_Dispensed_volume);
				
				
		// Panel Number of injection //
				
		JPanel panel_Injection = new JPanel();
		panel_West.add(panel_Injection);
		panel_Injection.setLayout(new GridLayout(2, 1, 0, 0));
				
		JLabel lblLabel_Injection = new JLabel("Number of injection");
		panel_Injection.add(lblLabel_Injection);
				
		String [] message_Injection = {"1", "2", "3", "4", "5"};
		JComboBox comboBox_Injection = new JComboBox(message_Injection);
		panel_Injection.add(comboBox_Injection);
		
	}

}
