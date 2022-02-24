package br.edu.insper.desagil.aula2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FaixaTest {
	private Faixa f;

	@BeforeEach
	private void setUp() {
		f = new Faixa();
	}

	@Test
	void devolveJovemSeRecebe1() {
		assertEquals("jovem", f.calcula(1));
	}

	@Test
	void devolveJovemSeRecebe9() {
		assertEquals("jovem", f.calcula(9));
	}

	@Test
	void devolveJovemSeRecebe17() {
		assertEquals("jovem", f.calcula(17));
	}

	@Test
	void devolveAdultoSeRecebe18() {
		assertEquals("adulto", f.calcula(18));
	}

	@Test
	void devolveAdultoSeRecebe19() {
		assertEquals("adulto", f.calcula(19));
	}

	@Test
	void devolveAdultoSeRecebe39() {
		assertEquals("adulto", f.calcula(39));
	}

	@Test
	void devolveAdultoSeRecebe59() {
		assertEquals("adulto", f.calcula(59));
	}

	@Test
	void devolveIdosoSeRecebe60() {
		assertEquals("idoso", f.calcula(60));
	}

	@Test
	void devolveIdosoSeRecebe61() {
		assertEquals("idoso", f.calcula(61));
	}

	@Test
	void devolveIdosoSeRecebe80() {
		assertEquals("idoso", f.calcula(80));
	}

	@Test
	void devolveIdosoSeRecebe100() {
		assertEquals("idoso", f.calcula(100));
	}
}
