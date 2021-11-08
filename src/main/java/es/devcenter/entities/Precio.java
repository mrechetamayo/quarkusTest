package es.devcenter.entities;

import javax.persistence.*;

@Entity
public class Precio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "fechaInicio", nullable = false)
    private Long fechaInicio;

    @Column(name= "fechaFin", nullable = false)
    private Long fechaFin;

    @Column(name= "precio", nullable = false)
    private Double precio;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Coche.class)
    @JoinColumn(name= "IDCoche", referencedColumnName = "ID")
    private Coche coche;

}
