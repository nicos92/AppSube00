package org.example;

public enum Colectivo{

    LINEA404("Linea 404"),
    LINEA503("Linea 503"),
    LINEA200("Linea 200"),
    LINEA388("Linea 388");

    private final String linea;

    @Override
    public String toString() {
        return linea ;
    }

    Colectivo(String linea) {
        this.linea = linea;
    }
}
