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
public class Entrenador extends SeleccionFutbol{
    private String idFederacion;

    public Entrenador() {}
    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion=idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    
    
}
