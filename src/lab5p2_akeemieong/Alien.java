/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5p2_akeemieong;

/**
 *
 * @author SURFACEB2I7
 */
public class Alien extends Extraterrestre{
    private String lugar;

    public Alien() {
        super();
    }

    public Alien(String lugar, String nombre, String poder, String debilidad, String escuadron, int fuerza, int agilidadfisica, int agilidadmental, String tipo) {
        super(nombre, poder, debilidad, escuadron, fuerza, agilidadfisica, agilidadmental, tipo);
        this.lugar = lugar;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return super.toString() + "lugar=" + lugar;
    }
    
    
}
