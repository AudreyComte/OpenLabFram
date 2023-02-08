package about_files;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.fazecast.jSerialComm.SerialPort;

public class Main2_Arduino {
	
	static SerialPort serial_port;

	public static void main(String[] args)throws IOException, InterruptedException {
		
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
		
		serial_port.setBaudRate(115200); // Attention au BaudRate : avec Grbl 115200 //
		InputStream input_stream = serial_port.getInputStream();
			while(input_stream!=null) {
				Thread.sleep(1000);
				char msg =(char)input_stream.read();
				System.out.print(msg);
			}
			
		serial_port.closePort();
		
		/*
		OutputStream output_stream  = serial_port.getOutputStream();
		DataOutputStream data_output = new DataOutputStream(output_stream);
		
		 //while(true) {
			 //Scanner txt = new Scanner(System.in);
			 
			 //String commande = txt. next();
			 
		
			 String commande1 = "G4 P30\n";
			 
			 System.out.print(commande1);
			 
			 //Attention : besoin d'un délai de quelque miliseconde, ajourter un Tread.sleep(1000)//
			 Thread.sleep(1000);
			 data_output.write(commande1.getBytes("UTF-8"));
			 
			 
			 byte [] t1 = commande1.getBytes("UTF-8");
			 for (int i=0; i< t1.length; i++) {
				 System.out.println(t1[i]);
			 }*/
			 
			 
	
			 
		
	}
}
