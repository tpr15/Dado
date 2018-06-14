package jogo;

import java.util.ArrayList;

public class Continente {
	private String nome;
	private  ArrayList<String> territorios;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<String> getTerritorios() {
		return territorios;
	}
	public void addTerritorios(String vizinho) {
        this.territorios.add(vizinho);
    }
	
	

}
