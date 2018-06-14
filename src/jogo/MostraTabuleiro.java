package jogo;

import java.util.ArrayList;
import java.util.Scanner;

public class MostraTabuleiro {
	private int i;
	private int x = 0;
    int k;
	Atacar ataque = new Atacar();
	Scanner entrada = new Scanner(System.in);
	ArrayList<String> atacar = new ArrayList<String>();
	PaisENumero g = new PaisENumero();
	
	
	CorDiferente praAtacar = new CorDiferente();
	public void mostraTabuleiro(Territorio territorios) {
		System.out.println("Territorios e dominação");
		for(i = 0; i < territorios.getPaises().size(); i++) {
			
			System.out.println(territorios.getPaises().get(i).getNome() + " tem " + territorios.getPaises().get(i).getSoldados() + " soldados de cor " + territorios.getPaises().get(i).getCor());
				
				
		}
	}
	public void vaiAtacarQuem(Jogador j, Territorio territorios) {
		System.out.println("Quem vc quer atacar");
		for(i = 0; i < territorios.getPaises().size(); i++) {
			if (j.getCor() == territorios.getPaises().get(i).getCor()  ) {
				
					atacar = praAtacar.corDiferente(j.getCor(), territorios.getPaises().get(i).getVizinhos() , territorios);
				if(atacar.get(0) != "zero") {
					System.out.println(" Vzinhos do pais " + territorios.getPaises().get(i).getNome());
					for(x = 0; x < atacar.size(); x++) {
						
						System.out.println(" Aperte "+ x +" para atacar " + atacar.get(x) );
						

						
					}
					
					k = entrada.nextInt();
					g.setPaisd(atacar.get(k));
					g.setPais(territorios.getPaises().get(i).getNome());
					ataque.atacar(j, g.getPais(), g.getPaisd(), territorios);
					atacar.clear();
				}	
					
				
			}
		}
	}
}
