package org.example;

import java.awt.font.TextHitInfo;
import java.util.ArrayList;
import java.util.List;

public class TarjetaSube {

    private Saldo saldo;
    private Persona persona;
    private List<Viaje> viajes;
    private Integer Id;

    public TarjetaSube (Integer Id){
        this.Id = Id;
        this.saldo = new Saldo(0.0);
        this.viajes = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "\nSUBE ID: " + Id +", Saldo: $" + saldo + ",\nPersona: " + persona + "\n";

    }

    public Saldo getSaldo() {
        return saldo;
    }

    public void setSaldo(Saldo saldo) {
        this.saldo = saldo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Viaje> getViajes() {
        return viajes;
    }

    public void setViajes(List<Viaje> viajes) {
        this.viajes = viajes;
    }



    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }
}
