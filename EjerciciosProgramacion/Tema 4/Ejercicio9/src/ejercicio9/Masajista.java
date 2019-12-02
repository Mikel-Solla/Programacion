/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author 1GDAW08
 */
public class Masajista extends SeleccionFutbol{
    private String titulacion;
    private int añosExaperiencia;

    public Masajista() {}

    public Masajista(String titulacion, int añosExaperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.añosExaperiencia = añosExaperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñosExaperiencia() {
        return añosExaperiencia;
    }

    public void setAñosExaperiencia(int añosExaperiencia) {
        this.añosExaperiencia = añosExaperiencia;
    }
    
    
}
