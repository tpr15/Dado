package jogo;
/** A classe jogo � a main e � onde acontece o desenrolar do jogo. 
 * Nela pede o numero de jogadores que v�o jogar depois chama o m�todo 
 * carregaPlayer pra carregar o numero de jogadores pedidos. 
 * Depois deixa os jogadores escolherem as cores . 
 * Logo ap�s os territ�rios s�o sorteados quando o m�todo  sorteiaTerritorios � chamado. 
 * Pra finalizar � exibido os territ�rios de cada jogador e os ataques s�o realizados para cada pais.*/
import java.util.Scanner;
//import java.util.*;

public class Jogo {
	
	
	private static Scanner entrada;
	static int i;
	private static int x = 0;
	static int q;
	static int r;

	public static void main(String[] args) {
		
		
		System.out.println("Entre com o numero de 2 � 4 de jogadores");
		entrada = new Scanner(System.in);
		ControlaJogo jogadas = new ControlaJogo();
		CarregaPlayers prontos = new CarregaPlayers();
		Players jogando = new Players();
		CarregaPais j = new CarregaPais();
		Territorio territorios = new Territorio();
		SorteiaTerritorios sorteio = new SorteiaTerritorios();
		ColocarSoldados maisSoldados = new ColocarSoldados();
		MostraTabuleiro tabuleiro = new MostraTabuleiro();
		Menu menu = new Menu();
		
		territorios = j.carregaPais();
		
		
		x = entrada.nextInt();
		jogadas.setNumeroJogadores(x);
		
		while(jogadas.CofereQuant() != true) {
			x = entrada.nextInt();
			jogadas.setNumeroJogadores(x);
		}
		jogando = prontos.carregaPlayers(x);
		menu.printMenu(0,0);
		for(int i = 0; i < x; i++) {
			r = entrada.nextInt();
			
			menu.printMenu(i,r);
			jogando.getPlayers().get(i).setCor(r);
		}
		
		sorteio.sorteiaTerritorios(jogando, territorios);
		
		System.out.println("Esse � o territ�rio do Player 1");
		for(i = 0; i < territorios.getPaises().size(); i++) {
			if (jogando.getPlayers().get(0).getCor() == territorios.getPaises().get(i).getCor() ) {
				
				System.out.println(territorios.getPaises().get(i).getNome());
			}
		}
		System.out.println("Esse � o territ�rio do Player 2");
		for(i = 0; i < territorios.getPaises().size(); i++) {
			if (jogando.getPlayers().get(1).getCor() == territorios.getPaises().get(i).getCor() ) {
				
				System.out.println(territorios.getPaises().get(i).getNome());
			}
		}
		
		if(jogando.getPlayers().size() == 3) {
			System.out.println("Esse � o territ�rio do Player 3");
			for(i = 0; i < territorios.getPaises().size(); i++) {
				if (jogando.getPlayers().get(2).getCor() == territorios.getPaises().get(i).getCor() ) {
					
					System.out.println(territorios.getPaises().get(i).getNome());
				}
			}
		}
		if(jogando.getPlayers().size() == 4) {
			System.out.println("Esse � o territ�rio do Player 3");
			for(i = 0; i < territorios.getPaises().size(); i++) {
				if (jogando.getPlayers().get(2).getCor() == territorios.getPaises().get(i).getCor() ) {
					
					System.out.println(territorios.getPaises().get(i).getNome());
				}
			}
			System.out.println("Esse � o territ�rio do Player 4");
			for(i = 0; i < territorios.getPaises().size(); i++) {
				if (jogando.getPlayers().get(3).getCor() == territorios.getPaises().get(i).getCor() ) {
					
					System.out.println(territorios.getPaises().get(i).getNome());
				}
			}
		}
		
		// Posicionar soldados ganhos
		maisSoldados.colocarSoldados(territorios, jogando);
		
		// Mostrando os dominios
		
		tabuleiro.mostraTabuleiro(territorios);

		for(q = 0; q < jogando.getPlayers().size(); q++) {
			System.out.println(" Ataque do player " + q);
			tabuleiro.vaiAtacarQuem(jogando.getPlayers().get(q), territorios);
			tabuleiro.mostraTabuleiro(territorios);
			
		}
	
	}
	

}
