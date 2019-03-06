package dam.iesvdc.teoria;

public class ArraysBidimensionales {

	public static void main(String[] args) {
		
		
		// Definimos arrays bidimensional
            final int FILAS    = 4;
            final int COLUMNAS = 3;
            int[][] numeros = new int[FILAS][COLUMNAS];
            
            //rellenamos de manera aleatorio
            for(int i = 0; i < FILAS; i++) { // Rellenamos las filas
            	for(int j = 0; j < COLUMNAS; j++) {
            		numeros[i][j] = (int) (Math.random() * 500);
            	}
            	
            }
            //Mostramos los datos del array
            for(int i = 0; i < FILAS; i++) {
            	for(int j = 0; j < COLUMNAS; j++ ) {
            		System.out.printf("%4d",numeros[i][j]);
            	}
            	System.out.println();
            }
            
            //Buscamos el numero mas grande y mas pequeño
            int maximoValor = numeros[0][0], minimoValor = numeros[0][0];// Se puede hacer en una misma linea o sentencia
            for(int i = 0; i < FILAS; i++) {
            	for(int j = 0; j < COLUMNAS; j++) {
            		if (numeros[i][j] > maximoValor) {
            			maximoValor = numeros[i][j];
            			continue;
            		}
            		if(numeros[i][j] < minimoValor) {
            			minimoValor = numeros[i][j];
            		}
            		
            	}
            }
            System.out.printf("El maximo valor es %d y el menor vale %d%n",maximoValor,minimoValor);
	}

}
