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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Peliculas getPelicula() {
        return pelicula;
    }

    public void setPelicula(Peliculas pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}
