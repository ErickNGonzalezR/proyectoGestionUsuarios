package com.example.proyectoGestionUsuarios.models;

import lombok.Getter;
import lombok.Setter;

public class Usuario {

    @Setter @Getter
    private String id;

    @Setter @Getter
    private String nombre;

    @Setter @Getter
    private String apellido;

    @Setter @Getter
    private String email;

    @Setter @Getter
    private String telefono;

    @Setter @Getter
    private String password;
}
