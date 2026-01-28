package colecciones_001;

import java.util.ArrayList;

public class Aplicacion {
	
	public Aplicacion() {
		ArrayList<Gato> gatos = new ArrayList<>();
		gatos.add(new Gato());
		
		ArrayList<Object> otrosAnimales = new ArrayList<>();
		otrosAnimales.add(new Gato());		
		Gato unGato = (Gato)otrosAnimales.get(0);
		
		otrosAnimales.add(new Perro());
		//La siguiente linea da error en tiempo de ejecución
		//Gato otroGato = (Gato)otrosAnimales.get(1);
		
		Object unObjeto = otrosAnimales.get(0);
		//La siguiente línea da error en tiempo de compilación
		//unObjeto.hablar();
		
	}
	
	public static void main(String[] args) {
		new Aplicacion();
		
	}
}