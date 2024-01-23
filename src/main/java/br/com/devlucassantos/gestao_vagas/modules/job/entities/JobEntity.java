package br.com.devlucassantos.gestao_vagas.modules.job.entities;

import br.com.devlucassantos.gestao_vagas.modules.company.entities.CompanyEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "job")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class JobEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Schema(example = "Desenvolvedor React")
    private String description;
    @Schema(example = "Vale Transporte, Plano saúde")
    private String benefits;
    @Schema(example = "Pleno")
    private String level;
    @ManyToOne()
    @JoinColumn(name = "company_id", insertable = false, updatable = false)
    private CompanyEntity companyEntity;
    @Column(name = "company_id")
    private UUID companyId;
    @CreationTimestamp
    private LocalDateTime createdAt;
}
