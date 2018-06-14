package jogo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste {

	
	/**Testando retorno do metodo SorteiaDado*/
	@Test
	void test() {
		SorteiaDado teste = new SorteiaDado();
		assertTrue(teste.getDado1() >0 && teste.getDado1() <7);
	}
	void test1() {
		SorteiaDado teste = new SorteiaDado();
		assertTrue(teste.getDado2() >0 && teste.getDado2() <7);
	}
	void test2() {
		SorteiaDado teste = new SorteiaDado();
		assertTrue(teste.getDado3() >0 && teste.getDado3() <7);
	}
	void test3() {
		Dado teste = new Dado();
		assertTrue(teste.getDado3() <= teste.getDado2() && teste.getDado2() <= teste.getDado1());
	}
	
	
	}

