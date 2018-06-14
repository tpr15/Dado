/*try {
		JogoDAO dao = new JogoDAO();
		dao.createGame(3, 4);
	}catch(Exception e) {
		JOptionPane.showMessageDialog(null, e);		
	}*/package jogo;

public class CarregaContinente {
	public void carregaContinente() {
		Continente AmericaDoSul = new Continente();
		AmericaDoSul.setNome("AmericaDoSul");
		AmericaDoSul.addTerritorios("brasil");
		
	}

}
