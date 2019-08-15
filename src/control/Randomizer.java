package control;


import java.util.EnumSet;

public class Randomizer {
	/**
	 * Obtiene un color aleatorio
	 * @return Color color obtenido
	 */
	public static Color colorAleatorio() {
		double randomCrudo = Math.random() * 5;
		int random = (int) Math.round(randomCrudo);
		switch(random) {
		case 0:
			return Color.AZUL;
		case 1:
			return Color.BLANCO;
		case 2:
			return Color.INCOLORO;
		case 3: 
			return Color.NEGRO;
		case 4:
			return Color.ROJO;
		case 5:
			return Color.VERDE;
		default:
			return null;
		}
	}
	
	/**
	 * Obtiene varios colores aleatorios
	 * @param numColores numero de colores a obtener aleatoriamente
	 * @return Colo[] array de colores de tamaño numColores.
	 */
	public static Color[] coloresAleatorios(int numColores) {
		if (numColores > 6 || numColores < 1) {
			throw new IndexOutOfBoundsException();
		}
		EnumSet<Color> colores;
		colores = EnumSet.allOf(Color.class);
		
		Color[] coloresObtenidos = new Color[numColores];
		boolean obtenido = false;
		Color c = null;
		for (int i=0;i<numColores;i++) {
			while(!obtenido) {
				c = colorAleatorio();
				if(colores.contains(c)) {
					obtenido=true;
				}
				
			}
			coloresObtenidos[i] = c;
			colores.remove(c);
			obtenido = false;
		}
		return coloresObtenidos;
	}
	
	public static int numeroDeCartasAJugar() {
		double randomCrudo = Math.random() * 2;
		int random = (int) Math.round(randomCrudo);
		switch (random) {
		case 0:
			return 40;
		case 1:
			return 60;
		case 2:
			return 80;
		default:
			return -1;
		}
	}
}
