package jogo;

import java.util.Collections;

public class SorteiaTerritorios {
	int i;
	public void sorteiaTerritorios(Players x, Territorio t) {
		Collections.shuffle(t.getPaises());
		if(x.getPlayers().size()==2) {
			
			for(i=0;i<=11;i++) {
				t.getPaises().get(i).setCor(x.getPlayers().get(0).getCor());
				t.getPaises().get(i).setSoldados(1);
			}
			for(i=8;i<=23;i++) {
				t.getPaises().get(i).setCor(x.getPlayers().get(1).getCor());
				t.getPaises().get(i).setSoldados(1);
			}
		}
		else if(x.getPlayers().size()==3) {
			
			for(i=0;i<=7;i++) {
				t.getPaises().get(i).setCor(x.getPlayers().get(0).getCor());
				t.getPaises().get(i).setSoldados(1);
			}
			for(i=5;i<=15;i++) {
				t.getPaises().get(i).setCor(x.getPlayers().get(1).getCor());
				t.getPaises().get(i).setSoldados(1);
			}
			for(i=10;i<=23;i++) {
				t.getPaises().get(i).setCor(x.getPlayers().get(2).getCor());
				t.getPaises().get(i).setSoldados(1);
			}
		}
		else if(x.getPlayers().size()==4) {
			
			for(i=0;i<=5;i++) {
				t.getPaises().get(i).setCor(x.getPlayers().get(0).getCor());
				t.getPaises().get(i).setSoldados(1);
			}
			for(i=4;i<=11;i++) {
				t.getPaises().get(i).setCor(x.getPlayers().get(1).getCor());
				t.getPaises().get(i).setSoldados(1);
			}
			for(i=8;i<=17;i++) {
				t.getPaises().get(i).setCor(x.getPlayers().get(2).getCor());
				t.getPaises().get(i).setSoldados(1);
			}
			for(i=12;i<=23;i++) {
				t.getPaises().get(i).setCor(x.getPlayers().get(3).getCor());
				t.getPaises().get(i).setSoldados(1);
			}
		}
		
	}

}
