package br.ufjf.dcc193.exm03.login.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 @Service
public class UsuarioService {
  @Autowired
  private UsuarioDAO dao;   

  public boolean insert( Usuario usuario){
    int n = dao.insertOne(usuario);
      return (n>0);
    }

public List<Usuario> selectAll() {
	return dao.SelectAll();
}
}
