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
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.CardLayout;
import javax.swing.JEditorPane;
import javax.swing.DropMode;
import java.awt.SystemColor;

public class Camera extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void Camera1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Camera frame = new Camera();
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
	public Camera() {
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
				
		JLabel lblLabel_Camera = new JLabel("Camera");
		lblLabel_Camera.setToolTipText("");
		panel_North.add(lblLabel_Camera);
				
				
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
						
						
		// Panel Resolution //
						
		JPanel panel_Resolution = new JPanel();
		panel_West.add(panel_Resolution);
		panel_Resolution.setLayout(new GridLayout(2, 1, 0, 0));
						
						
		JLabel lblLabel_Resolution = new JLabel("Resolution");
		panel_Resolution.add(lblLabel_Resolution);
						
		String [] message_Resolution = {"1280x720 p", "1920x1080 p", "3840x2160 p", "7680x4320 p"};
		JComboBox comboBox_Resolution = new JComboBox(message_Resolution);
		panel_Resolution.add(comboBox_Resolution);
						
						
		// Panel Objective //
						
		JPanel panel_Objective = new JPanel();
		panel_West.add(panel_Objective);
		panel_Objective.setLayout(new GridLayout(2, 1, 0, 0));
						
		JLabel lblLabel_Objective = new JLabel("Objective");
		panel_Objective.add(lblLabel_Objective);
						
		String [] message_Objective = {"4X", "10X", "20X", "40X", "60X", "100X"};
		JComboBox comboBox_Objective = new JComboBox(message_Objective);
		panel_Objective.add(comboBox_Objective);
						
						
		// Panel Number of image/well //
						
		JPanel panel_Number_of_image = new JPanel();
		panel_West.add(panel_Number_of_image);
		panel_Number_of_image.setLayout(new GridLayout(2, 1, 0, 0));
						
		JLabel lblLabel_Number_of_image = new JLabel("Number of image/well");
		panel_Number_of_image.add(lblLabel_Number_of_image);
						
		String [] message_Number_of_image = {"1", "2", "3", "4", "5"};
		JComboBox comboBox_Number_of_image = new JComboBox(message_Number_of_image);
		panel_Number_of_image.add(comboBox_Number_of_image);
				
	}

}
