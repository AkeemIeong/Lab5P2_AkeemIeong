/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5p2_akeemieong;

/**
 *
 * @author SURFACEB2I7
 */
public class Persona {
    private String nombre;
    private String poder;
    private String debilidad;
    private String escuadron;
    private int fuerza,agilidadfisica,agilidadmental;
    private String tipo;

    public Persona() {
    }

    public Persona(String nombre, String poder, String debilidad, String escuadron, int fuerza, int agilidadfisica, int agilidadmental, String tipo) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.escuadron = escuadron;
        setFuerza(fuerza);
        setAgilidadfisica(agilidadfisica);
        setAgilidadmental(agilidadmental);
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getEscuadron() {
        return escuadron;
    }

    public void setEscuadron(String escuadron) {
        this.escuadron = escuadron;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        if(fuerza>0){
            this.fuerza = fuerza;
        }
        
    }

    public int getAgilidadfisica() {
        return agilidadfisica;
    }

    public void setAgilidadfisica(int agilidadfisica) {
        if(this.agilidadfisica>0){
            this.agilidadfisica = agilidadfisica;
        }
        
    }

    public int getAgilidadmental() {
        return agilidadmental;
    }

    public void setAgilidadmental(int agilidadmental) {
        if(agilidadmental>0){
            this.agilidadmental = agilidadmental;
        }
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre 
                + "\npoder=" + poder 
                + "\ndebilidad=" + debilidad 
                + "\nescuadron=" + escuadron 
                + "\nfuerza=" + fuerza 
                + "\nagilidadfisica=" + agilidadfisica 
                + "\nagilidadmental=" + agilidadmental 
                + "\ntipo=" + tipo +"\n";
    }
    
    
    
}
