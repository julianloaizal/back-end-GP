package co.udea.proyecto.api.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "actividades")
public class Actividad {
	
	@Id
	private int codigo;
	private String nombre;
	private int radico_proyecto;
	private String fecha_creacion;
	private String fecha_inicio;
	private String fecha_fin;
	private String objetivos_especificos;
	private String participantes;
	private String porcentaje;
	private String estado;
	private String actividades_previas;
	private String entregables;
	
	public Actividad() {
		super();
	}

	public Actividad(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getRadico_proyecto() {
		return radico_proyecto;
	}
	public void setRadico_proyecto(int radico_proyecto) {
		this.radico_proyecto = radico_proyecto;
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
	public String getObjetivos_especificos() {
		return objetivos_especificos;
	}
	public void setObjetivos_especificos(String objetivos_especificos) {
		this.objetivos_especificos = objetivos_especificos;
	}
	public String getParticipantes() {
		return participantes;
	}
	public void setParticipantes(String participantes) {
		this.participantes = participantes;
	}
	public String getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(String porcentaje) {
		this.porcentaje = porcentaje;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getActividades_previas() {
		return actividades_previas;
	}
	public void setActividades_previas(String actividades_previas) {
		this.actividades_previas = actividades_previas;
	}
	public String getEntregables() {
		return entregables;
	}
	public void setEntregables(String entregables) {
		this.entregables = entregables;
	}
	
}

