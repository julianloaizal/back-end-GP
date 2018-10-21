package co.udea.proyecto.api.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.udea.proyecto.api.dto.DTOProyecto;
import co.udea.proyecto.api.mapping.proyectoMapper;
import co.udea.proyecto.api.model.Proyecto;
import co.udea.proyecto.api.service.ProyectoService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@RequestMapping("/proyecto")

public class ProyectoController {

private static Logger log = LoggerFactory.getLogger(ProyectoController.class);
	
	private ProyectoService proyectoService;
	
	public ProyectoController(ProyectoService proyectoService) {
		this.proyectoService = proyectoService;
	}
	

	@GetMapping("listar")
	@ApiOperation(value = "Buscar todos", response = Page.class)
	@ApiResponses(value = {
            @ApiResponse(code = 200, message = "Los proyectos fueron buscados", response = Page.class),
            @ApiResponse(code = 400, message = "La petición es invalida"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
	public ResponseEntity<List<Proyecto>> getProyectos(){
		log.debug("REST request listar todos los proyectos");
		return ResponseEntity.ok(proyectoService.getProyectos());		
	}
	
	@GetMapping(value = "buscar/{estado}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Consultar proyectos activos", response = Page.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "poryectos activos", response = Proyecto.class),
            @ApiResponse(code = 400, message = "La petición es invalida"),
            @ApiResponse(code = 404, message = "Recurso no encontrado"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
	public ResponseEntity<List<DTOProyecto>> getProyecto( @PathVariable("estado") String estado){
		 log.debug("REST request getProyecto estado : {}", estado);
		return ResponseEntity.ok(proyectoMapper.ListAsProyectoDTO(proyectoService.searchProyectos2(estado)));
	}
}


