package com.flaviomoura;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

public class CalculadoraTeste {
    Calculadora calculadora = new Calculadora();

    @Test
    @DisplayName("A Classe deve ser instanciada")
    void verificaClasseInstanciada(){
        assertTrue(calculadora.getInstancia());
    }

    @Test
    @DisplayName("Soma de dois inteiros")
    void deveriaSomarInteiros(){
        assertEquals(2, calculadora.soma(1,1));
    }

    @Test
    @DisplayName("Subtração de dois inteiros")
    void deveriaSubtrairInteiros(){
        assertEquals(3, calculadora.subtracao(5, 2));
    }

    @Test
    @DisplayName("Multiplicacao de dois inteiros")
    void deveriaMultiplicarInteiros(){
        assertEquals(10, calculadora.multiplicacao(2, 5));
    }

    @Test
    @DisplayName("Divisão de dois inteiros")
    void deveriaDividirInteiros(){
        assertEquals(2.0, calculadora.divisao(5, 2));
    }
    
}
