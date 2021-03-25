package com.alumne.accions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AccionsTest {

	@Test
	void testTickerNoValid() {
		Accions Tickers = new Accions();
		int nouTicker = Tickers.registrarPreu(25, "STD");
		assertEquals(-1, nouTicker, "error. no es detecta ticker invalid");
	}

	@Test
	void testPreuMenor() {
		Accions Preus = new Accions();
		int nouPreu = Preus.registrarPreu(-1.0, "AMZN");
		assertEquals(-2, nouPreu, "error. no es detecta preu invalid");
	}

	@Test
	void testPreuMajor() {
		Accions Preus = new Accions();
		int nouPreu = Preus.registrarPreu(550.0, "AMZN");
		assertEquals(-3, nouPreu, "error. no es detecta preu invalid");
	}

	@Test
	void testValorRegistrat() {
		Accions Valors = new Accions();
		int nouValor = Valors.registrarPreu(25, "AMZN");
		assertEquals(0, nouValor, "error. no es detecten valors erronis");

	}
}
