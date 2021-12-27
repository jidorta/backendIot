package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UsuarioDA {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IdUsuario;	
	private String Nombre;
	private String apellidos;
	private String email;
	private String password;
	private Date creado;
	public UsuarioDA(Long idUsuario, String nombre, String apellidos, String email, String password, Date creado) {
		
		IdUsuario = idUsuario;
		Nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.password = password;
		this.creado = creado;
	}
	public UsuarioDA() {

	}
	public Long getIdUsuario() {
		return IdUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		IdUsuario = idUsuario;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreado() {
		return creado;
	}
	public void setCreado(Date creado) {
		this.creado = creado;
	}
	
	
	

}
