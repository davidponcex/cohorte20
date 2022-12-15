package com.generation.dplca.appdb.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.generation.dplca.appdb.models.UsuarioModel;
import com.generation.dplca.appdb.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping ()
	public ArrayList<UsuarioModel> obtenerUsuarios() {
		return usuarioService.obtenerUsuarios();
	}
	@PostMapping()
	public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario) {
		return this.usuarioService.guardarUsuario(usuario);
	}
	@GetMapping("/query")
	public ArrayList<UsuarioModel> obtenerUsuarioPorPrioridad(@RequestParam ("prioridad") Integer prioridad){
		return this.usuarioService.obtenerPorPrioridad(prioridad);
	}
	@GetMapping(path = "/{id}" )
	public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") Long id){
		return this.usuarioService.obtenerPorId(id);
	}
	@DeleteMapping("/{id}")
	public String eliminarPorId (@PathVariable ("id") Long id) {
		boolean chek = this.usuarioService.eliminarPorId(id);
		if (chek) {
			return "Se eliminó el usuario ";
		}else {
			return " No se eliminó el usuario ";
		}
		
	}
}
