package ejercicio;
import java.util.ArrayList;
public class ListaProducto{
	ArrayList<Producto>ListaProductos;

	public ListaProducto() {
	
		ListaProductos = new ArrayList <Producto>();
	}
	
		
	
	public void AgregarProducto() 
	{
	Liquido CocaZero = new Liquido (20f,"CocaZero", 1.5f);
	ListaProductos.add(CocaZero);
	Liquido Coca = new Liquido (18f,"Coca", 1.5f);
	ListaProductos.add(Coca);
	ArticuloLimpieza ShampooSedal  = new ArticuloLimpieza (19f,"Shampoo Sedal", 500f);
	ListaProductos.add(ShampooSedal);
	Frutas Frutilla = new Frutas (64f,"Frutilla", "kilo");
	ListaProductos.add(Frutilla);
	}
	
	public String ListarProductos() {
		StringBuilder buildi = new StringBuilder();
		for (Producto elem : ListaProductos) {
			buildi.append( elem.toString()+"\n" );
		}
		
		return buildi.toString();
	
	
	}



	public Producto PrecioMinimo () 
	{
			Producto minimo = new Producto(9999);
			int respuesta = 0;
			for (Producto elem : ListaProductos) {
				 respuesta = minimo.compareTo(elem);
				if(respuesta == 1) {
					minimo.setNombre(elem.getNombre());
					minimo.setPrecio(elem.getPrecio());
					
				}
			}
			return minimo;
			
		}
	public Producto PrecioMaximo() 
	{
			Producto maximo = new Producto();
			int respuesta = 0;
			for (Producto elem : ListaProductos) {
				 respuesta = maximo.compareTo(elem);
				if(respuesta == -1) {
					maximo.setNombre(elem.getNombre());
					maximo.setPrecio(elem.getPrecio());
					
				}
			}
			return maximo;
			
		}
	
	


	}


	

