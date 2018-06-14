package jogo;

	/**Classe jogador
	 * Define cor e o numero de soldados*/

public class Jogador {
	private String cor;
	private int soldados;
	public String getCor() {
		return cor;
	}
	public void setCor(int i) {
		if(i == 1) {
			this.cor = "branco";
		}
		else if (i == 2) {
			this.cor = "azul";
		}
		else if (i == 3) {
			this.cor = "vermelho";
		}
		else if (i == 4) {
			this.cor = "preto";
		}
		
		
	}

	public int getSoldados() {
		return soldados;
	}
	public void setSoldados(int soldados) {
		this.soldados = soldados;
	}

	

}
