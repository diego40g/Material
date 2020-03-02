package org.dipaz.material.service;

import java.util.List;

import javax.jws.WebService;

import org.dipaz.material.model.Material;
@WebService
public interface MaterialService {
	/*
	 * Metodo para crear un material nuevo.
	 * @param material
	 * @return material creado
	 * */
	Material crearTarjeta(Material material);
	
	/*
	Metodo para obtener todos los material
	@return
	*/
	List<Material>obtnerTodas();
}
