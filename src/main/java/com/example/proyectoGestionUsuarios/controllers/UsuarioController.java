package com.example.proyectoGestionUsuarios.controllers;

import com.example.proyectoGestionUsuarios.models.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuarios")
    public Usuario prueba(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Pepito");
        usuario.setApellido("Perez");
        usuario.setTelefono("4564523");
        usuario.setEmail("uncorreo@gmail.com");


        return usuario;
    }
}
