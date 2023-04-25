package com.unifan.projetovenda.entity;

import lombok.Data;

import javax.persistence.Column;
import java.util.Date;
@Data
public class Cliente extends Pessoa {

    @Column(name = "data_Cadastro")
    private Date dataCadastro;

}
