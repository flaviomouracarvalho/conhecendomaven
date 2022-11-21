package com.flaviomoura;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTeste {
    @Test
    @DisplayName("Soma de dois inteiros")
    void deveriaSomarInteiros(){
        Calculadora calculadora = new Calculadora();
        assertEquals(2, calculadora.soma(1,1));
    }
    
}
