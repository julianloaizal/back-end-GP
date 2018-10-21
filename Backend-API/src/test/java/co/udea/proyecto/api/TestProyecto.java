package co.udea.proyecto.api;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import co.udea.proyecto.api.mapping.proyectoMapper;
import co.udea.proyecto.api.dto.DTOProyecto;
import co.udea.proyecto.api.exception.GeneralException;
import co.udea.proyecto.api.model.Proyecto;
import co.udea.proyecto.api.repository.ProyectoRepository;
import co.udea.proyecto.api.service.ProyectoService;
import co.udea.proyecto.api.service.impl.ProyectoServiceImpl;;


public class TestProyecto {
	
	private ProyectoServiceImpl ProyectoServiceImpl;
	private proyectoMapper proyectoMapper;
	private ProyectoService ProyectoService;
	
	@Mock
	private ProyectoRepository ProyectoRepository;
	
	@Mock
	private Proyecto Proyecto;
	
	
	
	@Before
	public void setupMock() {
		MockitoAnnotations.initMocks(this);
		proyectoMapper = new proyectoMapper(ProyectoRepository);
		//ProyectoService = new ProyectoService(ProyectoRepository);
	}
	
	@Test
	public void testListarProyectosActivos() {
		
		//when(ProyectoRepository.findAllByIdEstado("1").thenReturn(Proyecto));
		
		List<Proyecto> proyectosActivos= ProyectoRepository.findAllByIdEstado("2");
		
		//assertThat(ProyectoService.getProyectos().size(), is(equalTo(proyectosActivos.size())));
	
		Proyecto proyectoPruebas= proyectosActivos.get(0);
		try {
		Integer radicadoEsperado = 12358;
		String 	nombreEsperado ="sprint1";
		Integer tipoEsperado =5;
		String 	fecha_inicioEsperado ="02-06-2011";
		String 	fecha_finEsperado="06-09-2016";
		
		assertEquals(radicadoEsperado,proyectoPruebas.getRadicado());
		assertEquals(nombreEsperado,proyectoPruebas.getNombre());
		assertEquals(tipoEsperado,proyectoPruebas.getTipo());
		assertEquals(fecha_inicioEsperado,proyectoPruebas.getFecha_inicio());
		assertEquals(fecha_finEsperado,proyectoPruebas.getFecha_fin());
		} catch (GeneralException e) {
		      fail("Lanzada excepcion no esperada Exception");
		    }
	}

	
	
}
