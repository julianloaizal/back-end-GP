package co.udea.proyecto.api.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping(value = "crearProyecto", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "crea un proyecto", response = Page.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Proyecto creado", response = Proyecto.class),
            @ApiResponse(code = 400, message = "La petición es invalida"),
            @ApiResponse(code = 404, message = "Recurso no actualizado"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
	public ResponseEntity<Proyecto> addProyecto( @RequestBody Proyecto data){
		Proyecto proyecto=new Proyecto(data.getRadicado(),data.getNombre(),data.getTipo(),data.getId_programa(),
										data.getAsesor(),data.getResponsable(), data.getFecha_creacion(),
										data.getFecha_inicio(),data.getFecha_fin(),data.getCalificacion(),
										data.getObjetivo_general(),data.getId_estado());
		proyectoService.addProyectos(proyecto);
		//return ResponseEntity.ok(proyectoService.addProyectos(proyecto));
		return new ResponseEntity<Proyecto>(proyecto, HttpStatus.OK);
	}
	@PutMapping(value = "actualizarProyecto", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "actualizar Proyecto", response = Page.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Proyecto actualizado", response = Proyecto.class),
            @ApiResponse(code = 400, message = "La petición es invalida"),
            @ApiResponse(code = 404, message = "Recurso no actualizado"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
	public ResponseEntity<Proyecto> getProyectoActualizar(@RequestBody Proyecto data ){
		Proyecto proyecto=new Proyecto(data.getRadicado(),data.getNombre(),data.getTipo(),data.getId_programa(),
				data.getAsesor(),data.getResponsable(), data.getFecha_creacion(),
				data.getFecha_inicio(),data.getFecha_fin(),data.getCalificacion(),
				data.getObjetivo_general(),data.getId_estado());
		proyectoService.updateProyecto(proyecto);
		return new ResponseEntity<Proyecto>(proyecto, HttpStatus.OK);
	}
	
	
	@GetMapping(value = "consultar/{radicado}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Consultar proyecto por radicado", response = Page.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "proyecto encontrado", response = Proyecto.class),
            @ApiResponse(code = 400, message = "La petición es invalida"),
            @ApiResponse(code = 404, message = "Recurso no encontrado"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
	public ResponseEntity<Proyecto> getProyecto( @PathVariable("radicado") Integer radicado){
		 log.debug("REST request getHero id : {}", radicado);
		return ResponseEntity.ok(proyectoService.getProyecto(radicado));
	}
	
	@DeleteMapping(value = "borrar/{radicado}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "elimina un Proyecto", response = Page.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Heroe eliminado", response = Proyecto.class),
            @ApiResponse(code = 400, message = "La petición es invalida"),
            @ApiResponse(code = 404, message = "Recurso no actualizado"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
	public void deleteHero( @PathVariable("radicado") Integer radicado){
		log.debug("REST request getHero id : {}", radicado);
		Proyecto proyecto = proyectoService.getProyecto(radicado);
		proyectoService.deleteProyecto(proyecto);
	}
}


