package Arow;
import javax.swing.JOptionPane;
//@author Arow
//Faça uma classe que receba a quantidade e o valor de três produtos no seguinte formato: Quantidade1, Valor1, Quantidade2, Valor2, Quantidade3 e Valor3. O programa deve calcular esses valores seguindo a fórmula total = Quantidade1 x Valor1 + Quantidade2 x Valor2 + Quantidade3 x Valor3. O Valor Total deve ser apresentado no final da execução do programa conforme indica a figura do PDF.
public class trab09 {
    public static void main(String args[]){
    
    float total=0;
    
        for(int i=0; i<3; i++){
            int quant =Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do "+(i+1)+"° produto:"));
            float val =Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do "+(i+1)+"° produto:"));
            
            total+=(quant*val);
        }
        
        JOptionPane.showMessageDialog(null,"O valor total dos produtos é de: "+total);
    }
}
 