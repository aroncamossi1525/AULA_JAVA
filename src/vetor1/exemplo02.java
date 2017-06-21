package vetor1;

import javax.swing.JOptionPane;

public class exemplo02 {
    public static void main(String args[]){
   int[] numeros = new int [5];
        for(int i=0;i < numeros.length; i++){
            numeros[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero:"));
        }
        for(int i=0;i < numeros.length; i++){
            System.out.println("Numero na posiçao "+i+": "+numeros[i]);
        }
   }
}
