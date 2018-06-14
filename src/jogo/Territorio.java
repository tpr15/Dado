package jogo;

import java.util.ArrayList;

public class Territorio {
	ArrayList<Pais> paises;
	public Territorio() {
		
		this.paises = new ArrayList<Pais>();
		
	}
	public ArrayList<Pais> getPaises() {
		return paises;
	}

	public void addPaises(Pais paises) {
	        this.paises.add(paises);
	    }
	
	
}
