package about_files;

import java.util.ArrayList;

public class Event {
	String name;
	Double x;
	Double y;
	String time;
	//String action;
	
	public Event (String name, Double x, Double y, String time) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.time = time;
	}
	
	public String get_name () {
		return this.name;
	}
	
	public Double get_x () {
		return this.x;
	}
	
	public Double get_y () {
		return this.y;
	}
	
	public String get_time () {
		return this.time;
	}
	
	public void set_name (String name) {
		this.name=name;
	}
	
	public void set_x (Double x) {
		this.x=x;
	}
	
	public void set_y (Double y) {
		this.y=y;
	}
	
	public void set_time (String time) {
		this.time=time;
	}
	
	
}
