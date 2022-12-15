package com.generation.dplca.appdb.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.generation.dplca.appdb.models.UsuarioModel;

@Repository
public interface UsuarioRepository extends CrudRepository <UsuarioModel, Long> {
	public ArrayList<UsuarioModel>findByPrioridad(Integer prioridad);
}
