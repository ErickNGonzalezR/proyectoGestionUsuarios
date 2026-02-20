package com.example.proyectoGestionUsuarios.dao;

import com.example.proyectoGestionUsuarios.models.Usuario;

import java.util.List;

public interface UsuarioDao {
    List<Usuario> getUsuarios();

    void eliminarUsuario(long id);
}
