package co.udea.proyecto.api.repository;


import java.util.List;
//import java.util.Optional;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.udea.proyecto.api.model.Proyecto;;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, String>{

	//public Optional<Proyecto> findById(int radicado);
	
	public  List<Proyecto> findAllByIdEstado(String estado);
	
	public Optional<Proyecto> findByIdEstado(String estado);
	
	
	

}