package com.arttt95.curso.classes;

public class ContaBancaria {

    // Atributos
    protected double saldo = 0;

    // Métodos
    public void sacar(){
        // Recuperar o saldo atual da pessoa
        this.saldo = 100;
        this.recuperarSaldo();
    }

    public void transferir(){
        // Recuperar o saldo atual da pessoa
    }

    private void recuperarSaldo() {
        // Lógica
    }


}

// Default -> Dentro da própria classe e do pacote

// Public -> Em qualquer lugar do código

// Private -> Apenas dentro da própria classe

// Protected -> Dentro do mesmo pacote e/ou dentro das subclasses
