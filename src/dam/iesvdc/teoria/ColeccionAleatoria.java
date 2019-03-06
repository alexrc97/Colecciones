package dam.iesvdc.teoria;

import java.util.Arrays;

public class ColeccionAleatoria {
	public static void main (String [] args) {
		numerosAleatorios();
		
	}
	public static void numerosAleatorios () {
	final int [] coleccion100numeros = new int [100];
		for (int i = 0; i < coleccion100numeros.length ; i++) {
			coleccion100numeros[i] = (int) (Math.random()*100);
		}
		System.out.println(Arrays.toString(coleccion100numeros));
		System.out.println ("El valor medio es " + valorMedio(coleccion100numeros));
		System.out.println("El valor de la desviacion tipica es : " + desviacionTipica(coleccion100numeros));
	}
	public static double valorMedio (int a[]) {
		int sumaValores = 0;
		for (int i = 0; i < a.length; i++) {
			sumaValores = sumaValores + a[i];
		}
		int media = sumaValores/a.length;
		return media;
	}
	public static double desviacionTipica (int a []) {
		double suma = 0;
		for (int i = 0; i < a.length; i++) {
			suma += Math.pow(a[i]-valorMedio(a), 2);
		}
		return Math.sqrt(suma/a.length);
		
	}
}
