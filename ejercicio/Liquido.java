package ejercicio;

import java.text.DecimalFormat;

public class Liquido extends Producto {

	private float Litro;
	
	public Liquido(float precio, String nombre, float Litro) {
		super(precio, nombre);
		this.Litro = Litro;
	}

	public float getLitro() {
		return Litro;
	}

	public void setLitro(float litro) {
		this.Litro = litro;
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat ("#");
		return super.toString()+" /// Litro = "+(getLitro())+" /// Precio =  $"+df.format(getPrecio());
	}
}
