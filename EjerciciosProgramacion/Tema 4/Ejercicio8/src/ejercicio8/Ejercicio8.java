package ejercicio8;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] codigos=new int[5];
        int [] faltas=new int[5]; 
        RellenarFaltas(faltas);
        String resp="";
        int x=0;
        String mensaje="Estos son los alumnos que han faltado: \n";
        Actividad(codigos, faltas, resp, x, mensaje);
        
    }
    
    public static void RellenarFaltas(int[] faltas){
        faltas[0]=0;
        faltas[1]=0;
        faltas[2]=0;
        faltas[3]=0;
        faltas[4]=0;
    }
    
    
    public static void Actividad(int [] codigos, int [] faltas, String resp, int x, String mensaje){
        do{
            int codigo=Integer.parseInt(JOptionPane.showInputDialog("Que alumno a faltado?"));
            
                int falta=Integer.parseInt(JOptionPane.showInputDialog("Cuantas horas a faltado?"));
                faltas[x]+=falta;
                mensaje=mensaje+codigos[x]+" tiene "+faltas[x]+" faltas\n";
            
                x++;
                codigos[x]=codigo;
        
            
            resp=JOptionPane.showInputDialog("Quieres continuar?");
        }
        while(resp.equalsIgnoreCase("si"));
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
