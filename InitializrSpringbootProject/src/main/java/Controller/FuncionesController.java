package Controller;

import Domain.Funciones;
import Service.FuncionesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/funciones")
public class FuncionesController {

    private final FuncionesService funcionesService;

    public FuncionesController(FuncionesService funcionesService) {
        this.funcionesService = funcionesService;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("funciones", funcionesService.listar());
        return "funciones";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Funciones funcion) {
        funcionesService.guardar(funcion);
        return "redirect:/funciones";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable int id) {
        funcionesService.eliminar(id);
        return "redirect:/funciones";
    }
}
