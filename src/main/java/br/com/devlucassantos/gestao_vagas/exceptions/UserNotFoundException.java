package br.com.devlucassantos.gestao_vagas.exceptions;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException (){
        super("Usuário não existe");
    }
}
