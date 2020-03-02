package org.dipaz.material.repository;

import java.util.ArrayList;
import java.util.List;

import org.dipaz.material.model.Material;

public class MaterialRepositoryImpl implements MaterialRepository{

	private static List<Material> materialesInventario =
			new ArrayList<Material>();
	
	@Override
	public Material crearTarjeta(Material material) {
		System.out.println("Crear Material:::::");
		materialesInventario.add(material);
		return material;
	}

	@Override
	public List<Material> obtnerTodas() {
		System.out.println(":::Obtener todos los materiales");
		return materialesInventario;
	}

}
