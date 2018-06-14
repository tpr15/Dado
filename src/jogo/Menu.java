package jogo;




public class Menu {
	int j;


	public void printMenu(int i, int r) {
		
		if(i == 0 && r == 0) {
			System.out.println("Escolha as cores do 1º jogador: ");
			System.out.println("(1) Para branco");
			System.out.println("(2) Para Azul");
			System.out.println("(3) Para vermelho");
			System.out.println("(4) Para preto");
		}
		else if (i == 0 && r == 1) {
			System.out.println("Escolha as cores do 2º jogador: ");
			System.out.println("(2) Para Azul");
			System.out.println("(3) Para vermelho");
			System.out.println("(4) Para preto");
			
			j = 1;
		}
		else if (i == 0 && r == 2) {
			System.out.println("Escolha as cores do 2º jogador: ");
			System.out.println("(1) Para Branco");
			System.out.println("(3) Para vermelho");
			System.out.println("(4) Para preto");
			j = 2;
		}
		else if (i == 0 && r == 3) {
			System.out.println("Escolha as cores do 2º jogador: ");
			System.out.println("(1) Para Branco");
			System.out.println("(2) Para Azul");
			System.out.println("(4) Para Preto");
			j = 3;
		}
		else if (i == 0 && r == 4) {
			System.out.println("Escolha as cores do 2º jogador: ");
			System.out.println("(1) Para Branco");
			System.out.println("(2) Para Azul");
			System.out.println("(3) Para vermelho");
			j = 4;
		}
		else if(i == 1 && j == 1 && r == 2) {
			System.out.println("Escolha as cores do 3º jogador: ");
			System.out.println("(3) Para vermelho");
			System.out.println("(4) Para preto");
			j = 12;
		}
		else if(i == 1 && j == 1 && r == 3) {
			System.out.println("Escolha as cores do 3º jogador: ");
			System.out.println("(2) Para Azul");
			System.out.println("(4) Para preto");
			j = 13;
		}
		else if(i == 1 && j == 1 && r == 4) {
			System.out.println("Escolha as cores do 3º jogador: ");
			System.out.println("(2) Para Azul");
			System.out.println("(3) Para vermelho");
			j = 14;
		}
		else if(i == 1 && j == 2 && r == 1) {
			System.out.println("Escolha as cores do 3º jogador: ");
			System.out.println("(3) Para vermelho");
			System.out.println("(4) Para preto");
			j = 21;
		}
		else if(i == 1 && j == 2 && r == 3) {
			System.out.println("Escolha as cores do 3º jogador: ");
			System.out.println("(1) Para Branco");
			System.out.println("(4) Para preto");
			j = 23;
		}
		else if(i == 1 && j == 2 && r == 4) {
			System.out.println("Escolha as cores do 3º jogador: ");
			System.out.println("(1) Para Branco");
			System.out.println("(3) Para vermelho");
			j = 24;
		}
		else if(i == 1 && j == 3 && r == 1) {
			System.out.println("Escolha as cores do 3º jogador: ");
			System.out.println("(2) Para Azul");
			System.out.println("(4) Para preto");
			j = 31;
		}
		else if(i == 1 && j == 3 && r == 2) {
			System.out.println("Escolha as cores do 3º jogador: ");
			System.out.println("(1) Para Branco");
			System.out.println("(4) Para preto");
			j = 32;
		}
		else if(i == 1 && j == 3 && r == 4) {
			System.out.println("Escolha as cores do 3º jogador: ");
			System.out.println("(1) Para Branco");
			System.out.println("(2) Para Azul");
			j = 34;
		}
		else if(i == 1 && j == 4 && r == 1) {
			System.out.println("Escolha as cores do 3º jogador: ");
			System.out.println("(2) Para Azul");
			System.out.println("(3) Para vermelho");
			j = 41;
		}
		else if(i == 1 && j == 4 && r == 2) {
			System.out.println("Escolha as cores do 3º jogador: ");
			System.out.println("(1) Para Branco");
			System.out.println("(3) Para vermelho");
			j = 42;
		}
		else if(i == 1 && j == 4 && r == 3) {
			System.out.println("Escolha as cores do 3º jogador: ");
			System.out.println("(1) Para Branco");
			System.out.println("(2) Para Azul");
			j = 43;
		}
		else if(i == 2 && j == 12 && r == 3) {
			System.out.println("Escolha as cores do 4º jogador: ");
			System.out.println("(4) Para preto");
		}
		else if(i == 2 && j == 12 && r == 4) {
			System.out.println("Escolha as cores do 4º jogador: ");
			System.out.println("(3) Para vermelho");
		}
		else if(i == 2 && j == 13 && r == 2) {
			System.out.println("Escolha as cores do 4º jogador: ");
			System.out.println("(4) Para preto");
		}
		else if(i == 2 && j == 13 && r == 4) {
			System.out.println("Escolha as cores do 4º jogador: ");
			System.out.println("(2) Para Azul");
		}
		else if(i == 2 && j == 14 && r == 2) {
			System.out.println("Escolha as cores do 4º jogador: ");
			System.out.println("(3) Para vermelho");
		}
		else if(i == 2 && j == 14 && r == 3) {
			System.out.println("Escolha as cores do 4º jogador: ");
			System.out.println("(2) Para Azul");
		}
		else if(i == 2 && j == 21 && r == 3) {
			System.out.println("Escolha as cores do 4º jogador: ");
			System.out.println("(4) Para preto");
		}
		else if(i == 2 && j == 21 && r == 4) {
			System.out.println("Escolha as cores do 4º jogador: ");
			System.out.println("(3) Para vermelho");
		}
		else if(i == 2 && j == 23 && r == 4) {
			System.out.println("Escolha as cores do 4º jogador: ");
			System.out.println("(1) Para Branco");
		}
		else if(i == 2 && j == 23 && r == 1) {
			System.out.println("Escolha as cores do 4º jogador: ");
			System.out.println("(4) Para preto");
		}
		else if(i == 2 && j == 24 && r == 3) {
			System.out.println("Escolha as cores do 4º jogador: ");
			System.out.println("(1) Para Branco");
		}
		else if(i == 2 && j == 24 && r == 1) {
			System.out.println("Escolha as cores do 4º jogador: ");
			System.out.println("(3) Para vermelho");
		}
		else if(i == 2 && j == 31 && r == 2) {
			System.out.println("Escolha as cores do 4º jogador: ");
			System.out.println("(4) Para preto");
		}
		else if(i == 2 && j == 31 && r == 4) {
			System.out.println("Escolha as cores do 4º jogador: ");
			System.out.println("(2) Para Azul");
		}
		else if(i == 2 && j == 32 && r == 1) {
			System.out.println("Escolha as cores do 4º jogador: ");
			System.out.println("(4) Para preto");
		}
		else if(i == 2 && j == 32 && r == 4) {
			System.out.println("Escolha as cores do 4º jogador: ");
			System.out.println("(1) Para Branco");
		}
		else if(i == 2 && j == 34 && r == 1) {
			System.out.println("Escolha as cores do 4º jogador: ");
			System.out.println("(2) Para Azul");
		}
		else if(i == 2 && j == 34 && r == 2) {
			System.out.println("Escolha as cores do 4º jogador: ");
			System.out.println("(1) Para Branco");
		}
		else if(i == 2 && j == 41 && r == 2) {
			System.out.println("Escolha as cores do 4º jogador: ");
			System.out.println("(3) Para vermelho");
		}
		else if(i == 2 && j == 41 && r == 3) {
			System.out.println("Escolha as cores do 4º jogador: ");
			System.out.println("(2) Para Azul");
		}
		else if(i == 2 && j == 42 && r == 1) {
			System.out.println("Escolha as cores do 4º jogador: ");
			System.out.println("(3) Para vermelho");
		}
		else if(i == 2 && j == 42 && r == 3) {
			System.out.println("Escolha as cores do 4º jogador: ");
			System.out.println("(1) Para Branco");
		}
		else if(i == 2 && j == 43 && r == 1) {
			System.out.println("Escolha as cores do 4º jogador: ");
			System.out.println("(2) Para Azul");
		}
		else if(i == 2 && j == 43 && r == 2) {
			System.out.println("Escolha as cores do 4º jogador: ");
			System.out.println("(1) Para Branco");
		}
		

}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}
}	