package org.example;

public class Perro {
    // Atributos
    private String raza;
    private int edad;
    private String color;
    private String tamaño;
    private String nombre;

    // Constructor
    public Perro(String raza, int edad, String color, String tamaño, String nombre) {
        this.raza = raza;
        this.edad = edad;
        this.color = color;
        this.tamaño = tamaño;
        this.nombre = nombre;
    }

    // Getters y Setters
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos (sin implementar)
    public void ladrar() {
        // Implementación
    }

    public void comer() {
        // Implementación
    }

    public void dormir() {
        // Implementación
    }

    public void jugar() {
        // Implementación
    }
}
