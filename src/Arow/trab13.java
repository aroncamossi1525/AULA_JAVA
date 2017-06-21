package Arow;
import javax.swing.JOptionPane;
//@author Arow
//13) Uma determinada pessoa que trabalha com piscinas precisa de um programa que calcule o valor das construções solicitadas pelos clientes, sabendo que eles sempre fornecem o comprimento, a largura e a profundidade da piscina a ser construída. Leve em consideração que o valor é cobrado por m³ de água que a piscina conterá e o preço é de 45.00 por m³, conforme apresenta a figura do PDF.
public class trab13 {
    public static void main(String args[]){
    
    float valorm3 = 45;
    
        float comp =Float.parseFloat(JOptionPane.showInputDialog("Digite comprimento da piscina:"));
        float larg =Float.parseFloat(JOptionPane.showInputDialog("Digite a largura da piscina:"));
        float prof =Float.parseFloat(JOptionPane.showInputDialog("Digite a profundidade da piscina:"));
        
        float m3=(comp*larg*prof);
        
        JOptionPane.showMessageDialog(null,"Comprimento: "+comp+"\nLargura: "+larg+"\nProfundidade: "+prof+"\nA piscina solicitada tem: "+m3+"m³\nO valor da construção será de: "+(m3*valorm3));
    }
}
 