package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Viaje {

    private LocalDate dia;
    private LocalTime hora;
    private Colectivo colectivo;

    public LocalDate getDia() {
        return dia;

    }


    public void setDia(LocalDate dia) {
        this.dia = dia;

    }

    public LocalTime getHora(){
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;


    }

    public Colectivo getColectivo() {
        return colectivo;
    }

    public void setColectivo(Colectivo colectivo) {
        this.colectivo = colectivo;
    }

    public Viaje(LocalDate dia, LocalTime hora, Colectivo colectivo) {
        this.dia = dia;
        this.hora = hora;
        this.colectivo = colectivo;

    }

    public String toString (){
        return "Dia: " + dia + "\nHora: " + hora + "\nColectivo: " + colectivo;

    }
}
