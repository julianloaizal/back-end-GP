package co.udea.proyecto.api;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import co.udea.proyecto.api.controller.ProyectoController;
import co.udea.proyecto.api.service.ProyectoService;
import co.udea.proyecto.api.model.Proyecto;

public class ProyectoControllerIntegracion {
	private ProyectoController proyectoController;
	private ProyectoService proyectoService;

    @Before
    public void init() {
        this.proyectoService = Mockito.mock(ProyectoService.class);
        this.proyectoController = new ProyectoController(proyectoService);
    }
    
    @Test
	public void debeRetornarElProyectoSiExiste() {
    	Mockito.when(proyectoService.getProyecto(1)).thenReturn(new Proyecto (1,"sprint9",1,11,3,99999999,"26-04-2008","06-03-2010","06-07-2017","revisar","se crea nuevo proyecto","1"));
    	ResponseEntity<Proyecto> httpResponse = proyectoController.getProyecto(1);

        Assert.assertEquals(httpResponse.getStatusCode(), HttpStatus.OK);
        Assert.assertEquals("sprint9", httpResponse.getBody().getNombre());
        Assert.assertEquals("26-04-2008", httpResponse.getBody().getFecha_creacion());
        Assert.assertEquals("06-03-2010", httpResponse.getBody().getFecha_inicio());
        Assert.assertEquals("06-07-2017", httpResponse.getBody().getFecha_fin());
    }
    
	
}
