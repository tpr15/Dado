package jogo;
/**	A classe pais é a classe que tem o atributos e get e sets de nome vizinhos ,
 *  quantidade de soldados e a cor dos soldados  . 
 *  Nela tem também  um pais que é o vizinho de ligação marítima que ainda não foi usado no nosso jogo.*/
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
