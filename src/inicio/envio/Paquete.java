package inicio.envio;

public class Paquete {

	public static float PRECIO_ZONA_1 = 10;
	public static float PRECIO_ZONA_2 = 20;
	public static float PRECIO_ZONA_3 = 30;

	private float peso;
	private int zona;
	private boolean enviable;

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		if (peso <= 5000) {
			enviable = true;
		} else {
			enviable = false;
		}

		this.peso = peso;
	}

	public int getZona() {
		return zona;
	}

	public void setZona(int zona) {
		this.zona = zona;
	}

	public boolean isEnviable() {
		return enviable;
	}

	public void setEnviable(boolean enviable) {
		this.enviable = enviable;
	}

	public float calcularPrecio() {
		float precio = 0;
		switch (zona) {
		case 1:
			precio = PRECIO_ZONA_1 * peso;
			break;
		case 2:
			precio = PRECIO_ZONA_2 * peso;
			break;
		case 3:
			precio = PRECIO_ZONA_3 * peso;
			break;
		}
		return precio;
	}
}

