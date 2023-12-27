package br.com.devlucassantos.gestao_vagas.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErroMesageDTO {

    private  String message;
    private  String field;
}
