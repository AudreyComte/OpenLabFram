package about_files;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedWriter;

public class Main {
  public static void main(String[] args) throws IOException, InterruptedException {
	  ArrayList<String> data = new ArrayList ();
	  //data.add("A1");
	  //data.add("A2");
	  //data.add("B1");
	  //data.add("D5");
	  Head head1 =new Head (0.0,0.0,0.0);
	  Field essaiField= new Field(50.0, 25.0, 5 ,5);
	  Manip essaiManip = new Manip ("A2", "B2", "row by row","2000",data);
	  essaiManip.Addwell();
	  Coordinate_Field coordinate1 =new Coordinate_Field (essaiField);
	  
	  Controller controller1 = new Controller (essaiField,coordinate1,head1,essaiManip); 
	  controller1.go();
	  //controller1.Save_Coordinate();
	  //controller1.afficher_data_controller();
	  //controller1.Arduino();
			  
	  }  
  } 
 