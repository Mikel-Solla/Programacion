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
public class Aficionado extends SeleccionFutbol{
    private String equipo;

    public Aficionado() {}
    public Aficionado(String equipo, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.equipo = equipo;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    
}
