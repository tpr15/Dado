package jogo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void test() {
		SorteiaDado teste = new SorteiaDado();
		assertTrue(teste.getDado1() >0 && teste.getDado1() <7);
	}

	}

