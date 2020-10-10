package ejercicios;

import java.util.Scanner;
/*
 *TATETI:
 * Un tablero de 3 x 3 matriz [fila][columna]
 * Dos jugadores que ingresan las coordenadas de cada ficha por teclado
 * Una vez que tengo fila y columna de la ficha, muestro el tablero con X o 0
 * Verificar si es posible la posicion de la ficha y ver si hay ganador
 * Mientras no haya ganador continua el siguiente jugador
 * 
 *    |   |
 * ---|---|---
 *    |   | X  -> tablero[1][2]
 * ---|---|----
 *    |   | 
 */
 
public class Ejercicio901Tateti {

	private static int FILA=3;
	private static int COLS=3;
	
	public static void main(String[] args){
		
		char [][]tablero= new char [FILA][COLS];
		for (int i=0; i < FILA; i++){
			for(int j=0; j < COLS; j++){
				tablero[i][j]='B';
			}
		}
		juego(tablero);
	}
	public static void juego(char[][] tablero) {
		boolean ganador = false;
		int contador = 2;
		int turno = 0;
		System.out.println("JUEGO TA-TE-TI");
		System.out.println("**************");
		System.out.println();
		imprimir(tablero);
		// MIENTRAS NO HAYA GANADOR O NO HAY MAS CASILLEROS LIBRES
		while (!ganador && contador < 9) {
			// JUGAR FICHA
			contador++;
			turno = contador % 2;
			boolean jugadaValida = false;
			do {
				jugadaValida = jugarFicha(turno, tablero);
			} while (!jugadaValida);
				
			imprimir(tablero);
			ganador = hayGanador(tablero);
			if (ganador) {
				System.out.println("GANASTE!!! JUGADOR " + (turno + 1));
			}
		}
	}

	private static boolean jugarFicha(int turno, char[][] tablero) {
		Scanner sc = new Scanner(System.in);
		System.out.println("JUGADOR " + (turno) + " Ingrese fila : ");
		int fila = sc.nextInt();
		System.out.println("Ingrese columna: ");
		int columna = sc.nextInt();
		
		if(fila >= FILA || columna >= COLS) {
			System.out.println("Jugada no valida");
			return false;
		} else if (tablero[fila][columna] == 'X' || tablero[fila][columna] == 'O') {
			System.out.println("Jugada no valida");
			return false;
		} else {
			if (turno == 0) {
				tablero[fila][columna] = 'X';
			} else {
				tablero[fila][columna] = 'O';
			}
			return true;
		}
	}

	private static boolean hayGanador(char[][] tablero) {
		boolean cond1 = tablero[0][0] == tablero[0][1] && tablero[0][0] == tablero[0][2]
				&& (tablero[0][0] == 'X' || tablero[0][0] == 'O');
		boolean cond2 = tablero[1][0] == tablero[1][1] && tablero[1][0] == tablero[1][2]
				&& (tablero[1][0] == 'X' || tablero[1][0] == 'O');
		boolean cond3 = tablero[2][0] == tablero[2][1] && tablero[2][0] == tablero[2][2]
				&& (tablero[2][0] == 'X' || tablero[2][0] == 'O');

		boolean cond4 = tablero[0][0] == tablero[1][0] && tablero[0][0] == tablero[2][0]
				&& (tablero[0][0] == 'X' || tablero[0][0] == 'O');
		boolean cond5 = tablero[0][1] == tablero[1][1] && tablero[0][1] == tablero[2][1]
				&& (tablero[0][1] == 'X' || tablero[0][1] == 'O');
		boolean cond6 = tablero[0][2] == tablero[1][2] && tablero[0][2] == tablero[2][2]
				&& (tablero[0][2] == 'X' || tablero[0][2] == 'O');

		boolean cond7 = tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2]
				&& (tablero[0][0] == 'X' || tablero[0][0] == 'O');
		boolean cond8 = tablero[0][2] == tablero[1][1] && tablero[0][2] == tablero[2][0]
				&& (tablero[0][2] == 'X' || tablero[0][2] == 'O');

		return cond1 || cond2 || cond3 || cond4 || cond5 || cond6 || cond7 || cond8;

	}

	private static void imprimir(char[][] tablero) {
		for (int fila = 0; fila < FILA; fila++) {
			for (int col = 0; col < COLS; col++) {
				System.out.print(" " + tablero[fila][col] + " ");
			}
			System.out.println();
		}
	}
}
	
