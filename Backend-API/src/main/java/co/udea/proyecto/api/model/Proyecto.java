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
	
	@Column(name="tipo")
	@GeneratedValue
	private Integer tipo;
	
	@Column(name="id_programa")
	@GeneratedValue
	private Integer id_programa;
	
	@Column(name="asesor")
	@GeneratedValue
	private Integer asesor;
	
	@Column(name="responsable")
	@GeneratedValue
	private Integer responsable;
	

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
	
	@Column(name="objetivo_general")
	@GeneratedValue
	private String objetivo_general;
	
	@Column(name="id_estado")
	@GeneratedValue
	private String idEstado;
	
	
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
	
	public String getObjetivo_general() {
		return objetivo_general;
	}
	public void setObjetivo_general(String objetivo_general) {
		this.objetivo_general = objetivo_general;
	}
	public Integer getAsesor() {
		return asesor;
	}

	public void setAsesor(Integer asesor) {
		this.asesor = asesor;
	}
	public Integer getRadicado() {
		return radicado;
	}

	public void setRadicado(Integer radicado) {
		this.radicado = radicado;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public Integer getId_programa() {
		return id_programa;
	}

	public void setId_programa(Integer id_programa) {
		this.id_programa = id_programa;
	}

	public String getId_estado() {
		return idEstado;
	}

	public void setId_estado(String id_estado) {
		this.idEstado = id_estado;
	}
	public Integer getResponsable() {
		return responsable;
	}

	public void setResponsable(Integer responsable) {
		this.responsable = responsable;
	}

	
}

