package com.example.proyectoGestionUsuarios.controllers;

import com.example.proyectoGestionUsuarios.dao.UsuarioDao;
import com.example.proyectoGestionUsuarios.models.Usuario;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuario/{id}" , method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Pepito");
        usuario.setApellido("Perez");
        usuario.setTelefono("4564523");
        usuario.setEmail("uncorreo@gmail.com");
        return usuario;
    }


    @RequestMapping(value = "api/usuarios")
    public  List<Usuario> getUsuarios(){
        return usuarioDao.getUsuarios();
    }


    @RequestMapping(value = "api/usuario")
    public List<Usuario> getUsuario(){
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(123L);
        usuario.setNombre("Pepito");
        usuario.setApellido("Perez");
        usuario.setTelefono("4564523");
        usuario.setEmail("uncorreo@gmail.com");

        Usuario usuario2 = new Usuario();
        usuario.setId(12313L);
        usuario2.setNombre("pito");
        usuario2.setApellido("rez");
        usuario2.setTelefono("4564523");
        usuario2.setEmail("uncorreo@gmail.com");

        Usuario usuario3 = new Usuario();
        usuario3.setId(1321L);
        usuario3.setNombre("Pepito");
        usuario3.setApellido("Perez");
        usuario3.setTelefono("4564523");
        usuario3.setEmail("uncorreo@gmail.com");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
    }



    @RequestMapping(value = "usuariosPreba")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Pepito");
        usuario.setApellido("Perez");
        usuario.setTelefono("4564523");
        usuario.setEmail("uncorreo@gmail.com");
        return usuario;
    }
    @RequestMapping(value = "api/usuarios/{id}" , method = RequestMethod.DELETE)
    public void eliminar(@PathVariable long id){

        usuarioDao.eliminarUsuario(id);

    }
    @RequestMapping(value = "usuariosPeba")
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
