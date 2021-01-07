package ejercicio;

public class Producto implements Comparable<Producto>{
	private float precio;
	private String nombre;
	





	public Producto(float precio, String nombre) {
		this.precio = precio;
		this.nombre= nombre;
	}
	public Producto () {
		this.precio =0;
		this.nombre= "";
		
	}
	public Producto (float precio) {
		this.precio= precio;
		this.nombre="";
	}

	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
@Override
	public int compareTo(Producto o) {
		        int resultado=0;
		        if (this.getPrecio() < o.getPrecio()) { 
		        	resultado = -1;      }
		        else if (this.getPrecio() > o.getPrecio()) {  
		        	resultado = 1;      }
		       
		        return resultado;
		        }
		     
		    

	
	@Override
	public String toString() {
		return "Nombre = "+getNombre();
	}

}
