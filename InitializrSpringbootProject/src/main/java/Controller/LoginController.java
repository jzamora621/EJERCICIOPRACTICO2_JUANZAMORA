package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLogin() {
        return "login"; // Retorna la vista login.html
    }

    @PostMapping("/login")
    public String processLogin(String correo, String contrasena) {
        // Lógica de autenticación (reemplazar con tu lógica de validación)
        if (correo.equals("admin@cine.com") && contrasena.equals("admin123")) {
            return "redirect:/index"; // Redirige a la página principal después de login exitoso
        } else {
            return "login"; // Si el login falla, muestra de nuevo el login
        }
    }
}
