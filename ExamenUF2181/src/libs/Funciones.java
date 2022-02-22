package libs;
/**
 * Clase de utilidades con funciones varias
 * @author Miguel Manrique Arroyo
 *
 */

public class Funciones {
	/**
	 * Funcion que dados tres numeros enteros devuelve el que se encuentra
	 * en medio segun la escala real.
	 * @param num1 int numero entero cualquiera
	 * @param num2 int numero entero cualquiera
	 * @param num3 int numero entero cualquiera
	 * @return int numero que se encuentra en medio.
	 */
	public int devuelveCentral(int num1, int num2, int num3) {
		
		int enMedio;
		
		if ((num1>num2) && (num1<num3)) {
			enMedio=num1;
		}  else if  ((num2>num1) && (num2<num3)) {
			enMedio= num2;
		} else {
			enMedio = num3;
		}
		return enMedio;
	}
	/**
	 * Funcion que dado un a�o determina si es a�o bisiesto o no.
	 * @param a�o int a�o del cual se quiere saber si es bisiesto.
	 * @return true si el a�o es bisiesto, false si el a�o no es bisiesto.
	 */
	public boolean esBisiesto(int a�o) {
		boolean bisiesto = false;
		if((a�o%4 == 0) && (a�o%100 !=0)){
			bisiesto = true;
		}else if ((a�o%4 ==0) && (a�o%100 ==0) && (a�o%400 ==0)) {
			bisiesto = true;
		}
		return bisiesto;
	}
	/**
	 * Funcion que dado un vector de enteros segun la posicion de cada dato
	 * determinara si es capicua o no.
	 * @param v int [] vector con los numeros
	 * @return true si el vector es capicua, false si el vector no es capicua.
	 */
	public boolean esCapicua(int v[]) {
		boolean capicua = true;
		
		for (int i=0, j=v.length-1; i<v.length/2; i++,j--) {
			if (v[i]!=v[j]) {
				capicua=false;
			}
		}
		return capicua;
	}

	/**
	 * Funcion que dados dos vectores de enteros devolvera un vector con la suma
	 * de estos segun su posicion.
	 * @param v int vector a sumar
	 * @param v2 int vector a sumar
	 * @return Devuelve un vector de enteros con la suma de v y v2.
	 */
	public int [] sumaVectores(int v[], int v2[]) {
		int vector_suma [] = new int[v.length];
		
		if (v.length!=v2.length) 
		   throw new ArithmeticException("Los vectores deben tener el mismo tama�o");
		
		for (int i = 0; i < vector_suma.length; i++) {
			vector_suma[i]=v[i]+v2[i];
		}
		return vector_suma;
	}
	
	
}
