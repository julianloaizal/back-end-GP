package co.udea.proyecto.api.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proyectos")
public class Proyecto {
	
	@Id
	@Column(name="radicado")
	@GeneratedValue
	private Integer radicado;
	
	@Column(name="nombre")
	@GeneratedValue
	private String nombre;
	
	public Integer getAsesor() {
		return asesor;
	}

	public void setAsesor(Integer asesor) {
		this.asesor = asesor;
	}

	public Integer getCodigo_tipo_proyecto() {
		return codigo_tipo_proyecto;
	}

	public void setCodigo_tipo_proyecto(Integer codigo_tipo_proyecto) {
		this.codigo_tipo_proyecto = codigo_tipo_proyecto;
	}

	public void setRadicado(Integer radicado) {
		this.radicado = radicado;
	}

	public void setCod_modalidad_proyecto(Integer cod_modalidad_proyecto) {
		this.cod_modalidad_proyecto = cod_modalidad_proyecto;
	}
	@Column(name="asesor")
	@GeneratedValue
	private Integer asesor;
	
	@Column(name="codigo_tipo_proyecto")
	@GeneratedValue
	private Integer codigo_tipo_proyecto;
	
	@Column(name="cod_modalidad_proyecto")
	@GeneratedValue
	private Integer cod_modalidad_proyecto;

	@Column(name="participantes")
	@GeneratedValue
	private String participantes;
	
	@Column(name="fecha_creacion")
	@GeneratedValue
	private String fecha_creacion;
	
	@Column(name="fecha_inicio")
	@GeneratedValue
	private String fecha_inicio;
	
	@Column(name="fecha_fin")
	@GeneratedValue
	private String fecha_fin;
	
	@Column(name="calificacion")
	@GeneratedValue
	private String calificacion;
	
	@Column(name="estado")
	@GeneratedValue
	private String estado;
	
	@Column(name="objetivo_general")
	@GeneratedValue
	private String objetivo_general;
	
	public Proyecto() {
		super();
	}

	public Proyecto(Integer radicado, String nombre) {
		super();
		this.radicado = radicado;
		this.nombre = nombre;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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

