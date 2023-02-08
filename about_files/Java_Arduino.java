package about_files;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import com.fazecast.jSerialComm.SerialPort;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Java_Arduino {
	
	static SerialPort serial_port;

    public void Arduino()throws IOException, InterruptedException  {
    	
    	
		SerialPort[] get_port = SerialPort.getCommPorts();
				
		for(SerialPort port : get_port) {
			System.out.println(port.getSystemPortName());
			serial_port = SerialPort.getCommPort(port.getSystemPortName());
					
			if(serial_port.openPort()) {
				System.out.println("Successfully open port!");
			}else {
				System.out.println("Failed to open port");
			}
		}
		serial_port.setBaudRate(9600);	
					
		OutputStream output_stream  = serial_port.getOutputStream();
		DataOutputStream data_output = new DataOutputStream(output_stream);
		
		String filename = "C:\\Users\\Audrey\\eclipse-workspace\\org.eclipse.swt\\Save_Coordiate.txt";
		
		try (BufferedReader bufferedreader = new BufferedReader(new FileReader(filename))) {
		      String strCurrentLine;
		      while ((strCurrentLine = bufferedreader.readLine()) != null) {
		    	  System.out.println(strCurrentLine);
		    	  Thread.sleep(1000);
		    	  data_output.write(strCurrentLine.getBytes("UTF-8"));
		      }
		    } catch (IOException ioe) {
		      ioe.printStackTrace();   
		    	  
		      }
		      
		serial_port.closePort();
	}
		
}		
	
		
		       
		
				 
		
				  
		

