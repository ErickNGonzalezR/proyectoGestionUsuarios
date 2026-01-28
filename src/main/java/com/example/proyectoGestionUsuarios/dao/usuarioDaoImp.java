package com.example.proyectoGestionUsuarios.dao;

import com.example.proyectoGestionUsuarios.models.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class usuarioDaoImp implements UsuarioDao{

    @Override
    public List<Usuario> getUsuarios() {
        return List.of();
    }
}
