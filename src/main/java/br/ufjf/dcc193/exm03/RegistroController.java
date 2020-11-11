package br.ufjf.dcc193.exm03;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistroController {

  @GetMapping("/registro")
  public String getRegistro(){
    return "login/registro";
  }
  
  @PostMapping("/registro")
  public String postRegistro(){
    return "login/registro";
  }
  
}
