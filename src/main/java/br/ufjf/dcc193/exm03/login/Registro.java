package br.ufjf.dcc193.exm03.login;

import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class Registro {
  @NotBlank
  @Email
  public String username;
  
  @NotBlank
  public String fullname;
 
  @NotBlank
  @Pattern(regexp = "^[a-zA-Z0-9]+$")
  public String password1;
  
  @NotBlank
  @Pattern(regexp = "^[a-zA-Z0-9]+$")
  public String password2;

  @Min(0)
  @Max(20)
  public Integer pets;
  
  @NotNull  
  @DateTimeFormat(pattern = "dd/MM/yyyy")
  public Date birthday;  
  
  @AssertTrue
  private Boolean status;
}

