package principal;

import java.util.LinkedList;
import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {
		
	    //Camiones
	    Camion c1 = new Camion(0, "1111 AAA");
	    c1.cargarProducto(new Producto(0, "Ensalada", 1.25, Categoria.COMIDA));
	    c1.cargarProducto(new Producto(1, "Pan", 0.75, Categoria.COMIDA));
	    c1.cargarProducto(new Producto(2, "Camiseta", 10, Categoria.ROPA));
	    c1.cargarProducto(new Producto(3, "Pantalón", 12.5, Categoria.ROPA));
	    Camion c2 = new Camion(1, "2222 BBB");
	    c2.cargarProducto(new Producto(4, "Plato", 2.8, Categoria.BAZAR));
	    c2.cargarProducto(new Producto(5, "Tendedero", 10.75, Categoria.BAZAR));
	    c2.cargarProducto(new Producto(6, "Alicate", 5, Categoria.HERRAMIENTA));
	    c2.cargarProducto(new Producto(7, "Martillo", 13, Categoria.HERRAMIENTA));
	    LinkedList<Camion> camiones = new LinkedList<Camion>();
	    camiones.add(c1);
	    camiones.add(c2);
	    
	    
	    
	    //Productos del supermercado
	    LinkedList<Producto> productosSupermercado = new LinkedList<Producto>();
	    
	    //Reponedores
	    Reponedor r1 = new Reponedor(0, "Ernesto");
	    Reponedor r2 = new Reponedor(1, "Julia");
	    LinkedList<Reponedor> reponedores = new LinkedList<Reponedor>();
	    reponedores.add(r1);
	    reponedores.add(r2);        
	    
	    Scanner numeros = new Scanner(System.in);
	    
	    int op;
	    
		do {
	        System.out.println("Operaciones disponibles");
	        System.out.println("-----------------------");
	        System.out.println("1. Descargar camión");
	        System.out.println("2. Listar productos supermercado");
	        System.out.println("3. Mostrar beneficios");
	        System.out.println("4. Nuevo Camion");
	        System.out.println("5. Comprar");
	        System.out.println("4. Salir");
	        op = numeros.nextInt();
	        
	        switch (op) {
	            case 1:
	            	System.out.println("-- DESCARGAR CAMION --");
	            	System.out.println("Introduzca el id del camion a descargar: ");
	            	int camion = numeros.nextInt();
	            	
	            	for (int i = 0; i < camiones.size(); i++) {
						if(camiones.get(i).getId() == camion) {
							System.out.println("Introduzca el id del reponedor que va a descargarlo: ");
							int reponedor = numeros.nextInt();
							for (int j = 0; j < reponedores.size(); j++) {
								if(reponedores.get(j).getId() == reponedor) {
									reponedores.get(reponedor).descargarCamion(camiones.get(camion), productosSupermercado);
								for (int h = 0; h < productosSupermercado.size(); h++) {
									productosSupermercado.get(h).setPrecio(productosSupermercado.get(h).getPrecio() + (productosSupermercado.get(h).getPrecio()*0.1));
								}
							}
						}
					}
	            	}
	                break;
	            case 2:
	            	System.out.println("-- LISTAR PRODUCTOS --");
	            	System.out.println(productosSupermercado.toString());
	                break;
	            case 3:
	            	System.out.println("-- MOSTRAR BENEFICIOS --");
	            	System.out.println("Introduzca el id del camion a ver los beneficios: ");
	            	int camion1 = numeros.nextInt();
	            	
	            	for (int i = 0; i < camiones.size(); i++) {
						if(camiones.get(i).getId() == camion1) {
							System.out.println(camiones.get(camion1).beneficio());
						}
	            	}
	                break;
	            case 4:
	                System.out.println("SALIENDO DEL PROGRAMA");
	                break;
	            case 5:
	            	System.out.println("-- COMPRAR --");
	            	System.out.println("Introduzca el id del producto a comprar: ");
	            	int producto = numeros.nextInt();
	            	
	            	for (int i = 0; i < productosSupermercado.size(); i++) {
						if(productosSupermercado.get(i).getId() == producto) {
							System.out.println(productosSupermercado.get(producto));
						}
	            	}
	            case 6:
	                System.out.println("SALIENDO DEL PROGRAMA");
	                break;
	            default:
	                System.out.println("POR FAVOR, SELECCIONA UNA OPCIÓN VÁLIDA");
	                break;
	        }
	        System.out.println("");

	    } while (op != 6);
	    
	    
	}

}
