package Domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "funciones")
public class Funciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_pelicula", referencedColumnName = "id")
    private Peliculas pelicula;

    private LocalDateTime fechaHora;
    private String sala;

    // Getters y Setters
}
