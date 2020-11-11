package br.ufjf.dcc193.exm03.login;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistroController {

  @GetMapping("/registro")
  public String getRegistro(Model model){
    Map<String, String> status = new LinkedHashMap<>();
    status.put("Estudadnte", "true");
    status.put("Profissional", "false");
    model.addAttribute("status", status);
       
    return "login/registro";
  }
  
  @PostMapping("/registro")
  public String postRegistro(){
    return "redirect:/login";
  }
  
}
