package com.generation.dplca.appdb.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.dplca.appdb.models.UsuarioModel;
import com.generation.dplca.appdb.repositories.UsuarioRepository;
@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;
	public ArrayList <UsuarioModel> obtenerUsuarios () {
		return (ArrayList <UsuarioModel> )usuarioRepository.findAll();
	}
	
	public UsuarioModel guardarUsuario(UsuarioModel usuario) {
		return usuarioRepository.save(usuario);
	}
	public ArrayList<UsuarioModel> obtenerPorPrioridad(Integer prioridad) {
		return usuarioRepository.findByPrioridad(prioridad);
	}
	public Optional <UsuarioModel> obtenerPorId(Long id) {
		return usuarioRepository.findById(id);
		
	}
	
	public boolean eliminarPorId(Long id) {
		try {
			usuarioRepository.deleteById(id);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	/*public boolean eliminarPorId(Long id) {
		if (usuarioRepository.findById(id).isPresent()) {
			usuarioRepository.deleteById(id);
			return true;
		}else {
			return false;
		}
		
	}*/

	/*public boolean eliminarUsuario(Long id) {
		return usuarioRepository.deleteById(id);
		return true;
	}*/
}
