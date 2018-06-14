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
	
	public void printMenu(int i) {
		if(i == 0) {
			System.out.println("Escolha as cores de cada jogador: ");
			System.out.println("(1) Para branco");
			System.out.println("(2) Para Azul");
			System.out.println("(3) Para vermelho");
			System.out.println("(4) Para preto");
		}
		/*else if (i == 1) {
			System.out.println("Escolha as cores de cada jogador: ");
			System.out.println("(2) Para Azul");
			System.out.println("(3) Para vermelho");
			System.out.println("(4) Para preto");
		}
		else if (i == 2) {
			System.out.println("Escolha as cores de cada jogador: ");
			System.out.println("(3) Para vermelho");
			System.out.println("(4) Para preto");
		}
		else if (i == 3) {
			System.out.println("Escolha as cores de cada jogador: ");
			System.out.println("(4) Para preto");
		}*/

		
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
