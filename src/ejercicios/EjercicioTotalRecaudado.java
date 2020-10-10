package ejercicios;

import java.util.Scanner;

//	Desarrollar un sistema que permita el ingreso de totales recaudados de lunes a viernes, 
//donde ademas se pueda modificar uno de los valores ingresados seleccionando el numero de dia.
//Tambien se deberan poder listar los valores ingresados.(opcional ordenado de mayor a menor)
//Todas las funciones se codificaran en un menu con valores enteros hasta que el usuario ingrese 
//cero para salir. (1. agregar  2. listar 3. modificar 0. salir)

public class EjercicioTotalRecaudado {
	public static void main(String[] args) {
		darBienvenida();	
	}
	
	private static void darBienvenida() {
		// TODO Auto-generated method stub
	System.out.println("Bienvenido al Sistema de Recaudacion");
	Scanner sc= new Scanner(System.in);
	System.out.println("Ingrese las siguente opciones, 1 Agregar, 2 Listar,3 Modificar,0 Salir");
	int menu = sc.nextInt();
		while(menu!=0) {
		}
	}

}
