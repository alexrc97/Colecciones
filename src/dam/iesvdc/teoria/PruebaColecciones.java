package dam.iesvdc.teoria;

import java.util.Arrays;
import java.util.Scanner;

public class PruebaColecciones {

	public static void main(String[] args) {
		final int[] coleccion5numeros;
		coleccion5numeros= new int[5];
		Scanner sc = new Scanner (System.in);
		for (int i = 0;i < coleccion5numeros.length; i++) {
			System.out.println("Introduce un numero");
			coleccion5numeros[i]= sc.nextInt();
		}
		sc.close();
		System.out.println(Arrays.toString(coleccion5numeros));
		int numeroMasAlto = Integer.MIN_VALUE;
		for ( int i = 0; i < coleccion5numeros.length; i++) {
			if (coleccion5numeros[i] > numeroMasAlto) {
				numeroMasAlto = coleccion5numeros[i];
			}	
		}
		System.out.println("El numero mas alto de la coleccion es: " 
				+ numeroMasAlto);
	}

}
