/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5p2_akeemieong;

/**
 *
 * @author SURFACEB2I7
 */
public class Mutante extends Persona{
    private String factor;

    public Mutante() {
        super();
    }

    public Mutante(String factor) {
        this.factor = factor;
    }

    public Mutante(String factor, String nombre, String poder, String debilidad, String escuadron, int fuerza, int agilidadfisica, int agilidadmental, String tipo) {
        super(nombre, poder, debilidad, escuadron, fuerza, agilidadfisica, agilidadmental, tipo);
        this.factor = factor;
    }

    public String getFactor() {
        return factor;
    }

    public void setFactor(String factor) {
        this.factor = factor;
    }

    @Override
    public String toString() {
        return super.toString() + "factor=" + factor + '}';
    }
    
    
}
