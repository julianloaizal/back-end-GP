package co.udea.proyecto.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import co.udea.proyecto.api.model.Proyecto;;


public interface ProyectoRepository extends JpaRepository<Proyecto, String>{

	//public Optional<Proyecto> findById(int radicado);
	
	//public Optional<Proyecto> findByName(String nombre);
	

}