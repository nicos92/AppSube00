package org.example;

import javax.swing.*;

public class Main {
    static ListaSubes subes = new ListaSubes();
    public static void main(String[] args) {

        String opcion;

         do{
             opcion = JOptionPane.showInputDialog(null, """
                Igrese una opcion
                1) Dar de alta una tarjeta Sube
                2) Hacer un Viaje
                3) Cargar SAldo
                4) Consultar Subes
                5) Poner Sube a Nombre de una Persona
                6) Dar de baja Tarjeta sube
                0) Salir del Programa""", "App Sube", JOptionPane.QUESTION_MESSAGE);

            switch (opcion){
                case "1" -> darDeAltaSube(subes);
                case "2" -> hacerViaje();
                case "3" -> cargarSaldo();
                case "4" -> consultarSubes(subes);
                case "5" -> asignarPersonaASube();
                case "6" -> darDeBajaTarjetaSube();
                case "0" -> JOptionPane.showMessageDialog(null, "Adios");
                default -> JOptionPane.showMessageDialog(null, "No es una opcion");
            }
         }while (!opcion.equals("0"));
    }

    private static void darDeBajaTarjetaSube() {
        JOptionPane.showMessageDialog(null, "Ingrese id de la tarjeta sube que quiere dar de baja: ");
        TarjetaSube tarjetaSube = getTarjetaSube();
        subes.removeSube(tarjetaSube);
    }

    private static void asignarPersonaASube() {
        if (verSubesEmpty()) return;

        JOptionPane.showMessageDialog(null, "Ingrese id de la tarjeta sube que quiere poner a nombre de una Persona: ");
        TarjetaSube tarjetaSube = getTarjetaSube();

        String dni = JOptionPane.showInputDialog("Ingrese dni:");
        String apellido = JOptionPane.showInputDialog("Ingrese apellido:");
        String nombre = JOptionPane.showInputDialog("Ingrese nombre:");

        Persona persona = new Persona(dni, apellido, nombre);

        tarjetaSube.setPersona(persona);
        JOptionPane.showMessageDialog(null, tarjetaSube);
    }

    private static void consultarSubes(ListaSubes subes) {
        System.out.println(subes);



    }

    private static void cargarSaldo() {
        if (verSubesEmpty()) return;
        boolean confirm = false;
        double carga = 0.0;
        JOptionPane.showMessageDialog(null,"Ingrese id de la tarjeta sube que a la quiere cargar saldo: ");
        TarjetaSube tarjetaSube = getTarjetaSube();
        do {
            try{
                String preCarga = JOptionPane.showInputDialog("Ingrese la Cantidad a cargar: ");
                carga = Double.parseDouble(preCarga);
                confirm = true;
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "No es una carga valida", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }while (!confirm);
        tarjetaSube.getSaldo().cargarSaldo(carga);
        JOptionPane.showMessageDialog(null,"Su Nuevo Saldo es: $" + tarjetaSube.getSaldo());
    }

    private static boolean verSubesEmpty() {
        if(subes.getSubes().isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay Subes existentes");
            return true;
        }
        return false;
    }

    private static TarjetaSube getTarjetaSube(){
        boolean idCorrecto = false;
        int id;
        TarjetaSube tarjetaSube = null;
        do {
            id = confInt();
            for (TarjetaSube tarjeta : subes.getSubes()) {
                if (id == tarjeta.getId()) {
                    idCorrecto = true;
                    tarjetaSube = tarjeta;
                }
            }
            if (!idCorrecto) JOptionPane.showMessageDialog(null, "Id Incorrecto");
        }while (!idCorrecto);
        return tarjetaSube;
    }

    private static int confInt() {
        boolean confirmarInt = false;
        int Id = 0;
        do {
            try{
                String preId = JOptionPane.showInputDialog(null, "Ingrese Id de la Tarjeta Sube");
                Id = Integer.parseInt(preId);
                confirmarInt = true;
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "No es un Id valido", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }while (!confirmarInt);
        return Id;
    }

    private static void hacerViaje() {
        System.out.println("Hacer Viaje");
    }

    private static void darDeAltaSube(ListaSubes subes) {

        int id = subes.getSubes().size() + 1;
        TarjetaSube tarjetaSube = new TarjetaSube(id);
        subes.addSube(tarjetaSube);
        JOptionPane.showMessageDialog(null,"Alta exitosa, Tarjeta Sube Id: " + id);
    }
}