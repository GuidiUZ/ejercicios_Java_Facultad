package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Persistencia {

	public static void main(String[] args) {
		
		File file = new File("resources/Personas.txt");
		BufferedWriter bw = null;
		try {
			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write("Guido"); bw.newLine();
			bw.write("Dario"); bw.newLine();
			bw.write("Matias"); bw.newLine();
			bw.write("Pepe");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (bw != null) {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
