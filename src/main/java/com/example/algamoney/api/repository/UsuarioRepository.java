package com.example.algamoney.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoney.api.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Usuario findByEmail(String email);
List<Usuario> findByNomeLikeIgnoreCase(String nome);
    
   
	    
}