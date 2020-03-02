package org.dipaz.material.repository;

import java.util.List;

import org.dipaz.material.model.Material;

public interface MaterialRepository {
	/*
	 * Metodo para crear un material nuevo.
	 * @param material
	 * @return material creada
	 * */
	Material crearTarjeta(Material material);
	
	/*
	Metodo para obtener todos los materiales
	@return
	*/
	List<Material>obtnerTodas();
}
