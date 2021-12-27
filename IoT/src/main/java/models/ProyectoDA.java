package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProyectoDA {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long IdProyecto;
	
	@Column(unique=true)
	private String Nombre;
	private String Descripcion;
	private String Estado;
	private String Lenguaje;
	
	public ProyectoDA(long idProyecto, String nombre, String descripcion, String estado, String lenguaje) {
		IdProyecto = idProyecto;
		Nombre = nombre;
		Descripcion = descripcion;
		Estado = estado;
		Lenguaje = lenguaje;
	}
	public ProyectoDA() {
		super();
	
	}
	public long getIdProyecto() {
		return IdProyecto;
	}
	public void setIdProyecto(long idProyecto) {
		IdProyecto = idProyecto;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getLenguaje() {
		return Lenguaje;
	}
	public void setLenguaje(String lenguaje) {
		Lenguaje = lenguaje;
	}
	
	
	
	

}
