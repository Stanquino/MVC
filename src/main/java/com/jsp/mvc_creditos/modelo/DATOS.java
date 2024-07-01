package com.jsp.mvc_creditos.modelo;

public class DATOS {
    private int sueldo;
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;

    public DATOS() {
    }

    public DATOS(int sueldo,String nombre, String apellido, int edad, String genero) {
        this.sueldo = sueldo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
