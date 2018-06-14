package jogo;
/**	Classe CarregaPlayer  tem o objetivo de criar jogadores no método carregaPlayer. 
 * Ele recebe um int indicando o numero de jogadores que iram jogar e retorna um ArrayList 
 * de jogadores */
public class CarregaPlayers {
	/** Carrega a quantidade de jogadores*/
	Players jogadores = new Players();
	public Players carregaPlayers(int i) {
		if(i==2) {
			Jogador player1 = new Jogador();
			Jogador player2 = new Jogador();
			jogadores.addPlayers(player1);
			jogadores.addPlayers(player2);
			return jogadores;
		}
		else if(i==3) {
			Jogador player1 = new Jogador();
			Jogador player2 = new Jogador();
			Jogador player3 = new Jogador();
			jogadores.addPlayers(player1);
			jogadores.addPlayers(player2);
			jogadores.addPlayers(player3);
			return jogadores;
		}
		else if(i==4) {
			Jogador player1 = new Jogador();
			Jogador player2 = new Jogador();
			Jogador player3 = new Jogador();
			Jogador player4 = new Jogador();
			jogadores.addPlayers(player1);
			jogadores.addPlayers(player2);
			jogadores.addPlayers(player3);
			jogadores.addPlayers(player4);
			return jogadores;
		}
		return jogadores;
		
		
	}

}
