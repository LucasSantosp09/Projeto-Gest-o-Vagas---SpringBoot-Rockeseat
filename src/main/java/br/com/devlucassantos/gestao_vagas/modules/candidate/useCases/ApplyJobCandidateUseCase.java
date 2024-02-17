package br.com.devlucassantos.gestao_vagas.modules.candidate.useCases;

import br.com.devlucassantos.gestao_vagas.exceptions.JobNotFoundException;
import br.com.devlucassantos.gestao_vagas.exceptions.UserNotFoundException;
import br.com.devlucassantos.gestao_vagas.modules.candidate.repositories.CandidateRepository;
import br.com.devlucassantos.gestao_vagas.modules.job.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ApplyJobCandidateUseCase {

    @Autowired
    private CandidateRepository candidateRepository;

    @Autowired
    private JobRepository jobRepository;

    //ID do candidato
    //ID da vaga
    public void execute(UUID idCandidate, UUID idJob){
        //validar e o candidato existe
        this.candidateRepository.findById(idCandidate)
                .orElseThrow(() -> {
                   throw new UserNotFoundException();
                });


        //validar se a vaga existe
        this.jobRepository.findById(idJob)
                .orElseThrow(() -> {
                    throw new JobNotFoundException();
                });

        //candidato se inscrever na vaga
    }
}
