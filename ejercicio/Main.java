package ejercicio;

public class Main {

	public static void main(String[] args) {
		
		
		ListaProducto Lista = new ListaProducto();
		Lista.AgregarProducto();
		System.out.println(Lista.ListarProductos());
		System.out.println("======================================");
		System.out.println("Producto mas caro "+ Lista.PrecioMaximo());
		System.out.println("Producto mas barato "+ Lista.PrecioMinimo());
		
		
		
			

	}

}