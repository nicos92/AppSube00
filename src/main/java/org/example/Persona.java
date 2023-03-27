package org.example;

public class Persona {
   private String dni;
    private String apellido;
    private String nombre;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "\nDNI: " + dni + "\nApellido: " + apellido + "\nNombre: " + nombre;
    }

    public Persona(String dni, String apellido, String nombre) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;

    }
}
