package br.ufjf.dcc193.exm03.login.model;

import java.util.Date;
import lombok.Data;

@Data
public class Usuario {
  private String username;
  private String fullname;
  private String password;
  private Date birthday;
  private Integer pets;
  private boolean status;  
}
