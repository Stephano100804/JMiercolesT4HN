package models;


@Entity
@Table(name="clientes")
public class Clientes {

	private int idcliente;
	private String nombre;
	private String apellido;
	private String distrito;
	
	public Clientes() {
	}
	
	public Clientes(String nombre, String apellido, String distrito) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.distrito = distrito;
	}
	
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	
	
	@Override
	public String toString() {
		return "Clientes [idcliente=" + idcliente + ", nombre=" + nombre + ", apellido=" + apellido + ", distrito="
				+ distrito + ", getIdcliente()=" + getIdcliente() + ", getNombre()=" + getNombre() + ", getApellido()="
				+ getApellido() + ", getDistrito()=" + getDistrito() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
