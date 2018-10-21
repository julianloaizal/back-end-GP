package co.udea.proyecto.api;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import co.udea.proyecto.api.controller.ProyectoController;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;



public class TestProyectoServicio {

	private static final String URL = "/proyecto/buscar/1";
	 
    private MockMvc mockMvc;
    
    
    private final ProyectoController ProyectoController= new ProyectoController(null);

    
    //private final ProyectoController ProyectoController= new ProyectoController(null) ;

    @Before
    public void beforeTest() {
    	//this.mockMvc = MockMvcBuilders.webAppContextSetup(ProyectoController).build();
     this.mockMvc = MockMvcBuilders.standaloneSetup(ProyectoController).build();
    }
    
  
    
    @Test
    public void shouldReturnHttpCode200OnGet() throws Exception {
      mockMvc.perform(get(URL)).andExpect(status().isOk());
     // assertEquals(URL,proyectoPruebas.getRadicado());
    }
    /*
    @Test
    public void shouldReturnHttpCode400OnGetWithoutParameter() throws Exception {
      mockMvc.perform(get(URL)).andExpect(status().isBadRequest());
    }
    */
    
	
}
