package jogo;



public class ControlaJogo {

	private int numeroJogadores;
	private int cor;


	public boolean CofereQuant() {
		if (this.numeroJogadores < 2 || this.numeroJogadores > 4) {
			System.out.println("Entre novamente com o numero entre 2 e 4 de jogadores ");
			return false;
			
		}
		return true;
	}
	

		
		


		
	

	public int getCor() {
		return cor;
	}

	public void setCor(int cor) {
		this.cor = cor;
	}

	public int getNumeroJogadores() {
		return numeroJogadores;
	}

	public void setNumeroJogadores(int numeroJogadores) {
		this.numeroJogadores = numeroJogadores;
	}



}
