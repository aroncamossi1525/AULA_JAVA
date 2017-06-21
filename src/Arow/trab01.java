package Arow;
import java.util.Scanner;
//@author Arow
//1) Faça uma classe que leia dois números maiores que zero, calcule e mostre um elevado ao outro.  (while ou for)
public class trab01 {
    public static void main(String args[]){
    Scanner ler = new Scanner (System.in);
    
    int result1=1;
    int result2=1;
    
        System.out.print("Informe o 1° numero maior que zero( 0 ): ");
        int n1 = ler.nextInt();
            while(n1<=0){
                System.out.println("O numero informado esta fora dos padroes determinados! Informe o 1° numero novamente:");
                 n1 = ler.nextInt();
            }
        System.out.print("Informe o 2° numero maior que zero( 0 ): ");
        int n2 = ler.nextInt();
            while(n2<=0){
                System.out.println("O numero informado esta fora dos padroes determinados! Informe o 2° numero novamente:");
                n2 = ler.nextInt();
            }
            
        for(int i=0;i<n2 ;i++){
            result1*=n1;
        }
        for(int j=0;j<n1 ;j++){
            result2*=n2;
        }
        
        System.out.println(+n1+"^"+n2+"="+result1);
        System.out.println(+n2+"^"+n1+"="+result2);
    }
}
