package es.devcenter.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "nombreMarca", nullable = false, length = 100)
    private String nombreMarca;

    @OneToMany(fetch= FetchType.LAZY, targetEntity = Precio.class)
    @JoinColumn(name= "IDCoche", referencedColumnName = "ID")
    private List<Precio> coches;

}
