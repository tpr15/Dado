package jogo;

import java.util.ArrayList;

public class Players {
	private ArrayList<Jogador> players;
	
	public Players() {
		
		this.players = new ArrayList<Jogador>();
	}
	
	public ArrayList<Jogador> getPlayers() {
		return players;
	}
	public void addPlayers(Jogador players) {
		this.players.add(players);
	}

	public void setPlayers(ArrayList<Jogador> players) {
		this.players = players;
	}


}
