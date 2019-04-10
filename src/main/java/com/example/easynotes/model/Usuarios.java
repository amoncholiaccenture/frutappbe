package com.example.easynotes.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * Created by rajeevkumarsingh on 27/06/17.
 */
@Entity
@Table(name = "usuario")
@EntityListeners(AuditingEntityListener.class)
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk_usuario;

    @NotBlank
    private String str_nombre_usuario;

    @NotBlank
    private String str_pass_usuario;

    @NotBlank
    private String str_email_usuario;

    private Boolean bool_admin_usuario;

    public Long getPk_usuario() {
        return pk_usuario;
    }

    public void setPk_usuario(Long pk_usuario) {
        this.pk_usuario = pk_usuario;
    }

    public String getStr_nombre_usuario() {
        return str_nombre_usuario;
    }

    public void setStr_name_usuario(String name) {
        this.str_nombre_usuario = name;
    }

    public String getStr_email_usuario() {
        return str_email_usuario;
    }

    public void setStr_mail_usuario(String email) {
        this.str_email_usuario = email;
    }
    
    public String getStr_pass_usuario() {
        return str_pass_usuario;
    }

    public void setStr_pass_usuario(String pass) {
        this.str_pass_usuario = pass;
    }

    public Boolean getBool_admin_usuario() {
        return bool_admin_usuario;
    }

    public void setBool_admin_usuario(Boolean admin) {
        this.bool_admin_usuario = admin;
    }

}
