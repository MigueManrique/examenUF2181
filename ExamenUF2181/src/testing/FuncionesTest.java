package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import libs.Funciones;

class FuncionesTest {
	
	public static Funciones funciones;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		funciones = new Funciones();
	}
	
	
	@Test
	void devuelveCentralTest() {
		assertEquals(7, funciones.devuelveCentral(7, 3, 9));
		assertEquals(2, funciones.devuelveCentral(-3, 2, 9));
		assertEquals(-9, funciones.devuelveCentral(0, -15, -9));
	}
	
	@Test

	void esBisiestoTest() {
		assertTrue(funciones.esBisiesto(1904));
		assertFalse(funciones.esBisiesto(1900));
		assertTrue(funciones.esBisiesto(1972));
		assertFalse(funciones.esBisiesto(2100));
	}
	@Test
	void esCapicuaTest() {
		int v[] = {1,9,9,1};
		assertTrue(funciones.esCapicua(v));
		int v2[] = {1,1,1,1};
		assertTrue(funciones.esCapicua(v2));
		int v3[] = {8,9,9,1};
		assertFalse(funciones.esCapicua(v3));
		int v4[] = {1,8,9,1};
		assertFalse(funciones.esCapicua(v4));
		int v5[] = {1,9,9,8};
		assertFalse(funciones.esCapicua(v5));
	}
	
	@Test
	void sumaVectoresTest(){
		int v1[] = {1,2,3,4};
		int v2[] = {4,3,2,1};
		int vrespuesta1[] = {5,5,5,5};
		assertArrayEquals(vrespuesta1, funciones.sumaVectores(v1, v2));
		int v3[] = {1,8,3,12};
		int v4[] = {-4,0,2,-11};
		int vrespuesta2[] = {-3,8,5,1};
		assertArrayEquals(vrespuesta2, funciones.sumaVectores(v3, v4));
		int v5[] = {1,8,3,12};
		int v6[] = {-4,0,2,-11,10};
		assertThrows(ArithmeticException.class, ()->funciones.sumaVectores(v5, v6));
	}

}
