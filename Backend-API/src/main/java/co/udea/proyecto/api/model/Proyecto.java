package co.udea.proyecto.api.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proyectos")
public class Proyecto {
	
	@Id
	private int radicado;
	private String nombre;
	private int codio_tipo_proyecto;
	private int cod_modalidad_proyecto;
	private int asesor;
	private String participantes;
	private String fecha_creacion;
	private String fecha_inicio;
	private String fecha_fin;
	private String calificacion;
	private String estado;
	private String objetivo_general;
	
	public Proyecto() {
		super();
	}

	public Proyecto(int radicado, String nombre) {
		super();
		this.radicado = radicado;
		this.nombre = nombre;
	}
	
	public int getRadicado() {
		return radicado;
	}
	public void setRadicado(int radicado) {
		this.radicado = radicado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodio_tipo_proyecto() {
		return codio_tipo_proyecto;
	}
	public void setCodio_tipo_proyecto(int codio_tipo_proyecto) {
		this.codio_tipo_proyecto = codio_tipo_proyecto;
	}
	public int getCod_modalidad_proyecto() {
		return cod_modalidad_proyecto;
	}
	public void setCod_modalidad_proyecto(int cod_modalidad_proyecto) {
		this.cod_modalidad_proyecto = cod_modalidad_proyecto;
	}
	public int getAsesor() {
		return asesor;
	}
	public void setAsesor(int asesor) {
		this.asesor = asesor;
	}
	public String getParticipantes() {
		return participantes;
	}
	public void setParticipantes(String participantes) {
		this.participantes = participantes;
	}
	public String getFecha_creacion() {
		return fecha_creacion;
	}
	public void setFecha_creacion(String fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
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
	public String getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getObjetivo_general() {
		return objetivo_general;
	}
	public void setObjetivo_general(String objetivo_general) {
		this.objetivo_general = objetivo_general;
	}
	
	
}

