package jogo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste {

	
	/**Testando retorno das funções*/
	@Test
	void test() {
		SorteiaDado teste1 = new SorteiaDado();
		assertTrue(teste1.getDado1() >0 && teste1.getDado1() <7);
	
		SorteiaDado teste2 = new SorteiaDado();
		assertTrue(teste2.getDado2() >0 && teste2.getDado2() <7);
	
		SorteiaDado teste3 = new SorteiaDado();
		assertTrue(teste3.getDado3() >0 && teste3.getDado3() <7);
	
		//Dado teste4 = new Dado();
		//assertTrue(teste4.getDado3() >= teste4.getDado2() && teste4.getDado2() >= teste4.getDado1());
	
		CarregaPais teste5 = new CarregaPais();
		assertTrue(teste5.carregaPais().getPaises().size()== 24 );
	}
	
	
	}

