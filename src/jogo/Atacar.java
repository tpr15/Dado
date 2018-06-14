package jogo;
/**	Classe atacar: Nesta classe tem o método que executa o ataque. 
 * Ela verifica quantos soldados o jogador tinha para atacar, então  
 * o método pega o numero de dados proporcional ao numero de  soldados 
 * e compara o maior dado com o maior de cada jogador . */
public class Atacar {
	private int i;
	int soldadosA;
	int soldadosD;
	int a1;
	Dado dadoA = new Dado();
	Dado dadoD = new Dado();
	public void atacar(Jogador j, String a, String d, Territorio territorios) {
		for(i = 0; i < territorios.getPaises().size(); i++) {
			if(territorios.getPaises().get(i).getNome() == a) {
				soldadosA = territorios.getPaises().get(i).getSoldados();
			}
		}
		for(i = 0; i < territorios.getPaises().size(); i++) {
			if(territorios.getPaises().get(i).getNome() == d) {
				soldadosD = territorios.getPaises().get(i).getSoldados();
			}
		}
		if(soldadosA == 2 && soldadosD == 2) {
			System.out.println("PRINT 22 ");
			 if(dadoA.getDado1() > dadoD.getDado1() && dadoA.getDado2() > dadoD.getDado2()) {
					for(i = 0; i < territorios.getPaises().size(); i++) {
						if(territorios.getPaises().get(i).getNome() == d) {
							territorios.getPaises().get(i).setCor(j.getCor());
						}
					}
			 }
			 if(dadoA.getDado1() <= dadoD.getDado1() && dadoA.getDado2() <= dadoD.getDado2()) {
					for(i = 0; i < territorios.getPaises().size(); i++) {
						if(territorios.getPaises().get(i).getNome() == a) {
							territorios.getPaises().get(i).setSoldados(-2);
						}
					}
			 }
		}
		if(soldadosA == 2 && soldadosD == 1) {
			System.out.println("PRINT 21 ");
			 if(dadoA.getDado1() > dadoD.getDado2()) {
					for(i = 0; i < territorios.getPaises().size(); i++) {
						if(territorios.getPaises().get(i).getNome() == d) {
							territorios.getPaises().get(i).setCor(j.getCor());
							territorios.getPaises().get(i).setSoldados(1);
						}
					}
			 }
			 if(dadoA.getDado1() <= dadoD.getDado2()) {
					for(i = 0; i < territorios.getPaises().size(); i++) {
						if(territorios.getPaises().get(i).getNome() == a) {
							territorios.getPaises().get(i).setSoldados(-2);
						}
					}
			 }
		}
		if(soldadosA == 1 && soldadosD == 2) {
			System.out.println("PRINT 12 ");
			 if(dadoA.getDado2() > dadoD.getDado1()) {
					for(i = 0; i < territorios.getPaises().size(); i++) {
						if(territorios.getPaises().get(i).getNome() == d) {
							territorios.getPaises().get(i).setSoldados(-1);
						}
					}
			 }
			 if(dadoA.getDado2() <= dadoD.getDado1()) {
				 System.out.println("PRINT 21 ");
					for(i = 0; i < territorios.getPaises().size(); i++) {
						if(territorios.getPaises().get(i).getNome() == a) {
							territorios.getPaises().get(i).setSoldados(-1);
						}
					}
			 }
		}
		if(soldadosA == 3 && soldadosD == 3) {
			System.out.println("PRINT 33 ");
			 if(dadoA.getDado1() > dadoD.getDado1() && dadoA.getDado2() > dadoD.getDado2() && dadoA.getDado3() > dadoD.getDado3()) {
					for(i = 0; i < territorios.getPaises().size(); i++) {
						if(territorios.getPaises().get(i).getNome() == d) {
							territorios.getPaises().get(i).setCor(j.getCor());
						}
					}
			 }
			 if(dadoA.getDado1() <= dadoD.getDado1() && dadoA.getDado2() <= dadoD.getDado2() && dadoA.getDado3() > dadoD.getDado3()) {
					for(i = 0; i < territorios.getPaises().size(); i++) {
						if(territorios.getPaises().get(i).getNome() == a) {
							territorios.getPaises().get(i).setSoldados(-3);
						}
					}
			 }
		
		}
		if(soldadosA == 1 && soldadosD == 1) {
			System.out.println("PRINT 11 ");
			 if(dadoA.getDado1() > dadoD.getDado1()) {
					for(i = 0; i < territorios.getPaises().size(); i++) {
						if(territorios.getPaises().get(i).getNome() == d) {
							territorios.getPaises().get(i).setCor(j.getCor());
						}
					}
			 }
			 if(dadoA.getDado1() <= dadoD.getDado1() && dadoA.getDado2() <= dadoD.getDado2()) {
					for(i = 0; i < territorios.getPaises().size(); i++) {
						if(territorios.getPaises().get(i).getNome() == a) {
							territorios.getPaises().get(i).setSoldados(-1);
						}
					}
			 }
		}
	}
}
