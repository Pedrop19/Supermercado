package principal;

public class Producto {
	
	private int id;
	private String descripcion;
	private double precio;
	private Categoria categoria;
	
	public Producto(int id, String descripcion, double precio, Categoria categoria) {
		this.id = id;
		this.descripcion = descripcion;
		this.precio = precio;
		this.categoria = categoria;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", descripcion=" + descripcion + ", precio=" + precio + ", categoria=" + categoria
				+ "]";
	}
}
