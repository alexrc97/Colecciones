package dam.iesvdc.tests;

import java.util.Scanner;

import dam.iesvdc.ejercicios.Ejercicio4;

public class TestEjercicio4 {

	public static void main(String[] args) {

		Ejercicio4 c = new Ejercicio4();
		System.out.println("Introduce palabras. Para acabar usa FIN");
		Scanner sc = new Scanner(System.in);
		
		String cadena = sc.next();
		if(!cadena.equalsIgnoreCase("fin")) {
			c.addCadena(cadena);
		}
		
		while (!cadena.equalsIgnoreCase("FIN") && sc.hasNext()) {
			cadena = sc.next();
			c.addCadena(cadena);
		}
		sc.close();
		System.out.println(c.getListaCadenas());
		System.out.println(c.obtenerCadenas());
	}
}
