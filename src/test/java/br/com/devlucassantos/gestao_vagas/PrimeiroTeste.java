package br.com.devlucassantos.gestao_vagas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PrimeiroTeste {

    @Test
    public void deve_ser_posssivel_clacular_dois_numeros(){
        var result = calculate(2, 4);
        assertEquals(result,6);
    }
    @Test
    public void validar_valor_incorreto(){
        var result = calculate(2, 4);
        assertNotEquals(result, 5);
    }

    public static double calculate ( int num1, int num2 ) {
        return num1+num2;
    }


}
