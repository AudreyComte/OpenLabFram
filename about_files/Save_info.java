package about_files;

import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

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
import java.io.BufferedWriter;


public class Save_info {
	private String name;
	private ArrayList data;
	public Save_info (String name) {
		this.name = name;
		this.data = new ArrayList();
	}
	
	public void add_info(String info) {
		this.data.add(info);
		System.out.println(data);
	}
	
	public void save_info () {
		try {
			FileWriter file = new FileWriter(name +".txt");
			BufferedWriter output = new BufferedWriter(file);
			String Info = "";
			for (int i = 0; i < data.size(); i ++) {
				Info = Info.concat(data.get(i) + "\n");
			}
			output.write(Info);
		    output.close();
		    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
