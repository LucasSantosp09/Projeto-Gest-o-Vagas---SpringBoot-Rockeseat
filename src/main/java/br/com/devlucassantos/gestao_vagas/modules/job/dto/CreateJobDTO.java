package br.com.devlucassantos.gestao_vagas.modules.job.dto;

import lombok.Data;

@Data
public class CreateJobDTO {

    private String description;
    private String benefits;
    private String level;

}
