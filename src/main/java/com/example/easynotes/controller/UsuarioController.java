package com.example.easynotes.controller;

import com.example.easynotes.exception.ResourceNotFoundException;
import com.example.easynotes.model.Usuario;
import com.example.easynotes.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.persistence.TypedQuery;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;

/**
 * Created by rajeevkumarsingh on 27/06/17.
 */
@RestController
@RequestMapping("/u")
public class UsuarioController {

    @PersistenceContext
    public EntityManager em;

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping("/usuario")
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @PostMapping("/usuario")
    public Usuario createUsuario(@Valid @RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @GetMapping("/usuarios/{str_email}/{str_password}")
    public Boolean getNoteById(@PathVariable(value = "str_email") String email, @PathVariable(value = "str_password") String password) {
        TypedQuery<Usuario> query =
        em.createQuery("FROM Usuario WHERE str_email_usuario = :email AND str_pass_usuario = :password", Usuario.class);
        query.setParameter("email", email);
        query.setParameter("password", password);
        System.out.println(query.getResultList());
        List<Usuario> results = query.getResultList();
        boolean a = results.size() > 0 ? true : false;
        return a;

//        return usuarioRepository.findById(usuarioId)
//                .orElseThrow(() -> new ResourceNotFoundException("usuario", "pk_usuario", usuarioId));
    }
}
