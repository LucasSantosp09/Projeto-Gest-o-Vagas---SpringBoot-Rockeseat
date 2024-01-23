package br.com.devlucassantos.gestao_vagas.modules.job.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class CreateJobDTO {

    @Schema(example = "Desenvovledor Java", requiredMode = Schema.RequiredMode.REQUIRED)
    private String description;
    @Schema(example = "Vale transporte, plano de saúde", requiredMode = Schema.RequiredMode.REQUIRED)
    private String benefits;
    @Schema(example = "Jr", requiredMode = Schema.RequiredMode.REQUIRED)
    private String level;

}
