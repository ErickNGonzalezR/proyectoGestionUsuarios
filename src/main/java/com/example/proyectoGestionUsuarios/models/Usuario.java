package com.example.proyectoGestionUsuarios.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "usuarios")
@ToString
@EqualsAndHashCode

public class Usuario {

    @Setter @Getter
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;

    @Setter @Getter
    @Column(name = "nombre")
    private String nombre;

    @Setter @Getter
    @Column(name = "apellido")
    private String apellido;

    @Setter @Getter
    @Column(name = "email")
    private String email;

    @Setter @Getter
    @Column(name = "telefono")
    private String telefono;

    @Setter @Getter
    @Column(name = "password")
    private String password;
}
