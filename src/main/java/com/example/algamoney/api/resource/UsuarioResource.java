package com.example.algamoney.api.resource;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.algamoney.api.model.Usuario;
import com.example.algamoney.api.repository.UsuarioRepository;
import com.example.algamoney.api.service.UsuarioService;


@RestController
@RequestMapping("/usuarios")
public class UsuarioResource {
	

	    @Autowired
	    UsuarioService usuarioService;

	    @Autowired
	    UsuarioRepository repository;

	    @RequestMapping(value = "/usuario", method = RequestMethod.GET)
	    public List<Usuario> listar() {
	        return this.usuarioService.listaUsuario();
	    }

	  
	    
	

	    
	    

	 
	    

	    @RequestMapping(value = "/usuario", method = RequestMethod.POST)
	    public Usuario salvar(@RequestBody Usuario usuario) {
	        return this.usuarioService.salvarUsuario(usuario);
	    }

	    @RequestMapping(value = "/usuario", method = RequestMethod.PUT)
	    public Usuario editar(@RequestBody Usuario usuario) {
	        return this.usuarioService.salvarUsuario(usuario);
	    }

	 
	    @RequestMapping(value = "/usuario/logado", method = RequestMethod.GET)
	    @ResponseBody
	    public Usuario currentUserName(Principal principal) {
	        Usuario usuario = this.repository.findByEmail(principal.getName());
	        usuario.setSenha("");
	        return usuario;
	    }

	}

