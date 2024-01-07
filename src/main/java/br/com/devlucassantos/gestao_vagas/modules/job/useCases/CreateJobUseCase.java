package br.com.devlucassantos.gestao_vagas.modules.job.useCases;

import br.com.devlucassantos.gestao_vagas.modules.job.entities.JobEntity;
import br.com.devlucassantos.gestao_vagas.modules.job.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateJobUseCase {

    @Autowired
    private JobRepository jobRepository;

    public JobEntity execute(JobEntity jobEntity){
        return this.jobRepository.save(jobEntity);
    }
}
