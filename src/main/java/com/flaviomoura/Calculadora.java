package com.flaviomoura;

public class Calculadora {

    private boolean instancia;

    public Boolean getInstancia(){
        return this.instancia;
    }

    public Calculadora(){
        this.instancia = true;
    }

    public int soma(int parcela1, int parcela2){
        return parcela1 + parcela2;
    }
}
