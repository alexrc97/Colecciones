package dam.iesvdc.teoria;

import java.util.Arrays;

public class Colecciones {

	public static void main(String[] args) {

		int lista1[] = new int[10];
		int lista2[] = new int[10];
		for (int i = 0; i < lista1.length; i++) {
			lista1[i] = 5;
		}


		for (int i = 0; i < lista2.length; i++) { 
			Arrays.fill(lista2,8);
		}
		toString(lista1, lista2);

	}
	public static void toString (int a[], int b[]) {
		 System.out.printf("%d%d%n",a,b);

	}

}
