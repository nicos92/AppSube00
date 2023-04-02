package org.example;

public class Saldo {

    private Double saldo;


    // METODO CONSTRUCTOR
    public Saldo (Double saldo){
        this.saldo = saldo;
    }

    public void setSaldo (Double saldo){
        this.saldo= saldo;

    }
    public Double getSaldo (){
        return this.saldo;
    }

    public void cargarSaldo(double carga){
        this.saldo += carga;

    }

    @Override
    public String toString() {
        return String.valueOf(saldo);
    }


}
