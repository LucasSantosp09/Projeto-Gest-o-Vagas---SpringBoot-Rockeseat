package br.com.devlucassantos.gestao_vagas.modules.candidate.useCases;

import br.com.devlucassantos.gestao_vagas.modules.job.entities.JobEntity;
import br.com.devlucassantos.gestao_vagas.modules.job.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListAllJobsByFilterUseCase {

    @Autowired
    private JobRepository jobRepository;
    public List<JobEntity> execute (String filter){
       return this.jobRepository.findByDescriptionContainingIgnoreCase(filter);
    }
}
