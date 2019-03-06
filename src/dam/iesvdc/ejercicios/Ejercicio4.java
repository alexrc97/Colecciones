package dam.iesvdc.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

	private List<String> listaCadenas = new ArrayList<>();
	
	public List<String> getListaCadenas() {
		return listaCadenas;
	}

	public void addCadena(String cadena) {
		listaCadenas.add(cadena);
	}
	
	//buscamos una cadena en la coleccion
	public boolean buscarCadena(String cadena) {
		return listaCadenas.contains(cadena);
	}
	
	//eliminamos una cadena de la coleccion
	public void  quitarCadena(String cadena) {
		listaCadenas.remove(cadena);
	}
	
	//devolvemos una lista con las cadenas de mayor longitud
	public List<String> obtenerCadenas(){
		List<String> cadenasMayorLongitud = new ArrayList<>();
		int mayorLongitud = 0;
		for (String string : listaCadenas) {
			if (string.length() > mayorLongitud ) {
				mayorLongitud = string.length();//cambio a nueva longitud
				cadenasMayorLongitud.clear();//limpio la coleccion de cadenas
				cadenasMayorLongitud.add(string);//añado la palabra a la lista
			} else if (string.length() == mayorLongitud) {
				cadenasMayorLongitud.add(string);
			}
		}
		return cadenasMayorLongitud;
	}
}
