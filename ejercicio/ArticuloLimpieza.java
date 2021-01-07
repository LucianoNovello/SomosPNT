package ejercicio;

import java.text.DecimalFormat; 

public class ArticuloLimpieza extends Producto {
private float Contenido;
	
	public ArticuloLimpieza(float precio, String nombre, float Contenido) {
		super(precio, nombre);
		this.Contenido = Contenido;
	}

	public float getContenido() {
		return Contenido;
	}

	public void setLitro(float contenido) {
		this.Contenido = contenido;
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat ("#");
		return super.toString()+" /// Contenido = "+df.format(getContenido())+"ml"+" /// Precio = $"+df.format(getPrecio()) ;
	}
}
