package main;

import java.io.File;
import java.io.FilenameFilter;

public class MiFiltro implements FilenameFilter {

	private String prefix;
	
	public MiFiltro(String prefix) {
		if (prefix == null) {
			throw new IllegalArgumentException("El prefijo no puede ser nulo");
		} else {
			this.prefix = prefix;
		}
		
		
	}
	
	@Override
	public boolean accept(File dir, String name) {
		return name.toUpperCase().startsWith(prefix.toUpperCase());
	}

}
