package jogo;

import java.util.ArrayList;

public class Pratacar {
	ArrayList<String> armazena;
	public Pratacar() {
		this.armazena = new ArrayList<String>();
	}
	public ArrayList<String> getArmazena() {
		return armazena;
	}
	public void setArmazena(ArrayList<String> armazena) {
		this.armazena = armazena;
	}
	  public void addString(ArrayList<String> atacar) {
	        this.armazena.addAll(atacar);
	    }
}
