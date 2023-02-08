package about_files;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Menu extends JFrame {
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setBackground(new Color(0, 0, 0));
		setTitle("OpenLabFrame");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Audrey\\eclipse-workspace\\Audrey\\res\\logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 311);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
	
		
		// Panel North //
		
		JPanel panel_North = new JPanel();
		panel_North.setToolTipText("Accueil");
		contentPane.add(panel_North, BorderLayout.NORTH);
		panel_North.setLayout(new GridLayout(4, 1, 0, 0));
				
				
		// Panel Center //
		
		JPanel panel_Center = new JPanel();
		contentPane.add(panel_Center, BorderLayout.CENTER);
		panel_Center.setLayout(new GridLayout(0, 1, 0, 50));
		
		
		// Panel West //
		
		JPanel panel_West = new JPanel();
		contentPane.add(panel_West, BorderLayout.WEST);
		panel_West.setLayout(new FlowLayout(FlowLayout.CENTER, 80, 5));
			
		
		// Panel East //
		
		JPanel panel_East = new JPanel();
		FlowLayout fl_panel_East = (FlowLayout) panel_East.getLayout();
		fl_panel_East.setHgap(80);
		contentPane.add(panel_East, BorderLayout.EAST);
		
		
		// Panel South //
		
		JPanel panel_South = new JPanel();
		FlowLayout fl_panel_South = (FlowLayout) panel_South.getLayout();
		fl_panel_South.setVgap(30);
		fl_panel_South.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_South, BorderLayout.SOUTH);
			
		
		// Label Menu //
		
		JLabel lblLabel_Menu = new JLabel("Menu");
		lblLabel_Menu.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLabel_Menu.setToolTipText("");
		lblLabel_Menu.setHorizontalAlignment(SwingConstants.CENTER);
		panel_North.add(lblLabel_Menu);		
		
		
		// Button New Project //
		
		JButton btnButton_New_Project = new JButton("New project");
		
		btnButton_New_Project.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				New_project nw = new New_project();
				nw.NewProject();
			}
		});
		panel_Center.add(btnButton_New_Project);
		
		
		// Button Open Project //
		
		JButton btnButton_Open_Project = new JButton("Open project");
		panel_Center.add(btnButton_Open_Project);
		
		
		// Button Checkout //
		
		JButton btnButton_Checkout = new JButton("Check out");
		btnButton_Checkout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
					}
				});
		panel_South.add(btnButton_Checkout);
					
		
	}

}
