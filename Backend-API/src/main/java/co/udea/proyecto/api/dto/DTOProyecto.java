package co.udea.proyecto.api.dto;

import java.util.List;

import co.udea.proyecto.api.model.Proyecto;

public class DTOProyecto {
	
	private Integer radicado;
	private String nombre;
	private Integer tipo;
	private String fecha_inicio;
	private String fecha_fin;
	private String idEstado;
	
	public DTOProyecto() {
		super();
	}
	
	public DTOProyecto(Integer radicado, String nombre) {
		super();
		this.radicado = radicado;
		this.nombre = nombre;
	}
	
	public Integer getRadicado() {
		return radicado;
	}
	public void setRadicado(Integer radicado) {
		this.radicado = radicado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	public String getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public String getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	public String getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(String idEstado) {
		this.idEstado = idEstado;
	}
	
	
}
