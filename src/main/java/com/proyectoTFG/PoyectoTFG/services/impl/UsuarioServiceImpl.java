package com.proyectoTFG.PoyectoTFG.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectoTFG.PoyectoTFG.entities.Usuario;
import com.proyectoTFG.PoyectoTFG.repositories.UsuarioRepository;
import com.proyectoTFG.PoyectoTFG.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{


    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Override
    //@Transactional
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public void deleteById(Long id) {

        usuarioRepository.deleteById(id);
    }


    @Override
    //@Transactional
    public Optional<Usuario> findByUserName(String email) {
        return usuarioRepository.findByUserName(email);
    }
    
}
