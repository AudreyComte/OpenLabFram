package about_files;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import arduino.*;


public class Main_Arduino {
	
	public static void main(String[] args) throws IOException {
		
	Arduino arduino1 = new Arduino("COM4");
	arduino1.setBaudRate(9600);
	arduino1.openConnection();
	String commande= "$h";
	commande.getBytes("UTF-8");
	arduino1.serialWrite(commande);
	
	}

}
