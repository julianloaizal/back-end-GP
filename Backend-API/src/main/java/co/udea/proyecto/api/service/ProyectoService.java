package co.udea.proyecto.api.service;

import java.util.List;

import co.udea.proyecto.api.model.Proyecto;

public interface ProyectoService {

	public List<Proyecto> getProyectos();
	
	//public Proyecto getProyecto(int id) ;
	
	//public Proyecto getProyecto(int id, String name) ;
	
	public List<Proyecto> searchProyectos(String estado);
	
	//public Hero updateHero(Hero hero);
	
	//public Hero addHero(Hero hero);
	
	//public void deleteHero(Hero hero);
}
