package Arow;
import javax.swing.JOptionPane;
//@author Arow
//11) Construa uma classe que calcule o produto dos inteiros impares de 1 a 15 e exiba o resultado na tela, como a figura do PDF.
public class trab11 {
    public static void main(String args[]){
    
    int result=1;
    
        for(int i=1;i<=15;i++){
            if(i%2==1){
                result*=i;
            }
        }
        JOptionPane.showMessageDialog(null,"total: "+result);
    }
}
 