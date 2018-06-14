package jogo;

import java.util.ArrayList;

public class Pais {
	private String nome;
	private ArrayList<String> vizinhos;
	private String ligacaoMaritima;
	private String cor;
	private int soldados;
	
	public Pais() {
		
		this.vizinhos = new ArrayList<String>();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<String> getVizinhos() {
		return vizinhos;
	}
    public void addString(String vizinho) {
        this.vizinhos.add(vizinho);
    }
	
	public String getLigacaoMaritima() {
		return ligacaoMaritima;
	}
	public void setLigacaoMaritima(String ligacaoMaritima) {
		this.ligacaoMaritima = ligacaoMaritima;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getSoldados() {
		return soldados;
	}
	public void setSoldados(int soldados) {
		this.soldados += soldados;
	}
	
	

	

}
