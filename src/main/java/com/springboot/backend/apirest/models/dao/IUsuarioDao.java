package com.springboot.backend.apirest.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.springboot.backend.apirest.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {
	public Usuario findByUsername(String username);//Para crear query por medio de nombre
	
	@Query("select u from Usuario u where u.username=?1")
	public Usuario findByUsername2(String username);//Para crear query por medio de nombre
}
