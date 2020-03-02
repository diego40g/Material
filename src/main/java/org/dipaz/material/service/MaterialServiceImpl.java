package org.dipaz.material.service;

import java.util.List;

import javax.jws.WebService;

import org.dipaz.material.model.Material;
import org.dipaz.material.repository.MaterialRepository;
import org.dipaz.material.repository.MaterialRepositoryImpl;

@WebService(endpointInterface = "org.dipaz.material.service.MaterialService")
public class MaterialServiceImpl implements MaterialService{

	MaterialRepository materialRepository = new MaterialRepositoryImpl();
	
	@Override
	public Material crearTarjeta(Material material) {
		return materialRepository.crearTarjeta(material);
	}

	@Override
	public List<Material> obtnerTodas() {
		return materialRepository.obtnerTodas(); 
	}

}
