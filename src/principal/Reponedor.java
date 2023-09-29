package principal;

import java.util.LinkedList;

public class Reponedor {
	private int id;
	private String nombre;
	private LinkedList<Camion> camiones;
	private LinkedList<Producto> productos;
	

	public Reponedor(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		this.camiones = new LinkedList<Camion>();;
		this.productos = new LinkedList<Producto>();;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Reponedor [id=" + id + ", nombre=" + nombre + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reponedor other = (Reponedor) obj;
		return id == other.id;
	}
	
	public void descargarCamion(Camion c, LinkedList<Producto> productos) {
		productos.addAll(c.getProductos());	
	}
	
}
