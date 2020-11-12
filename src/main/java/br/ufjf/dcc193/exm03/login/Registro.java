package br.ufjf.dcc193.exm03.login;

import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
import lombok.Data;

@Data
public class Registro {
  public String username;
  public String fullname;
  public String password1;
  public String password2;
  public Integer pets;
  @DateTimeFormat(pattern = "dd/MM/yyyy")
  public Date birthday;  
  private Boolean status;
}
