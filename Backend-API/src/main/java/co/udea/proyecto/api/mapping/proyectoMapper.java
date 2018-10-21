package co.udea.proyecto.api.mapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import co.udea.proyecto.api.dto.DTOProyecto;
import co.udea.proyecto.api.model.Proyecto;
import co.udea.proyecto.api.repository.ProyectoRepository;
import co.udea.proyecto.api.util.Messages;

public class proyectoMapper {
	
	private final ProyectoRepository proyectoRepository;
	
	public proyectoMapper(ProyectoRepository proyectoRepository) {
		this.proyectoRepository = proyectoRepository;
	}
	
	public static DTOProyecto asProyectoDTO(Proyecto proyectoIn ) {
		DTOProyecto activo = new DTOProyecto();
		activo.setRadicado(proyectoIn.getRadicado());
		activo.setNombre(proyectoIn.getNombre());
		activo.setTipo(proyectoIn.getTipo());
		activo.setFecha_inicio(proyectoIn.getFecha_inicio());
		activo.setFecha_fin(proyectoIn.getFecha_fin());
		return activo;	
	}
	
	// DTO metodo para la listar proyectos activos
	
	public static List<DTOProyecto> ListAsProyectoDTO( List<Proyecto> listProyectoIn ) {
		
		List<DTOProyecto> listActivo = new ArrayList<DTOProyecto>();
		for(Proyecto project  : listProyectoIn) {
			listActivo.add(asProyectoDTO(project));
		}
		
		return listActivo;	
	}
}
