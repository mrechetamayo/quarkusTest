package es.devcenter.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Coche {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "nombreModelo", nullable = false, length = 100)
    private String nombreModelo;

    @Column(name= "color", nullable = false)
    private String color;

    @OneToMany(fetch= FetchType.LAZY, targetEntity = Precio.class)
    @JoinColumn(name= "IDPrecio", referencedColumnName = "ID")
    private List<Precio> precios;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Marca.class)
    @JoinColumn(name= "IDMarca", referencedColumnName = "ID")
    private Marca marca;

}
