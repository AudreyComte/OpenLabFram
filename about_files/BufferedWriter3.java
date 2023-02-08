package about_files;
	

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter3 {

	   public static void main(String[] args) {

	       BufferedWriter bw = null;
	       FileWriter fw = null;

	       try {

	           String content = "This is the content to write into file\n";

	           fw = new FileWriter("Menu.java");
	           bw = new BufferedWriter(fw);
	           bw.write(content);

	       } catch (IOException e) {
	           System.err.format("IOException: %s%n", e);
	       } finally {
	           try {
	               if (bw != null)
	                   bw.close();

	               if (fw != null)
	                   fw.close();
	           } catch (IOException ex) {
	               System.err.format("IOException: %s%n", ex);
	           }
	       }
	   }
}
	
