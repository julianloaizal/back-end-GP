package co.udea.proyecto.api.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reconocimiento")

public class Reconocimientos {
	@Id
	private int id;
	private String radicado_proyecto;
	private String fecha_reconocimiento;
	private String descripcion;
	private String reconocimiento;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRadicado_proyecto() {
		return radicado_proyecto;
	}
	public void setRadicado_proyecto(String radicado_proyecto) {
		this.radicado_proyecto = radicado_proyecto;
	}
	public String getFecha_reconocimiento() {
		return fecha_reconocimiento;
	}
	public void setFecha_reconocimiento(String fecha_reconocimiento) {
		this.fecha_reconocimiento = fecha_reconocimiento;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getReconocimiento() {
		return reconocimiento;
	}
	public void setReconocimiento(String reconocimiento) {
		this.reconocimiento = reconocimiento;
	}
}
