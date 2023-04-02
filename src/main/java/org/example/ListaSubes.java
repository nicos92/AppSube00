package org.example;

import javax.swing.*;
import java.util.ArrayList;

public class ListaSubes {
    private ArrayList<TarjetaSube> subes;

    // METODO CONSTRUCTOR

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

    public void removeSube(TarjetaSube tarjetaSube){

        for (int i = 0 ; 0 < subes.size() ; i++ ){
            if (subes.get(i).getId().equals(tarjetaSube.getId())) {
                subes.remove(i);
                JOptionPane.showMessageDialog(null, "Sube dada de Baja");
                break;
            }
        }

    }
}
