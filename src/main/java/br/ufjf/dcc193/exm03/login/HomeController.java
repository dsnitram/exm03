package br.ufjf.dcc193.exm03.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
  @GetMapping("/home.html")
  public String getHome(Model model){
    model.addAttribute("conteudo", "login/home::conteudo");
    return "login/defaultLayout";
  }

  @GetMapping("/usuarios.html")
  public String getUsuarios(Model model){
    model.addAttribute("conteudo", "login/usuarios::conteudo");
    return "login/defaultLayout";  
}

@GetMapping("/detalhes.html")
  public String getDetalhes(Model model){
    model.addAttribute("conteudo", "login/detalhes::conteudo");
    return "login/defaultLayout";
  }

}
