package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping({"/", "/index"})
    public String mostrarInicio() {
        return "index"; // Renderiza index.html
    }

    @GetMapping("/login")
    public String mostrarLogin() {
        return "login"; // Renderiza login.html
    }
}
