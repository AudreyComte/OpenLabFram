package about_files;

import about_files.Frame;

public class Field {
	//Coordonées de points //
	private Double xField;
	private Double yField;
	private int column;
	private int row;
	Double[]coordinate_Field;
	

	public Field(Double xField, Double yField, int column, int row) {
		this.xField = xField;
		this.yField = yField;
		this.column = column;
		this.row = row;
		this.coordinate_Field = new Double[] {this.xField, this.yField};
	}
	
	
	public Double getxField() {
		return this.xField;
	}
	
	public Double getyField() {
		return this.yField;
	}
	
	public int getRow() {
		return this.row;
	}
	
	public int getColumn() {
		return this.column;
	}
	
	public void setxField(Double xField) {
		this.xField = xField;
	}
	
	public void setyField(Double yField) {
		this.yField = yField;
	}
	
	public void setRow(int row) {
		this.row = row;
	}
	
	public void setColumn(int column) {
		this.column = column;
	}
	
	public Double [] set_coordinate_Field(Double xField, Double yField) {
		coordinate_Field [0] = xField;
		coordinate_Field [1] = yField;
		return coordinate_Field;
	}
	
	public Double aeraWell (int well) {
		Double aera = xField * yField;
		Double aera_well= aera/well;
		return aera_well;
	}
	
	public Double xField_6well() {
		Double xField_6well = this.xField/3;
		return xField_6well;
	}
	
	public Double yField_6well() {
		Double yField_6well = this.yField/2;
		return yField_6well;
	}
	
}
