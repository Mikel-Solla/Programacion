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
public class Futbolista extends SeleccionFutbol{
    private int dorsal;
    private String posicion;
    
    public Futbolista(){}
    public Futbolista(int id,String nombre, String apellidos, int edad, int dorsal, String posicion){
        super(id, nombre, apellidos, edad);
        this.dorsal=dorsal;
        this.posicion=posicion;
    }
    
    public int getDorsal(){
        return this.dorsal;
    }
    public String getPosicion(){
        return this.posicion;
    }
    
    public void setDorsal(int dorsal){
        this.dorsal=dorsal;
    }
    public void setPosicion(String posicion){
        this.posicion=posicion;
    }
    
    public void jugarPartido(){
        System.out.println(getNombre()+" juega el partido");
    }
    public void entrenar(){
        System.out.println(getNombre()+" esta entrenando");
    }
}
