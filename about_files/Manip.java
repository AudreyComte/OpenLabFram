package about_files;

import java.util.ArrayList;
import java.util.Arrays;
import about_files.Event;

import javax.xml.crypto.Data;

public class Manip {
	private String First_well;
	private String Last_well;
	private String Direction_reading;
	private String time;
	private ArrayList<String> data;
	private ArrayList<String> well;

	public Manip(String First_well, String Last_well, String Direction_reading, String time, ArrayList<String> data) {
		this.First_well = First_well;
		this.Last_well = Last_well;
		this.Direction_reading = Direction_reading;
		this.time = time;
		this.data = data;
		this.well = new ArrayList<String>();
	}
	
	public String getFirst_well() {
		return this.First_well;
	}

	public String getLast_well() {
		return this.Last_well;
	}
	
	public String getDirection_reading() {
		return this.Direction_reading;
	}
	
	public String getTime() {
		return time;
	}
	
	public ArrayList getData() {
		return this.data;
	}
	
	public void setFirst_well(String First_well) {
		this.First_well = First_well;
	}
	
	public void setLast_well(String Last_well) {
		this.Last_well = Last_well;
	}
	
	public void Direction_reading(String Direction_reading) {
		this.Direction_reading = Direction_reading;
	}
	
	public void Time(String time) {
		this.time = time;
	}
			
	
	public int get_nb_event() {
		int nb_event = (data.size() -1);
		return nb_event;
	}
	
}



