/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5p2_akeemieong;

/**
 *
 * @author SURFACEB2I7
 */
public class Deidad extends Extraterrestre{
    private boolean creyente;
    private String religion;

    public Deidad() {
        super();
    }

    public Deidad(boolean creyente, String religion) {
        this.creyente = creyente;
        this.religion = religion;
    }

    public Deidad(boolean creyente, String religion, String nombre, String poder, String debilidad, String escuadron, int fuerza, int agilidadfisica, int agilidadmental, String tipo) {
        super(nombre, poder, debilidad, escuadron, fuerza, agilidadfisica, agilidadmental, tipo);
        this.creyente = creyente;
        this.religion = religion;
    }

    public boolean isCreyente() {
        return creyente;
    }

    public void setCreyente(boolean creyente) {
        this.creyente = creyente;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    @Override
    public String toString() {
        return super.toString() + "creyente=" + creyente + ", religion=" + religion + '}';
    }

    

    

    
    
    
}
