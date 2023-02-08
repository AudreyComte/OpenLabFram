package about_files;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import org.eclipse.swt.graphics.Image;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Choice;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.JEditorPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import arduino.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import about_files.Manip;
import about_files.Field;
import about_files.Controller;
import about_files.Head;
import about_files.Save_info;
import about_files.Coordinate_Field;
import about_files.Coordinate_Frame;
import about_files.Event;
import javax.swing.UIManager;




public class Plate_design extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void PlateDesign() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Plate_design frame = new Plate_design();
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
	public Plate_design() {
		setBackground(new Color(0, 0, 0));
		setTitle("OpenLabFrame");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Audrey\\eclipse-workspace\\Audrey\\res\\logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 623, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(2, 3));
		
		
		// Panel North //
		
		JPanel panel_North = new JPanel();
		FlowLayout fl_panel_North = (FlowLayout) panel_North.getLayout();
		fl_panel_North.setVgap(15);
		fl_panel_North.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_North, BorderLayout.NORTH);
		
		
		// Label Plate Design //
		
		JLabel lblLabel_Plate_Design = new JLabel("Plate Design");
		panel_North.add(lblLabel_Plate_Design);
		
		
		// Panel South //
		
		JPanel panel_South = new JPanel();
		contentPane.add(panel_South, BorderLayout.SOUTH);
		panel_South.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 20));
						
		JPanel panel = new JPanel();
		panel_South.add(panel);
		panel.setLayout(new GridLayout(0, 4, 100, 0));
		
		
		// Button Back //
		
		JButton btnButton_Back = new JButton("Back");
		btnButton_Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();	
			}
		});
		panel.add(btnButton_Back);
		
		
		// Button G0x10 //
		
		/*JButton btnG0x10 = new JButton("G0x10");
		btnG0x10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileWriter file = new FileWriter("G0x10.txt");
					BufferedWriter output = new BufferedWriter(file);
					String Info = "$h";
					output.write(Info);
				    output.close();
				    
				} catch (IOException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				}
			Arduino arduino1 = new Arduino("COM4");
			arduino1.openConnection();
			String commande= "";
			arduino1.serialWrite(commande);
			arduino1.closeConnection();
			}
				/*String cmd= "C:\\Users\\Audrey\\Desktop\\win64-ugs-platform-app-2.0.13 (1)\\ugsplatform-win\\bin\\ugsplatform.exe";
				try {
				Runtime r = Runtime.getRuntime();
				Process p = r.exec(cmd);
				p.waitFor();
				}catch(Exception g) {
				System.out.println("erreur d'execution " + cmd + g.toString());
				}*/
				
		//});
		//panel.add(btnG0x10);//
				
				
		
		
		
		
		
		// Panel West //
		
				JPanel panel_West = new JPanel();
				contentPane.add(panel_West, BorderLayout.WEST);
				panel_West.setLayout(new GridLayout(5, 1, 0, 15));
				
				
				// Panel Type of plate //
				
				JPanel panel_Type_of_plate = new JPanel();
				panel_West.add(panel_Type_of_plate);
				panel_Type_of_plate.setLayout(new GridLayout(2, 1, 0, 0));
				
				JLabel lblLabel_Type_of_plate = new JLabel("Type of plate");
				panel_Type_of_plate.add(lblLabel_Type_of_plate);
				
				String [] message_type_of_well = {"6 well plate"};// ,"12 well plate", "24 well plate", "48 well plate", "96 well plate"//};
				JComboBox comboBox_Type_of_plate = new JComboBox(message_type_of_well);
				/* comboBox_Type_of_plate.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if ((comboBox_Type_of_plate.getSelectedItem().toString())== "6 well plate")
						{lblLabel_Plate_plan.setIcon(new ImageIcon("C:\\Users\\Audrey\\eclipse-workspace\\Audrey\\res\\6 well plate.png"));
						
						}
						if ((comboBox_Type_of_plate.getSelectedItem().toString())== "12 well plate")
						{lblLabel_Plate_plan.setIcon(new ImageIcon("C:\\Users\\Audrey\\eclipse-workspace\\Audrey\\res\\12 well plate.png"));
						}
						if ((comboBox_Type_of_plate.getSelectedItem().toString())== "24 well plate")
						{lblLabel_Plate_plan.setIcon(new ImageIcon("C:\\Users\\Audrey\\eclipse-workspace\\Audrey\\res\\24 well plate.png"));
						}
						if ((comboBox_Type_of_plate.getSelectedItem().toString())== "48 well plate")
						{lblLabel_Plate_plan.setIcon(new ImageIcon("C:\\Users\\Audrey\\eclipse-workspace\\Audrey\\res\\48 well plate.png"));
						}
						if ((comboBox_Type_of_plate.getSelectedItem().toString())== "96 well plate")
						{lblLabel_Plate_plan.setIcon(new ImageIcon("C:\\Users\\Audrey\\eclipse-workspace\\Audrey\\res\\96 well plate.png"));
						}
					}
				}); */
				
				
				panel_Type_of_plate.add(comboBox_Type_of_plate);
				
				
				
				// Panel First well //
				
				JPanel panel_First_well = new JPanel();
				panel_West.add(panel_First_well);
				panel_First_well.setLayout(new GridLayout(2, 1, 0, 0));
				
				JLabel lblLabel_First_well = new JLabel("First well");
				panel_First_well.add(lblLabel_First_well);
				
				String [] message_First_well = {"A1", "A2", "A3", "B1", "B2", "B3"};
				JComboBox comboBox_First_well = new JComboBox(message_First_well);
				panel_First_well.add(comboBox_First_well);
				
				
				// Panel Last well //
				
				JPanel panel_Last_well = new JPanel();
				panel_West.add(panel_Last_well);
				panel_Last_well.setLayout(new GridLayout(2, 1, 0, 0));
				
				JLabel lblLabel_Last_well = new JLabel("Last well");
				panel_Last_well.add(lblLabel_Last_well);
				
				String [] message_Last_well = {"A1", "A2", "A3", "B1", "B2", "B3"};
				JComboBox comboBox_Last_well = new JComboBox(message_Last_well);
				panel_Last_well.add(comboBox_Last_well);
				
				
				// Panel Reading direction //
				
				JPanel panel_Reading_direction = new JPanel();
				panel_West.add(panel_Reading_direction);
				panel_Reading_direction.setLayout(new GridLayout(2, 1, 0, 0));
				
				JLabel lblLabel_Reading_direction = new JLabel("Reading direction");
				panel_Reading_direction.add(lblLabel_Reading_direction);
				
				String [] message_reading_direction = {"Rows by rows", "Columns by columns"};
				JComboBox comboBox_Reading_direction = new JComboBox(message_reading_direction);
				panel_Reading_direction.add(comboBox_Reading_direction);
				
				
				// Panel Time //
				
				JPanel panel_Time = new JPanel();
				panel_West.add(panel_Time);
				panel_Time.setLayout(new GridLayout(2, 1, 0, 0));
				
				JLabel lblLabel_Time = new JLabel("Time");
				panel_Time.add(lblLabel_Time);
				
				String [] message_Time = {"2", "10"};
				JComboBox comboBox_Time = new JComboBox(message_Time);
				panel_Time.add(comboBox_Time);
				System.out.println(comboBox_Time.getSelectedItem().toString());
		
		
	
		// Panel Center //
		
		JPanel panel_Center = new JPanel();
		contentPane.add(panel_Center, BorderLayout.CENTER);
		panel_Center.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_Center.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(2, 3, 0, 0));
		
		// Création de la liste data //
		ArrayList<String> data = new ArrayList<String>();
		
		
		//  Création d'un objet de la classe Manip //
		Manip essaiManip = new Manip (comboBox_First_well.getName(), comboBox_Last_well.getName(), 
                comboBox_Reading_direction.getName(),comboBox_Time.getSelectedItem().toString(),data);
		
		
		// Button A1 //
		JButton btnButton_A1 = new JButton("A1");
		btnButton_A1.setBackground(Color.LIGHT_GRAY);
		btnButton_A1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btnButton_A1.getBackground()== Color.LIGHT_GRAY){
					data.add(btnButton_A1.getText());
					btnButton_A1.setBackground(Color.CYAN);
				}
				else {
					btnButton_A1.setBackground(Color.LIGHT_GRAY);
					data.remove(btnButton_A1.getText());
				}    
			}
		});
		btnButton_A1.setHorizontalAlignment(SwingConstants.CENTER);
		Border border = BorderFactory.createLineBorder(Color.GRAY, 2);
		btnButton_A1.setBorder(border);
		panel_1.add(btnButton_A1);
		
		
		// Button A2 //
		
		JButton btnButton_A2 = new JButton("A2");
		btnButton_A2.setBackground(Color.LIGHT_GRAY);
		btnButton_A2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btnButton_A2.getBackground()== Color.LIGHT_GRAY){
					data.add(btnButton_A2.getText());
					btnButton_A2.setBackground(Color.CYAN);
				}
				else {
					btnButton_A2.setBackground(Color.LIGHT_GRAY);
					data.remove(btnButton_A2.getText());
				}    
			}
		});
		btnButton_A2.setHorizontalAlignment(SwingConstants.CENTER);
		btnButton_A2.setBorder(border);
		panel_1.add(btnButton_A2);
		
		
		// Button A3 //
		
		JButton btnButton_A3 = new JButton("A3");
		btnButton_A3.setBackground(Color.LIGHT_GRAY);
		btnButton_A3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btnButton_A3.getBackground()== Color.LIGHT_GRAY){
					data.add(btnButton_A3.getText());
					btnButton_A3.setBackground(Color.CYAN);
				}
				else {
					btnButton_A3.setBackground(Color.LIGHT_GRAY);
					data.remove(btnButton_A3.getText());
				}    
			}
		});
		btnButton_A3.setHorizontalAlignment(SwingConstants.CENTER);
		btnButton_A3.setBorder(border);
		panel_1.add(btnButton_A3);
		
		
		// Button B1 //
		
		JButton btnButton_B1 = new JButton("B1");
		btnButton_B1.setBackground(Color.LIGHT_GRAY);
		btnButton_B1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btnButton_B1.getBackground()== Color.LIGHT_GRAY){
					data.add(btnButton_B1.getText());
					btnButton_B1.setBackground(Color.CYAN);
				}
				else {
					btnButton_B1.setBackground(Color.LIGHT_GRAY);
					data.remove(btnButton_B1.getText());
				}    
			}
		});
		btnButton_B1.setHorizontalAlignment(SwingConstants.CENTER);
		btnButton_B1.setBorder(border);
		panel_1.add(btnButton_B1);
		
		
		// Button B2 //
		
		JButton btnButton_B2 = new JButton("B2");
		btnButton_B2.setBackground(Color.LIGHT_GRAY);
		btnButton_B2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btnButton_B2.getBackground()== Color.LIGHT_GRAY){
					data.add(btnButton_B2.getText());
					btnButton_B2.setBackground(Color.CYAN);
				}
				else {
					btnButton_B2.setBackground(Color.LIGHT_GRAY);
					data.remove(btnButton_B2.getText());
				}    
			}
		});
		btnButton_B2.setHorizontalAlignment(SwingConstants.CENTER);
		btnButton_B2.setBorder(border);
		panel_1.add(btnButton_B2);
		
		
		// Button B3 //
		
		JButton btnButton_B3 = new JButton("B3");
		btnButton_B3.setBackground(Color.LIGHT_GRAY);
		btnButton_B3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btnButton_B3.getBackground()== (Color.LIGHT_GRAY)){
					data.add(btnButton_B3.getText());
					btnButton_B3.setBackground(Color.CYAN);
				}
				else {
					btnButton_B3.setBackground(Color.LIGHT_GRAY);
					data.remove(btnButton_B3.getText());
				}    
			}
		});
		btnButton_B3.setHorizontalAlignment(SwingConstants.CENTER);
		btnButton_B3.setBorder(border);
		panel_1.add(btnButton_B3);
		
		
		// Button Save //
		
				JButton btnButton_Save = new JButton("Save");
				btnButton_Save.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						for (int i=0; i<data.size(); i++) {
							System.out.println(data.get(i));
						}
					}
				});
				panel.add(btnButton_Save);
				
				
          // Button Stop //
				
				JButton btnButton_Stop = new JButton("Stop");
				btnButton_Stop.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						System.exit(0);
					}
				});
				panel.add(btnButton_Stop);		
       
				
		// Button Go //
		
				JButton btnButton_Go = new JButton("Go");
				btnButton_Go.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						Head head1 = new Head (0.0,0.0,0.0);
						Field essaiField= new Field(130.0, 90.0, 3 ,2);
						
						Coordinate_Field coordinate1 = new Coordinate_Field (essaiField);
						  
						Controller controller1 = new Controller (essaiField,coordinate1,head1,essaiManip); 
						controller1.go();
						controller1.Save_Coordinate();
						controller1.afficher_data_controller();
						try {
							controller1.Arduino();
						}
						catch (IOException | InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});
				
				
				panel.add(btnButton_Go);
				
                
		
	}

}

