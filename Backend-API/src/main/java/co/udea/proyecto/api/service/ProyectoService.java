package co.udea.proyecto.api.service;

import java.util.List;


import co.udea.proyecto.api.model.Proyecto;

public interface ProyectoService {

	public List<Proyecto> getProyectos();
	
	public Proyecto getProyecto(Integer radicado) ;
	
	//public Proyecto getProyecto(Integer radicado, String nombre, Integer tipo, Integer id_programa, Integer asesor, Integer responsable,
		//	String fecha_creacion, String fecha_inicio, String fecha_fin, String calificacion, String objetivo_general, String idEstado);
	
	public List<Proyecto> searchProyectos2(String estado);
	
	public Proyecto searchProyectos(String estado);
	
	public Proyecto addProyectos(Proyecto proyecto);
	
	public Proyecto updateProyecto(Proyecto proyecto);
	
	
	public Proyecto getProyectoActualizar(Integer radicado);
	
	//public Hero addHero(Hero hero);
	
	public void deleteProyecto(Proyecto Proyecto);
}
