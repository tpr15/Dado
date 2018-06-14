package jogo;

import java.util.Scanner;

public class ColocarSoldados {
	int i;
	int x=0;
	int y=0;
	

	Scanner entrada = new Scanner(System.in);
	public void colocarSoldados(Territorio territorios, Players jogando) {
		if(jogando.getPlayers().size() == 2) {
			System.out.println("Add soldados do Player 1");
			for(i = 0; i < territorios.getPaises().size(); i++) {
				if (jogando.getPlayers().get(0).getCor() == territorios.getPaises().get(i).getCor() ) {
					System.out.println("quantos soldados de no maximo 6 vc quer add nesse pais?");
					System.out.println(territorios.getPaises().get(i).getNome());
					
					x = entrada.nextInt();
					y += x;
					
					while(y > 6) {
						
						System.out.println("vc nao tem mais que 6 para adicionar.");
						y = y- x;
						System.out.println("quantos soldados de no maximo 6 vc quer add nesse pais?");
						x = entrada.nextInt();
						y += x;
					}

					territorios.getPaises().get(i).setSoldados(x);
					if (y == 6) {
						y = 0;
						break;
					}
	
				}
				if(i == (territorios.getPaises().size()-1) && y < 4  ) {
					
						i = 0;
				}
			}
			System.out.println("Add soldados do Player 2");
			for(i = 0; i < territorios.getPaises().size(); i++) {
				if (jogando.getPlayers().get(1).getCor() == territorios.getPaises().get(i).getCor() ) {
					System.out.println("quantos soldados de no maximo 6 vc quer add nesse pais?");
					System.out.println(territorios.getPaises().get(i).getNome());
	
					x = entrada.nextInt();
					y += x;
					
					while(y > 6) {
						System.out.println("vc nao tem mais que 6 para adicionar.");
						y = y- x;
						System.out.println("quantos soldados de no maximo 6 vc quer add nesse pais?");
						x = entrada.nextInt();
						y += x;
					}
					territorios.getPaises().get(i).setSoldados(x);
					if (y == 6) {
						y = 0;
						break;
					}
				}
				if(i == (territorios.getPaises().size()-1) && y < 4  ) {
					
					i = 0;
				}
			}
			
		}

		
		if(jogando.getPlayers().size() == 3) {
			System.out.println("Add soldados do Player 1");
			for(i = 0; i < territorios.getPaises().size(); i++) {
				if (jogando.getPlayers().get(0).getCor() == territorios.getPaises().get(i).getCor() ) {
					System.out.println("quantos soldados de no maximo 4 vc quer add nesse pais?");
					System.out.println(territorios.getPaises().get(i).getNome());
	
					x = entrada.nextInt();
					y += x;
					
					while(y > 4) {
						System.out.println("vc nao tem mais que 4 para adicionar.");
						y = y- x;
						System.out.println("quantos soldados de no maximo 4 vc quer add nesse pais?");
						x = entrada.nextInt();
						y += x;
					}
					territorios.getPaises().get(i).setSoldados(x);
					if (y == 4) {
						y = 0;
						break;
					}
				}
				if(i == (territorios.getPaises().size()-1) && y < 3  ) {
					
					i = 0;
				}
			}
			System.out.println("Add soldados do Player 2");
			for(i = 0; i < territorios.getPaises().size(); i++) {
				if (jogando.getPlayers().get(1).getCor() == territorios.getPaises().get(i).getCor() ) {
					System.out.println("quantos soldados de no maximo 4 vc quer add nesse pais?");
					System.out.println(territorios.getPaises().get(i).getNome());
	
					x = entrada.nextInt();
					y += x;
					
					while(y > 4) {
						System.out.println("vc nao tem mais que 4 para adicionar.");
						y = y- x;
						System.out.println("quantos soldados de no maximo 4 vc quer add nesse pais?");
						x = entrada.nextInt();
						y += x;
					}
					territorios.getPaises().get(i).setSoldados(x);
					if (y == 4) {
						y = 0;
						break;
					}
					
				}
				if(i == (territorios.getPaises().size()-1) && y < 3  ) {
					
					i = 0;
				}
			}
			System.out.println("Add soldados do Player 3");
			for(i = 0; i < territorios.getPaises().size(); i++) {
				if (jogando.getPlayers().get(2).getCor() == territorios.getPaises().get(i).getCor() ) {
					System.out.println("quantos soldados de no maximo 4 vc quer add nesse pais?");
					System.out.println(territorios.getPaises().get(i).getNome());
	
					x = entrada.nextInt();
					y += x;
					
					while(y > 4) {
						System.out.println("vc nao tem mais que 4 para adicionar.");
						y = y- x;
						System.out.println("quantos soldados de no maximo 4 vc quer add nesse pais?");
						x = entrada.nextInt();
						y += x;
					}
					territorios.getPaises().get(i).setSoldados(x);
					if (y == 4) {
						y = 0;
						break;
					}
				}
				if(i == (territorios.getPaises().size()-1) && y < 3  ) {
					
					i = 0;
				}
			}
		}
		if(jogando.getPlayers().size() == 4) {
			System.out.println("Add soldados do Player 1");
			for(i = 0; i < territorios.getPaises().size(); i++) {
				if (jogando.getPlayers().get(0).getCor() == territorios.getPaises().get(i).getCor() ) {
					System.out.println("quantos soldados de no maximo 3 vc quer add nesse pais?");
					System.out.println(territorios.getPaises().get(i).getNome());
	
					x = entrada.nextInt();
					y += x;
					
					while(y > 3) {
						System.out.println("vc nao tem mais que 3 para adicionar.");
						y = y- x;
						System.out.println("quantos soldados de no maximo 3 vc quer add nesse pais?");
						x = entrada.nextInt();
						y += x;
					}
					territorios.getPaises().get(i).setSoldados(x);
					if (y == 3) {
						y = 0;
						break;
					}
				}
				if(i == (territorios.getPaises().size()-1) && y < 2  ) {
					
					i = 0;
				}
			}
			System.out.println("Add soldados do Player 2");
			for(i = 0; i < territorios.getPaises().size(); i++) {
				if (jogando.getPlayers().get(1).getCor() == territorios.getPaises().get(i).getCor() ) {
					System.out.println("quantos soldados de no maximo 3 vc quer add nesse pais?");
					System.out.println(territorios.getPaises().get(i).getNome());
	
					x = entrada.nextInt();
					y += x;
					
					while(y > 3) {
						System.out.println("vc nao tem mais que 3 para adicionar.");
						y = y- x;
						System.out.println("quantos soldados de no maximo 3 vc quer add nesse pais?");
						x = entrada.nextInt();
						y += x;
					}
					territorios.getPaises().get(i).setSoldados(x);
					if (y == 3) {
						y = 0;
						break;
					}
				}
				if(i == (territorios.getPaises().size()-1) && y < 2  ) {
					
					i = 0;
				}
			}
			System.out.println("Add soldados do Player 3");
			for(i = 0; i < territorios.getPaises().size(); i++) {
				if (jogando.getPlayers().get(2).getCor() == territorios.getPaises().get(i).getCor() ) {
					System.out.println("quantos soldados de no maximo 3 vc quer add nesse pais?");
					System.out.println(territorios.getPaises().get(i).getNome());
	
					x = entrada.nextInt();
					y += x;
					
					while(y > 3) {
						System.out.println("vc nao tem mais que 3 para adicionar.");
						y = y- x;
						System.out.println("quantos soldados de no maximo 3 vc quer add nesse pais?");
						x = entrada.nextInt();
						y += x;
					}
					territorios.getPaises().get(i).setSoldados(x);
					if (y == 3) {
						y = 0;
						break;
					}
				}
				if(i == (territorios.getPaises().size()-1) && y < 2  ) {
					
					i = 0;
				}
			}
			System.out.println("Add soldados do Player 4");
			for(i = 0; i < territorios.getPaises().size(); i++) {
				if (jogando.getPlayers().get(3).getCor() == territorios.getPaises().get(i).getCor() ) {
					System.out.println("quantos soldados de no maximo 3 vc quer add nesse pais?");
					System.out.println(territorios.getPaises().get(i).getNome());
	
					x = entrada.nextInt();
					y += x;
					
					while(y > 3) {
						System.out.println("vc nao tem mais que 3 para adicionar.");
						y = y- x;
						System.out.println("quantos soldados de no maximo 3 vc quer add nesse pais?");
						x = entrada.nextInt();
						y += x;
					}
					territorios.getPaises().get(i).setSoldados(x);
					if (y == 3) {
						y = 0;
						break;
					}
				}
				if(i == (territorios.getPaises().size()-1) && y < 2  ) {
					
					i = 0;
				}
			}
		}
		
	}
}
