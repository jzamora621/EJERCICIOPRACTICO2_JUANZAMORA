package Domain;

import jakarta.persistence.*;

@Entity
@Table(name = "peliculas")
public class Peliculas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String titulo;
    private String tipo; // 'PELICULA' o 'OBRA'

    // Getters y Setters
}

