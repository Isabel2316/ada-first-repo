package ejercicios;
	
import java.util.Scanner;

public class Ejercicio999JuegoAhorcado {

	private static final int MIN_PALABRA = 4;
	private static final int MAX_PALABRA = 10;
	private static final int MAX_ERRORES = 10;

	public static void main(String[] args) {
		// generar palabra
		String palabra = generarPalabra();

		// repetir ingreso letras hasta adivinar o cantidad jugadas < 10
		int intentosFallidos = adivinar(palabra);

		// mostrar mensaje de puntos
		mostrarPuntos(intentosFallidos);
	}

	private static void mostrarPuntos(int intentosFallidos) {
		// Calculo de puntaje en base a intentos (1 intentos -> mayor puntaje)
		// 10 intentos -> sin puntaje
		int puntaje = MAX_PALABRA - intentosFallidos;
		System.out.println("Puntaje obtenido: " + puntaje);
	}

	/**
	 * Este metodo recibe la palabra a adivinar y devuelve el numero de intentos
	 * fallidos en que fue adivinada la palabra
	 * 
	 * @param palabra
	 * @return
	 */
	private static int adivinar(String palabra) {
		// pedir una letra
		int aciertos = 0;
		int errores = 0;
		boolean[] resultado = new boolean[palabra.length()];

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una letra");
		String letra = sc.next();

		// mientras cantidad letras acertadas < total letras
		// y cantidad errores = 10
		while (aciertos < palabra.length() && errores != MAX_ERRORES) {

			// buscar esa letra en la palabra

			int posicion = palabra.indexOf(letra); // si la letra no existe devuelve -1

			if (posicion != -1) {
				resultado[posicion] = posicion != -1;
				aciertos++;
			} else {
				errores++;
			}

			for (int i = 0; i < palabra.length(); i++) {
				// si existe mostrar letra, contar acierto
				if (resultado[i]) {
					System.out.print(" " + palabra.charAt(i) + " ");
				} else {
					// sino mostrar _, contar error
					System.out.print(" _ ");
				}
			}
			// devuelve la letra de la palabra en la posicion indicada

			// mostrar _ O _ _ (Errores: 0)
			System.out.println("Errores: " + errores);

			// pedir letra
			System.out.println("Ingrese una letra");
			letra = sc.next();

		}

		if (errores == MAX_ERRORES) {
			System.out.println("Siga participando!!!");
		} else {
			System.out.println("Ganaste!!!!");
		}
		return errores;
	}

	private static String generarPalabra() {
		Scanner sc = new Scanner(System.in);
		// solicitar ingreso palabra secreta
		System.out.println("Ingrese palabra secreta");
		String palabra = sc.next();

		// minimo 4 letras
		// maximo 10 letras
		while (palabra.length() < MIN_PALABRA || palabra.length() > MAX_PALABRA) {
			System.out.println("La palabra tiene que tener como mínimo " + MIN_PALABRA);
			System.out.println("La palabra tiene que tener como máximo " + MAX_PALABRA);
			System.out.println();
			System.out.println("Ingrese palabra secreta");
			palabra = sc.next();
		}

		return palabra;
	}

}
