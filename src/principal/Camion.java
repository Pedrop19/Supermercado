package principal;

import java.util.LinkedList;

public class Camion {
	
	private int id;
	private String matricula;
	private LinkedList<Producto> productos;
	
	public Camion(int id, String matricula) {
		this.id = id;
		this.matricula = matricula;
		this.productos = new LinkedList<Producto>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LinkedList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(LinkedList<Producto> productos) {
		this.productos = productos;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		return "Camion [matricula=" + matricula + "]";
	}
	
	public void cargarProducto(Producto p) {
		productos.add(p);
	}
	
	public double beneficio() {
		double suma = 0;
		for (int i = 0; i < productos.size(); i++) {
			suma += (productos.get(i).getPrecio() + (productos.get(i).getPrecio()*0.1));
		}
		return suma;
	}
}
