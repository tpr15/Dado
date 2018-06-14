package jogo;

import java.util.Scanner;

import javax.swing.JOptionPane;
//import java.util.*;

public class Jogo {
	
	
	private static Scanner entrada;
	static int i;
	private static int x = 0;
	static int q;
	static int r;




	public static void main(String[] args) {
		
		System.out.println("Entre com o numero entre 2 e 4 de jogadores");
		
		entrada = new Scanner(System.in);
		ControlaJogo jogadas = new ControlaJogo();
		CarregaPlayers prontos = new CarregaPlayers();
		Players jogando = new Players();
		CarregaPais j = new CarregaPais();
		Territorio territorios = new Territorio();
		SorteiaTerritorios sorteio = new SorteiaTerritorios();
		ColocarSoldados maisSoldados = new ColocarSoldados();
		MostraTabuleiro tabuleiro = new MostraTabuleiro();
		
		territorios = j.carregaPais();
		
		
		x = entrada.nextInt();
		jogadas.setNumeroJogadores(x);
		
		while(jogadas.CofereQuant() != true) {
			x = entrada.nextInt();
			jogadas.setNumeroJogadores(x);
		}
		jogando = prontos.carregaPlayers(x);
		jogadas.printMenu(0);
		for(int i = 0; i < x; i++) {
			r = entrada.nextInt();
			jogadas.printMenu(0);
			jogando.getPlayers().get(i).setCor(r);
		}
		
		sorteio.sorteiaTerritorios(jogando, territorios);
		
		System.out.println("Esse é o território do Player 1");
		for(i = 0; i < territorios.getPaises().size(); i++) {
			if (jogando.getPlayers().get(0).getCor() == territorios.getPaises().get(i).getCor() ) {
				
				System.out.println(territorios.getPaises().get(i).getNome());
			}
		}
		System.out.println("Esse é o território do Player 2");
		for(i = 0; i < territorios.getPaises().size(); i++) {
			if (jogando.getPlayers().get(1).getCor() == territorios.getPaises().get(i).getCor() ) {
				
				System.out.println(territorios.getPaises().get(i).getNome());
			}
		}
		
		if(jogando.getPlayers().size() == 3) {
			System.out.println("Esse é o território do Player 3");
			for(i = 0; i < territorios.getPaises().size(); i++) {
				if (jogando.getPlayers().get(2).getCor() == territorios.getPaises().get(i).getCor() ) {
					
					System.out.println(territorios.getPaises().get(i).getNome());
				}
			}
		}
		if(jogando.getPlayers().size() == 4) {
			System.out.println("Esse é o território do Player 3");
			for(i = 0; i < territorios.getPaises().size(); i++) {
				if (jogando.getPlayers().get(2).getCor() == territorios.getPaises().get(i).getCor() ) {
					
					System.out.println(territorios.getPaises().get(i).getNome());
				}
			}
			System.out.println("Esse é o território do Player 4");
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
	
	try {
		JogoDAO dao = new JogoDAO();
		dao.createGame(3, 4);
	}catch(Exception e) {
		JOptionPane.showMessageDialog(null, e);		
	}
}
