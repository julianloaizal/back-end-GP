package co.udea.proyecto.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Optional;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import co.udea.proyecto.api.model.Proyecto;
import co.udea.proyecto.api.service.ProyectoService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProyectoApiApplication.class)
public class ProyectoUnitTest {
	
	
		@Inject
		private ProyectoService proyectoService;
		
		@Before
		public void init() {
		}

		@Test
		public void debeDarelProyecto() {
			Proyecto proyectoPrueba = proyectoService.getProyecto(1);
			
			Assert.assertEquals("sprint9",proyectoPrueba.getNombre());
		}
		
		
}
