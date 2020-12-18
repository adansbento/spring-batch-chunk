package com.batch.chunck.domain;

import lombok.Data;
import org.apache.logging.log4j.util.Strings;

import java.util.Date;

@Data
public class Pessoa {

    private int id;
    private String nome;
    private String email;
    private Date dataNascimento;
    private int idade;

    public Boolean isValid() {
        return !Strings.isBlank(nome) && !Strings.isBlank(email) && dataNascimento != null;
    }

}
