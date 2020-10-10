package inicio.auto;
/*
 * Programar la clase auto que contenga: Tiene 5 velocidades y para hacer un
 * cambio debo tener la velocidad adecuada.
 *  0 -> cambio = 0 
 *  1-10 -> numeroCambio = 1 
 *  11-20 -> numeroCambio = 2 
 *  21-30 -> numeroCambio = 3 
 *  31-40 -> numeroCambio = 4 
 *  41+ -> numeroCambio = 5
 * 
 * int numeroCambio int velocidad
 * 
 * Programar getters y setters segun sea necesario Y los metodos acelerar,
 * frenar segun sea posible validando las posibilidades y metodos subirCambio y
 * bajarCambio
 * 
 * Proceso: subirCambio y luego acelerar validando la velocidad
 * 
 * 
 */
public class Auto {
	
	private Integer velocidad;
	private Integer numeroCambio;
	
	public Auto() {
		this.velocidad = 0;
		this.numeroCambio = 0;
	}
	
	public void acelerar() {
		System.out.println("subiendo velocidad");
		velocidad++;
	}
	
	public void frenar() {
		if(velocidad > 0) {
			System.out.println("bajando velocidad");
			velocidad--;
		} else {
			System.out.println("El auto esta frenado");
		}

	}
	
	public void subirCambio() {
		switch(numeroCambio) {
			case 0: 
				if(velocidad >= 1 && velocidad <=10) {
					numeroCambio++;
					System.out.println("paso a 1");
				}
				break;
			case 1: 
				if(velocidad >= 11 && velocidad <=20) {
					numeroCambio++;
					System.out.println("paso a 2");
				}
				break;
			case 2:
				if(velocidad >= 21 && velocidad <=30) {
					numeroCambio++;
					System.out.println("paso a 3");
				}
				break;
			case 3:
				if(velocidad >= 31 && velocidad <=40) {
					numeroCambio++;
					System.out.println("paso a 4");
				}
				break;
			case 4:
				if(velocidad >= 41) {
					numeroCambio++;
					System.out.println("paso a 5");
				}
				break;
			case 5:
				System.out.println("Ya estas en quinta");
				break;
			default:
				System.out.println("cambio invalido");
				break;
		}
	}

	public void bajarCambio() {
		switch(numeroCambio) {
			case 0: 
				System.out.println("Ya estas en 0");
				break;
			case 1: 
				if(velocidad >= 1 && velocidad <=10) {
					numeroCambio--;
					System.out.println("paso a 0");
				}
				break;
			case 2:
				if(velocidad >= 11 && velocidad <=20) {
					numeroCambio--;
					System.out.println("paso a 1");
				}
				break;
			case 3: 
				if(velocidad >= 21 && velocidad <=30) {
					numeroCambio--;
					System.out.println("paso a 2");
				}
				break;
			case 4:
				if(velocidad >= 31 && velocidad <=40) {
					numeroCambio--;
					System.out.println("paso a 3");
				}
				break;
			case 5: 
				if(velocidad >= 41) {
					numeroCambio--;
					System.out.println("paso a 4");
				}
				break;
			default:
				System.out.println("cambio invalido");
				break;
		}
	}
}
