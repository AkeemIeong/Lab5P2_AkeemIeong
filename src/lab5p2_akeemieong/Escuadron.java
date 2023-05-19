/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5p2_akeemieong;

import java.util.ArrayList;

/**
 *
 * @author SURFACEB2I7
 */
public class Escuadron {
    private String nombre;
    private String base;
    private Persona lider;
    private String tipo;
    private ArrayList<Persona> integrantes=new ArrayList<Persona>();

    public Escuadron(String nombre, String base, Persona lider, String tipo) {
        this.nombre = nombre;
        this.base = base;
        this.lider = lider;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Persona getLider() {
        return lider;
    }

    public void setLider(Persona lider) {
        this.lider = lider;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Persona> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<Persona> integrantes) {
        this.integrantes = integrantes;
    }

    @Override
    public String toString() {
        return "Nombre del escuadron: " + nombre 
                + "\nLugar de la base: " + base 
                + "\nNombre del lider: " + lider 
                + "\nTipo de escuadron: " + tipo 
                + "\nIntegrantes: " + integrantes + "\n";
    }
    
    
}
