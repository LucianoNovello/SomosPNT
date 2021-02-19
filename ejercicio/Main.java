package ejercicio;

public class Main {

	public static void main(String[] args) {
		
		
		ListaProducto Lista = new ListaProducto();
		Lista.AgregarProducto();
		System.out.println(Lista.ListarProductos());
		System.out.println("======================================");
		System.out.println("El precio mas alto  "+ Lista.PrecioMaximo());
		System.out.println("el precio mas bajo  "+ Lista.PrecioMinimo());
		
		
			

	}

}
