package about_files;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import about_files.Field;
import about_files.Manip;
import about_files.Head;
import about_files.Frame;

public class Coordinate_Frame {
	Frame myFrame;
	Double [] tx;
	Double [] ty;
	
	public Coordinate_Frame (Frame myFrame) {
		this.myFrame = myFrame;
		this.tx = new Double[myFrame.get_column()+1];
		this.ty = new Double[myFrame.get_row()+1];
		this.coordinate_Frame();
	}

	public void setFrame (Frame myFrame) {
		this.myFrame = myFrame;
	}
	    
	public Frame get_myFrame () {
		return this.myFrame;
	}
	 
	void coordinate_Frame() {
		
		// nombre de colonne
		int column = myFrame.get_column();
		
		// nombre de ligne
		int row = myFrame.get_row();
		
		// Point A1 en x
		Double A1_x = ((myFrame.getxFrame()/column)/2); 
		
		// Point A1 en y
		Double A1_y = ((myFrame.getyFrame()/row)/2)+(((myFrame.getyFrame()/row))*(row-1));
				
		//Boucle pour récuppérer les coordonnées du x et du y en fontion des puits
		for (int r = 1; r < this.ty.length; r ++) {
			Double y = A1_y - ((myFrame.getyFrame()/row)*(r-1));
			ty[r]= y;
			
			for (int c = 1; c < this.tx.length; c ++) {
				Double x = A1_x + ((myFrame.getxFrame()/column)*(c-1)); 
				tx[c]= x;
				//System.out.println(x+" ; "+y);
			}	
		}
	}
	
	public int get_r (String well) {
		char[] array = well.toCharArray();
		char [] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		int r = Arrays.binarySearch(alphabet, array[0]) + 1;
		return r;	
	}
	
	public int get_c (String well) {
		char[] array = well.toCharArray();
		char [] chiffre = {'0','1','2','3','4','5','6','7','8','9'};
		int c = Arrays.binarySearch(chiffre, array[1]);
		return c;
	}
	
	public Double get_x_coordinate (int c) {
		Double x = this.tx[c];
		return x;
	}
	
	public Double get_y_coordinate (int r) {
		Double y = this.ty[r];
		return y;
	}
		 
	public Double well_x_coordinate (String well) {
		int c = this.get_c(well);
		Double x = this.tx[c];
		return x;
	}
	
	public Double well_y_coordinate (String well) {
		int r = this.get_r(well);
		Double y = this.ty[r];
		return y;
	}
	
}