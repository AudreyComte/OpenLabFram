package about_files;

import java.util.ArrayList;

public class Frame {
	//Coordonées de points //
	private Double xFrame;
	private Double yFrame;
	private int column;
	private int row;

	public Frame(Double xField, Double yField, int column, int row) {
		this.xFrame = xFrame;
		this.yFrame = yFrame;
		this.column = column;
		this.row = row;
	}
	
	
	public Double getxFrame() {
		return this.xFrame;
	}
	
	public Double getyFrame() {
		return this.yFrame;
	}
	
	public int get_column() {
		return this.column;
	}
	
	public int get_row() {
		return this.row;
	}
	
	public void setxFrame(Double xFrame) {
		this.xFrame = xFrame;
	}
	
	public void setyFrame(Double yFrame) {
		this.yFrame = yFrame;
	}
	
	public void set_column(int column) {
		this.column = column;
	}
	
	public void set_row(int row) {
		this.row = row;
	}
	
	public Double get_x_Frame(Double xFrame) {
		Double x = this.xFrame/this.column;
		return x;
	}
	
	public Double get_y_Frame(Double yFrame) {
		Double y = this.yFrame/this.column;
		return y;
	}

	
}
