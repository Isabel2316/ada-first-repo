package inicio;

public class Bicibleta {
	
	private int velocidad;

	public int frenar(int menosVelocidad) {
		if(velocidad - menosVelocidad >= 0) {
			velocidad -= menosVelocidad;
		} else {
			System.out.println("La velocidad actual no permite frenar con " + menosVelocidad);
		}
		return velocidad;
	}
	
	public void detener() {
		velocidad = 0;
	}
}
