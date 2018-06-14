package jogo;

import java.util.ArrayList;

public class NumPais {
	private ArrayList<PaisENumero> guarda;
	public NumPais() {
		this.setGuarda(new ArrayList<PaisENumero>());
	}
	public ArrayList<PaisENumero> getGuarda() {
		return guarda;
	}
	public void setGuarda(ArrayList<PaisENumero> guarda) {
		this.guarda = guarda;
	}
	public void addGuarda(PaisENumero guarda) {
        this.guarda.add(guarda);
    }
}
