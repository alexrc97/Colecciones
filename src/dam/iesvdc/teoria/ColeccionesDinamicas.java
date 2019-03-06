package dam.iesvdc.teoria;

import java.util.Scanner;
import java.util.ArrayList;

public class ColeccionesDinamicas {
	public static void main (String [] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		Scanner sc = new Scanner (System.in);
		System.out.println("¿Cuantos datos quiere introducir?");
		int cantidadValores = sc.nextInt();
		for (int i = 0; i < cantidadValores; i++) {
			System.out.println("Introduce número de la posición "+ i);
			lista.add(sc.nextInt());
		}
		sc.close();
		double sumaValores = 0;
		for (int i = 0; i < lista.size(); i++) {
			sumaValores = sumaValores + lista.get(i);

		}
		//double valorMedio= sumaValores/cantidadValores;
		System.out.println("El valor medio de los numeros introducidos en la coleccion es: "
				+ (sumaValores/cantidadValores));
		int valorMaximo = lista.get(0);
		int valorMinimo = lista.get(0);
		for (Integer valorLista : lista) {
			if (valorLista > valorMaximo) {
				valorMaximo = valorLista;
				
			}
			if (valorLista < valorMinimo) {
				valorMinimo = valorLista; 
			}
		}
		System.out.printf("Valor mas pequeño: %d%nValor mas grande: %d%n", valorMinimo,valorMaximo);
	}
}
