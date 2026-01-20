package com.example.proyectoGestionUsuarios.controllers;

import com.example.proyectoGestionUsuarios.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable long id){
        Usuario usuario = new Usuario();
        usuario.setNombre("Pepito");
        usuario.setApellido("Perez");
        usuario.setTelefono("4564523");
        usuario.setEmail("uncorreo@gmail.com");
        return usuario;
    }

    @RequestMapping(value = "usuariosPrueba")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Pepito");
        usuario.setApellido("Perez");
        usuario.setTelefono("4564523");
        usuario.setEmail("uncorreo@gmail.com");
        return usuario;
    }
    @RequestMapping(value = "usuariosPrueba")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Pepito");
        usuario.setApellido("Perez");
        usuario.setTelefono("4564523");
        usuario.setEmail("uncorreo@gmail.com");
        return usuario;
    }
    @RequestMapping(value = "usuariosPrueba")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Pepito");
        usuario.setApellido("Perez");
        usuario.setTelefono("4564523");
        usuario.setEmail ("uncorreo@gmail.com");
        return usuario;
    }
    /*
    Funcion de prueba pa probar que funciona el request pmaping

    @RequestMapping(value = "usuariosPrueba")
    public Usuario prueba(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Pepito");
        usuario.setApellido("Perez");
        usuario.setTelefono("4564523");
        usuario.setEmail("uncorreo@gmail.com");
        return usuario;
    }
    */
}
