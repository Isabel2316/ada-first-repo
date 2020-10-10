package inicio.envio;

import java.util.Scanner;

public class AppEnvio {

	public static void main(String[] args) {
		System.out.println("Sistema de envios");
		System.out.println();

		float pesoEnvio = solicitarPesoEnvio();
		int zona;
		while (pesoEnvio != 0) {
			zona = solicitudZona();
			Paquete paq = new Paquete();
			paq.setPeso(pesoEnvio);
			if (paq.isEnviable()) {
				paq.setZona(zona);
				float precioTotal = paq.calcularPrecio();
				System.out.println("El valor del envio es: " + precioTotal);
			} else {
				System.out.println("El paquete no se puede enviar");
			}
			pesoEnvio = solicitarPesoEnvio();
		}
		
	}

	private static int solicitudZona() {
		System.out.println("Ingrese zona de envio:");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	private static float solicitarPesoEnvio(){
		System.out.println("Ingrese peso del envio: (0=Finalizar)");
		Scanner sc = new Scanner(System.in);

		return sc.nextFloat();
	 }	
	}
