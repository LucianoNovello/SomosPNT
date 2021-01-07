package ejercicio;

import java.text.DecimalFormat;

public class Frutas extends Producto {

private String kilo;
	
	public Frutas(float precio, String nombre, String kilo) {
		super(precio, nombre);
		this.kilo = kilo;
	}

	public String getKilo() {
		return kilo;
	}

	public void setKilo(String kilo) {
		this.kilo = kilo;
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat ("#");
		return super.toString()+" /// Precio = $"+df.format(getPrecio())+" /// Unidad de venta = "+getKilo();
	}
}
