package co.udea.proyecto.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")

public class Usuario {
	
	@Id
	private int tipo_doc;
	private int numero_doc;
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private int cod_rol;
	private int cod_programa;
	public int getTipo_doc() {
		return tipo_doc;
	}
	public void setTipo_doc(int tipo_doc) {
		this.tipo_doc = tipo_doc;
	}
	public int getNumero_doc() {
		return numero_doc;
	}
	public void setNumero_doc(int numero_doc) {
		this.numero_doc = numero_doc;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getCod_rol() {
		return cod_rol;
	}
	public void setCod_rol(int cod_rol) {
		this.cod_rol = cod_rol;
	}
	public int getCod_programa() {
		return cod_programa;
	}
	public void setCod_programa(int cod_programa) {
		this.cod_programa = cod_programa;
	}
	
}
