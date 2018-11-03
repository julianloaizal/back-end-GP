package co.udea.proyecto.api.service.impl;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import co.udea.proyecto.api.service.ProyectoService;
import co.udea.proyecto.api.exception.DataNotFoundException;
import co.udea.proyecto.api.model.Proyecto;
import co.udea.proyecto.api.repository.ProyectoRepository;
import co.udea.proyecto.api.util.Messages;



@Service
//@Qualifier(ProyectoServiceImpl);
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
	public List<Proyecto> searchProyectos2(String estado) {
		log.debug("Inicio getProyectos: id = {}", estado);
		List<Proyecto>  proyectosActivos= proyectoRepository.findAllByIdEstado(estado);
		
		log.debug("Fin getProyectosActivos: proyecto = {}");
		return proyectosActivos;
	}
	
	@Override
	public Proyecto searchProyectos(String estado) {
		log.debug("Inicio getProyectos: id = {}", estado);
		Optional<Proyecto> proyectosActivos= proyectoRepository.findByIdEstado(estado);
		
		log.debug("Fin getProyectosActivos: proyecto = {}");
		return proyectosActivos.get();
	}
	
	@Override
	public Proyecto addProyectos(Proyecto proyecto) {
		log.debug("Inicio addProyectos: id = {}", proyecto);
		return proyectoRepository.save(proyecto);
	}
	
	@Override
	public Proyecto updateProyecto(Proyecto newProyecto) {
		log.debug("Inicio updateProyecto: id = {}", newProyecto);
		return proyectoRepository.save(newProyecto);
	}
	
	@Override
	public Proyecto getProyectoActualizar(Integer radicado) {
		Optional<Proyecto> proyecto= proyectoRepository.findByRadicado(radicado);
		
		log.debug("Fin getproyecto: proyecto = {}", proyecto.get());
		return proyecto.get();
	}
	
	@Override
	public Proyecto getProyecto(Integer radicado) {
		Optional<Proyecto> proyecto= proyectoRepository.findByRadicado(radicado);
		
		log.debug("Fin getproyecto: proyecto = {}", proyecto.get());
		return proyecto.get();
	}
}
