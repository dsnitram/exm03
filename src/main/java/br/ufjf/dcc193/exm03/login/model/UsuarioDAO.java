package br.ufjf.dcc193.exm03.login.model;

import java.util.List;

import org.springframework.dao.DataAccessException;

public interface UsuarioDAO {
  public int count() throws DataAccessException;  
  public int insertOne(Usuario usuario) throws DataAccessException;
  public Usuario selectOne(String username) throws DataAccessException;
  public int updateOne(Usuario usuario) throws DataAccessException;
  public int deleteOne(Usuario usuario) throws DataAccessException;
  public List<Usuario> SelectAll() throws DataAccessException;
}
