package com.example.algamoney.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoney.api.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public 
	  List<Usuario> findByNomeLikeIgnoreCase(String nome);
	    
	    Usuario findByEmail(String email);
}