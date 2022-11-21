package com.flaviomoura;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
    
}
