package ejercicios;

import java.util.Scanner;

//Se venden boletos de una funcion numerados del 0-49. Cada uno de esos boletos

//se corresponde con un asiento
//Solicitar que asiento elige la persona al  comprarlo y marcarlo con un valor 1
//hasta que se ingrese asiento numero 99
//Listar los asientos vendidos

public class Ejercicio997BoletosTeatro {

	private static final int TOTAL_BUTACAS = 50;

	public static void main(String[] args) {

		int butacas[] = new int[TOTAL_BUTACAS];

		for (int i = 0; i < TOTAL_BUTACAS; i++) {
			butacas[i] = 0;
		}

		int solicitudAsiento;

		System.out.println("Bienvenida al sistema de venta de boletos");
		System.out.println("=========================================");
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Ingrese numero de asiento");
		solicitudAsiento = sc.nextInt();

		while (solicitudAsiento != 99) {

			System.out.println("Butaca " + solicitudAsiento + "=" + butacas[solicitudAsiento]);
			if (butacas[solicitudAsiento] == 0) {
				butacas[solicitudAsiento] = 1;
				System.out.println("Venta confirmada");
			} else {
				System.out.println("Butaca ya vendida. Seleccione otra ubicacion");
			}

			System.out.println("Ingrese numero de asiento");
			solicitudAsiento = sc.nextInt();
		}

		sc.close();
		int contador = 0;
		System.out.println("Mostrar butacas vendidas");

		for (int i = 0; i < butacas.length; i++) {
			if (butacas[i] == 1) {
				System.out.println("Butaca" + i);
				contador++;
			}
		}

		System.out.println("Butacas vendidas: " + contador);

	}
}

