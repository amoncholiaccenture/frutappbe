package com.example.easynotes.controller;

import com.example.easynotes.exception.ResourceNotFoundException;
import com.example.easynotes.model.Usuarios;
import com.example.easynotes.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by rajeevkumarsingh on 27/06/17.
 */
@RestController
@RequestMapping("/u")
public class UsuariosController {

    @Autowired
    UsuariosRepository usuariosRepository;

    @GetMapping("/usuarios")
    public List<Usuarios> getAllUsuarios() {
        return usuariosRepository.findAll();
    }

    @PostMapping("/usuarios")
    public Usuarios createUsuario(@Valid @RequestBody Usuarios usuario) {
        return usuariosRepository.save(usuario);
    }
}
