package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Ventas {
    private Map<String, Integer> ventasPorProducto;
    public Ventas() { 
    	ventasPorProducto = new HashMap<String, Integer>();
    }
    
    public void leerVentas(String entrada) {
    	try {
    		File archivo = new File(entrada);
    		BufferedReader lector = new BufferedReader(new FileReader(archivo));
    		String linea;
    		
    		while ((linea = lector.readLine()) != null) {
    			String [] lineaSpliteada = linea.split(" ");
    			String codigoProducto = lineaSpliteada[0];
    			Integer cantidadVentas = Integer.parseInt(lineaSpliteada[1]);
    			if (ventasPorProducto.containsKey(codigoProducto)) {
    				ventasPorProducto.put(codigoProducto, ventasPorProducto.get(codigoProducto) + cantidadVentas);
    			} else {
    				ventasPorProducto.put(codigoProducto, cantidadVentas);
    			}
    		}
    	
    		lector.close();
    		
    	}  catch(IOException e) {
    		System.err.println("Error al leer el archivo " + e.getMessage());
    	}
    }
   
    public void escribirVentasPorProducto(String salida) { 
    	
    	File archivo = new File(salida);
    	
    	try {
    		BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo, false));
    	} catch(IOException e) {
    		
    	}
    	
    }
    
    public static void main(String[] args) throws IOException { 
    	
    }
}
