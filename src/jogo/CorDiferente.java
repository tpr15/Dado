package jogo;

import java.util.ArrayList;

public class CorDiferente {
	int i;
	int x;
	int k = 0;
	ArrayList<String> vizinhos = new ArrayList<String>();
	public ArrayList<String> corDiferente(String cor, ArrayList<String> t, Territorio territorios) {
		for(i = 0; i < territorios.getPaises().size() ;i++) {
			for(x = 0; x < t.size(); x++) {
				if(territorios.getPaises().get(i).getNome() == t.get(x) && territorios.getPaises().get(i).getCor() != cor) {
					vizinhos.add(territorios.getPaises().get(i).getNome());
					k = 1;
				}
			}
		}
		if (k == 0){
			vizinhos.add("zero");
		}
		return vizinhos;
	}
}
