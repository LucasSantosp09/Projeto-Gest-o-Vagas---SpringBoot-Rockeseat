package br.com.devlucassantos.gestao_vagas.modules.job.entities;

import br.com.devlucassantos.gestao_vagas.modules.company.entities.CompanyEntity;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "job")
public class JobEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String description;
    private String benefits;
    private String level;
    @ManyToOne()
    @JoinColumn(name = "company_id", insertable = false, updatable = false)
    private CompanyEntity companyEntity;
    @Column(name = "company_id")
    private UUID companyId;
    @CreationTimestamp
    private LocalDateTime createdAt;
}
