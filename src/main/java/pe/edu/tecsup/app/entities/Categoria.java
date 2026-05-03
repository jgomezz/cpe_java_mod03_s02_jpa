package pe.edu.tecsup.app.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name="categorias")
@ToString(exclude = "productos")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "orden")
    private Integer orden;

    @OneToMany(mappedBy  = "categoria")
    private List<Producto> productos = new ArrayList<>();

}
