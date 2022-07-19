package com.poo;

public class Coche {
    String marca;
    String cilindraje;
    String modelo;
    int year;

    public Coche(String marca, String cilindraje, String modelo, int year) {
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.modelo = modelo;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", cilindraje='" + cilindraje + '\'' +
                ", modelo='" + modelo + '\'' +
                ", year=" + year +
                '}';
    }
}
