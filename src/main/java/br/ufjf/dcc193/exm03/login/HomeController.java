package br.ufjf.dcc193.exm03.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.ufjf.dcc193.exm03.login.model.Usuario;
import br.ufjf.dcc193.exm03.login.model.UsuarioService;

@Controller
public class HomeController {

  @Autowired
  UsuarioService usuarioService;
  @GetMapping("/home.html")
  public String getHome(Model model){
    model.addAttribute("conteudo", "login/home::conteudo");
    return "login/defaultLayout";
  }

  @GetMapping("/usuarios.html")
  public String getUsuarios(Model model){
    model.addAttribute("conteudo", "login/usuarios::conteudo");
    List<Usuario> usuarios = usuarioService.selectAll();
    model.addAttribute("usuarios", usuarios);
    return "login/defaultLayout";  
}

@GetMapping("/detalhes.html")
  public String getDetalhes(Model model){
    model.addAttribute("conteudo", "login/detalhes::conteudo");
    return "login/defaultLayout";
  }

}
