package ejercicio1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Ejercicio1 {
 
    public static void main(String[] args) {
        ArrayList <Double> lista=new ArrayList();
        llenar(lista);
        menu(lista);  
    }
    
    public static void llenar(ArrayList lista){
        double num;
        String resp="s";
        resp=JOptionPane.showInputDialog("Quieres meter algun numero?(s/n)");
        while(resp.equalsIgnoreCase("s")){
            num=Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero a la lista"));
            lista.add(num);
            resp=JOptionPane.showInputDialog("Quieres continuar?(s/n)");
        }
    }
    
    public static void menu(ArrayList lista){
        int menu=Integer.parseInt(JOptionPane.showInputDialog("Que quieres hacer:\n"
                + "1. Visualizar el valor maximo y el mınimo.\n"
                + "2. Solicitar un numero y buscarlo. Muestra un mensaje indicando si lo has encontrado o no.\n"
                + "3. Solicitar un numero, buscarlo y borrarlo. Sino se encuentra muestra un mensaje de error.\n"
                + "4. Convertir el arrayList en un array.\n"
                + "5. Si no esta vac´ıo, mostrar el numero de elementos que contiene.\n"
                + "6. Insertar un nuevo elemento por el final.\n"
                + "7. Insertar un nuevo elemento en la posicion que te indique el usuario.\n"
                + "8. Borrar un elemento de una posicion concreta.\n"
                + "9. Calcular la suma y la media aritmetica de los valores contenidos.\n"
                + "10. Finalizar."));
        switch(menu){
            case 1:
               caso1(lista);
                break;
            case 2:
                double busc=Double.parseDouble(JOptionPane.showInputDialog("Que numero quieres buscar?"));
                caso2(busc, lista);
                break;
            case 3:
                int quitar=Integer.parseInt(JOptionPane.showInputDialog("Que numero quieres borrar?"));
                caso3(lista,quitar);
                break;
            case 4:
                caso4(lista);
                break;
            case 5:
                caso5(lista);
                break;
            case 6:
                int fin=Integer.parseInt(JOptionPane.showInputDialog("Que nuevo elemento quieres meter?"));
                caso6(lista,fin);
                break;
            case 7:
                int pos=Integer.parseInt(JOptionPane.showInputDialog("En que posicion quieres meter un nuevo numero?"));
                caso7(pos,lista);
                break;
            case 8:
                int posicion=Integer.parseInt(JOptionPane.showInputDialog("Que posicion quieres borrar?"));
                caso8(posicion,lista);
                break;
            case 9:
                caso9(lista);
                break;
            case 10:
                System.exit(0);
               
        }
    }
    
    public static void caso8(int posicion, ArrayList lista){
        lista.remove(posicion);
                
        Iterator <Double > nombreIterator = lista.iterator();
        while( nombreIterator .hasNext ()){
        double elemento = nombreIterator.next ();
        JOptionPane.showMessageDialog(null, elemento);
                }
    }
    
    public static void caso7(int pos, ArrayList lista){
        int elemento=Integer.parseInt(JOptionPane.showInputDialog("Que quieres meter?"));
        lista.set(pos, elemento);
        JOptionPane.showMessageDialog(null, lista);
    }
    
    public static void caso6(ArrayList lista,int fin){
        lista.add(fin);
        JOptionPane.showMessageDialog(null, lista);
    }
    
    public static void caso3(ArrayList lista, int quitar){
        
        if(lista.contains(quitar)){
            lista.remove(quitar);
            JOptionPane.showMessageDialog(null, "Numero borrado:"+lista);
        }
        else
            JOptionPane.showMessageDialog(null, "Numero no encontrado");
    }

    public static void caso2(double busc, ArrayList lista){
        if(lista.contains(busc))
            JOptionPane.showMessageDialog(null, "La posicion del numero es "+lista.indexOf(busc));
        else
            JOptionPane.showMessageDialog(null, "Numero no encontrado");
        
    }

    public static void caso4(ArrayList lista){
        Object [] array = lista.toArray ();
        JOptionPane.showMessageDialog(null,"ArrayList convertido");
    }
    
    public static void caso5(ArrayList lista){
        if(lista.isEmpty())
            JOptionPane.showMessageDialog(null,"ArrayList vacio");
        else
            JOptionPane.showMessageDialog(null,"La lista contiene "+lista.size()+" numeros");
    }
    
    public static void caso1(ArrayList lista){
        JOptionPane.showMessageDialog(null, "El numero mas alto es el "+Collections.max(lista)+"/"+Collections.min(lista));
    }
    
    /*Falta por hacer*/
    public static void caso9(ArrayList lista){
        double total;
        double suma = 0;
        
    }
}
