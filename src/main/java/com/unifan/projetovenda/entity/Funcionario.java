package com.unifan.projetovenda.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import java.util.Date;
@Data

public class Funcionario extends Pessoa {

    private String ctps;

    @Column (name = "data_Contratacao")
    private Date dataContratacao;
}
