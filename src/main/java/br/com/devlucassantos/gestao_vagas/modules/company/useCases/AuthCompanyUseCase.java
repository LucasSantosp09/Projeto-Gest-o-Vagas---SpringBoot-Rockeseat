package br.com.devlucassantos.gestao_vagas.modules.company.useCases;

import br.com.devlucassantos.gestao_vagas.modules.company.dto.AuthCompanyDTO;
import br.com.devlucassantos.gestao_vagas.modules.company.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.naming.AuthenticationException;

@Service
public class AuthCompanyUseCase {

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void execute (AuthCompanyDTO authCompanyDTO) throws AuthenticationException {
        var company = this.companyRepository.findyByUsername(authCompanyDTO.getUsername()).orElseThrow(
                () -> {
                    throw new UsernameNotFoundException("Company not found");
                });
        // Verificar se a senha é igual
        var passworddMatches = this.passwordEncoder.matches(authCompanyDTO.getPassword(), company.getPassword());
        // se não for igual -> Erro
        if (!passworddMatches) {
            throw new AuthenticationException();
        }

 
        // se for igual -> Gerar o token

    }
}
