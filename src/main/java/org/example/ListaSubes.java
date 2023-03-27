package org.example;

import java.util.ArrayList;

public class ListaSubes {
    private ArrayList<TarjetaSube> subes;

    public ListaSubes() {
        this.subes = new ArrayList<>();
    }

    public ArrayList<TarjetaSube> getSubes() {
        return subes;
    }

    public void setSubes(ArrayList<TarjetaSube> subes) {
        this.subes = subes;
    }

    public void addSube(TarjetaSube tarjetaSube){
        subes.add(tarjetaSube);
    }

    @Override
    public String toString() {
        return "Lista de Subes:\n" + subes;
    }
}
