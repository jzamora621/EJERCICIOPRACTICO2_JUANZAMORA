package Controller;

import Domain.Peliculas;
import Service.PeliculasService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/peliculas")
public class PeliculasController {

    private final PeliculasService peliculasService;

    public PeliculasController(PeliculasService peliculasService) {
        this.peliculasService = peliculasService;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("peliculas", peliculasService.listar());
        return "peliculas";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Peliculas pelicula) {
        peliculasService.guardar(pelicula);
        return "redirect:/peliculas";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable int id) {
        peliculasService.eliminar(id);
        return "redirect:/peliculas";
    }
}
