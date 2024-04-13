package com.emi.sprint1java.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "T_USUARIO")
public class Cliente {

    @Id
    int id_usuario;
    String ds_email;
    String ds_senha;
    String nm_usuario;
    String nm_empresa;
    String nm_departamento;
}
