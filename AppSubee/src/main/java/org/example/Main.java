package org.example;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
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
                0) Salir del Programa""", "App Sube", JOptionPane.QUESTION_MESSAGE);

            switch (opcion){
                case "1" -> darDeAltaSube(subes);
                case "2" -> hacerViaje();
                case "3" -> cargarSaldo();
                case "4" -> consultarSubes(subes);
                case "0" -> JOptionPane.showMessageDialog(null, "Adios");
                default -> JOptionPane.showMessageDialog(null, "No es una opcion");
            }
         }while (!opcion.equals("0"));

    }

    private static void consultarSubes(ListaSubes subes) {
        System.out.println(subes);

    }

    private static void cargarSaldo() {
        if(subes.getSubes().isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay Subes existentes");
            return;
        }

        boolean idCorrecto = false;
        TarjetaSube tarjetaSube = null;
        int id;
        double carga;


        do {
            System.out.println("Ingrese id de la tarjeta sube que a la quiere cargar saldo: ");
            id = scanner.nextInt();

            for (TarjetaSube tarjeta : subes.getSubes()) {
                if (id == tarjeta.getId()) {
                    idCorrecto = true;
                    tarjetaSube = tarjeta;
                }
            }
            if (!idCorrecto) System.out.println("Id Incorrecto");


        }while (!idCorrecto);

        System.out.println("Ingrese la Cantidad a cargar: ");
        carga = scanner.nextDouble();
        tarjetaSube.getSaldo().cargarSaldo(carga);


        System.out.println("Su Nuevo Saldo es: $" + tarjetaSube.getSaldo());
    }

    private static void hacerViaje() {
        System.out.println("Hacer Viaje");
    }

    private static void darDeAltaSube(ListaSubes subes) {

        Integer dni = Integer.valueOf(JOptionPane.showInputDialog("Ingrese dni:"));
        String apellido = JOptionPane.showInputDialog("Ingrese apellido:");
        String nombre = JOptionPane.showInputDialog("Ingrese nombre:");
        Persona persona = new Persona(dni, apellido, nombre);

        int id = subes.getSubes().size() + 1;
        TarjetaSube tarjetaSube = new TarjetaSube(id, persona);
        subes.addSube(tarjetaSube);
        JOptionPane.showMessageDialog(null,"Alta exitosa, Tarjeta Sube Id: " + id);
    }
}