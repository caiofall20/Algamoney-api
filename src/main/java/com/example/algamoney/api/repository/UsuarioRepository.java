package com.example.algamoney.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoney.api.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
List<Usuario> findByNomeLikeIgnoreCase(String nome);
    
    Usuario findByEmail(String email);
}