package co.udea.proyecto.api.service.impl;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import co.udea.proyecto.api.service.ProyectoService;
import co.udea.proyecto.api.exception.DataNotFoundException;
import co.udea.proyecto.api.model.Proyecto;
import co.udea.proyecto.api.repository.ProyectoRepository;
import co.udea.proyecto.api.util.Messages;



@Service
public class ProyectoServiceImpl implements ProyectoService {
	
	private final Logger log = LoggerFactory.getLogger(ProyectoServiceImpl.class);
	
	private Messages messages;	
	private final ProyectoRepository proyectoRepository;

	public ProyectoServiceImpl(ProyectoRepository proyectoRepository, Messages messages) {
		this.proyectoRepository = proyectoRepository;
		this.messages = messages;
	}
	
	@Override
	public List<Proyecto> getProyectos(){
		log.debug("Inicio getProyectos");
		List<Proyecto> proyectos= proyectoRepository.findAll();
		log.debug("Fin getProyectos");
		return proyectos;
	}
	
	@Override
	public List<Proyecto> searchProyectos(String estado) {
		log.debug("Inicio getHero: id = {}", estado);
		List<Proyecto> proyectosActivos= proyectoRepository.findAllByIdEstado(estado);
		
		log.debug("Fin getProyectosActivos: proyecto = {}");
		return proyectosActivos;
	}
	
}
