/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float[] nums= new float[10];
        int x;
        float numMin = 0;
        float numMax = 0;
        for(x=0;x<nums.length;x++){
            nums[x]=Float.parseFloat(JOptionPane.showInputDialog("Introduce el numero "+(x+1)));
            numMax=nums[0];
            numMin=nums[0];
            if(nums[x]>numMax)
                numMax=nums[x];
            else
                if(nums[x]<numMin)
                    numMin=nums[x];
        }
        JOptionPane.showMessageDialog(null,"El numero mas pequeño es "+numMin+" y el numero mas grande es "+numMax);
    }
    
    
}
