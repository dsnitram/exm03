package br.ufjf.dcc193.exm03.login;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.ufjf.dcc193.exm03.login.model.Usuario;
import br.ufjf.dcc193.exm03.login.model.UsuarioService;

@Controller
public class RegistroController {

  @Autowired
  private UsuarioService usuarioService;

  @GetMapping("/registro")
  public String getRegistro(@ModelAttribute Registro registro, Model model){
    Map<String, String> status = new LinkedHashMap<>();
    status.put(" Estudante", "true");
    status.put(" Profissional", "false");
    model.addAttribute("status", status);  
    return "login/registro";
  }
  
  @PostMapping("/registro")
  public String postRegistro(@ModelAttribute @Validated Registro registro, BindingResult bindingResult, Model model){

      if(bindingResult.hasErrors()){
        return getRegistro(registro, model);
      } else {
        Usuario usuario = new Usuario();
        usuario.setUsername(registro.getUsername());
        usuario.setFullname(registro.getFullname());
        usuario.setPassword(registro.getPassword1());
        usuario.setBirthday(registro.getBirthday());
        usuario.setPets(registro.getPets());
        usuario.setStatus(registro.getStatus());
        usuario.setRole("COMUM");
        if (usuarioService.insert(usuario)){
          return "redirect:/login";
        }else{
        return "redirect:/registro";
      }
      }
  }
}
