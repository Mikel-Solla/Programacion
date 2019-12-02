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
public class SeleccionFutbol {
    //Atributos de la clase
    protected int id;
    protected String Nombre;
    protected String Apellidos;
    protected int Edad;
    
    //Metodos
    //1.Constructores
    public SeleccionFutbol(){}
    public SeleccionFutbol(int id, String nombre, String apellidos, int edad){
        this.id=id;
        this.Nombre=nombre;
        this.Apellidos=apellidos;
        this.Edad=edad;
    }
    
    //2.Get
    public int getId(){
        return this.id;
    }
    public String getNombre(){
        return this.Nombre;
    }
    public String getApellidos(){
        return this.Apellidos;
    }
    public int getEdad(){
        return this.Edad;
    }
    
    //3.Set
    public void setId(int identificador){
        this.id=identificador;
    }
    public void setNombre(String nombre){
        this.Nombre=nombre;
    }
    public void setApellidos(String apellidos){
        this.Apellidos=apellidos;
    }
    public void setEdad(int edad){
        this.Edad=edad;
    }
    
    //4.Otros metodos
    public void viajar(){
        System.out.println(getNombre()+" viaja");
    }
    public void concentrarse(){
         System.out.println(getNombre()+" se concentra");
    }
}
