package about_files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import about_files.Controller;

public class G_code {
	 String name;
	 ArrayList data;
	 Controller myController;
	
	public G_code (String name) {
		this.name = name;
		this.data = new ArrayList();
	}
	
	public void add_info(String info) {
		this.data.add(info);
		System.out.println(data);
	}
	
	public void add_event_info () {
		this.data.add(myController.getHead().getxHead().toString());
		this.data.add(myController.getHead().getyHead().toString());
		this.data.add(myController.myManip.getTime().toString());
		
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
