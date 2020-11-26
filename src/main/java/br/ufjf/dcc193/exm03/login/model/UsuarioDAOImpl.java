package br.ufjf.dcc193.exm03.login.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO {

  @Autowired
  JdbcTemplate jdbc;

  @Override
  public int count() throws DataAccessException {
    Integer n = (Integer) jdbc.queryForObject("SELECT COUNT(*) FROM usuario", Integer.class);
    return n;
  }

  @Override
  public int insertOne(Usuario usuario) throws DataAccessException {
    int n = jdbc.update(
        "INSERT INTO usuario (username, fullname, password, birthday, pets, status, role) VALUES (?,?,?,?,?,?,?);",
        usuario.getUsername(), usuario.getFullname(), usuario.getPassword(), usuario.getBirthday(), usuario.getPets(),
        usuario.getStatus(), usuario.getRole());
    return n;
  }

  @Override
  public Usuario selectOne(String username) throws DataAccessException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int updateOne(Usuario usuario) throws DataAccessException {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int deleteOne(Usuario usuario) throws DataAccessException {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public List<Usuario> SelectAll() throws DataAccessException {
    List<Usuario> usuarios = new ArrayList<>();
    List<Map<String, Object>> resultados = jdbc.queryForList("SELECT * FROM usuario");
    for(Map<String, Object> resultado: resultados){
      Usuario usuario = new Usuario();
      usuario.setUsername((String)resultado.get("username"));
      usuario.setFullname((String)resultado.get("fullname"));
      usuario.setPassword((String)resultado.get("password"));
      usuario.setBirthday((Date)resultado.get("birthday"));
      usuario.setPets((Integer)resultado.get("pets"));
      usuario.setStatus((Boolean)resultado.get("status"));
      usuario.setRole((String)resultado.get("role"));
      usuarios.add(usuario);
    }
    return usuarios;
  }

  
}
