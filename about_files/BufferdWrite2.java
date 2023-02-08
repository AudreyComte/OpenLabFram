package about_files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;


import java.io.FileWriter;


public class BufferdWrite2 {
	
    public static void main(String[] args) throws IOException {
        File outFile = new File("C:\\Users\\Audrey\\eclipse-workspace\\Audrey\\res\\outFile.txt");
        
        outFile.getParentFile().mkdirs(); // Create parent folder.
        
        // Create Writer to write a file.
        Writer writer = new FileWriter(outFile, StandardCharsets.UTF_8);

        // Create a BufferedWriter with buffer array size of 16384 (32786 bytes = 32 KB).
        BufferedWriter br = new BufferedWriter(writer, 16384);
    
        br.write("Line 1");
        br.newLine();  
        br.write("Line 2");
        br.flush();
        br.newLine();
        br.write("Line 3");
        br.flush();
        br.newLine();
        
        br.close();
    }
}



