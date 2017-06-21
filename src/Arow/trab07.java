package Arow;
import java.util.Scanner;
//@author Arow
//7) Faça uma classe que leia três números inteiros e classifique-os em ordem crescente. Exemplo: Foram lidos os números 5 -1 2. Vai ser mostrado: -1 2 5.
public class trab07 {
    public static void main(String args[]){
    Scanner ler = new Scanner (System.in);
    
        System.out.print("Informe o 1° numero: ");
        int n1 = ler.nextInt();
        System.out.print("Informe o 2° numero: ");
        int n2 = ler.nextInt();
        System.out.print("Informe o 3° numero: ");
        int n3 = ler.nextInt();
        
        if(n1<n2 && n1< n3){
            if(n2<n3){
                System.out.println(+n1+","+n2+","+n3);
            }
            else{
                System.out.println(+n1+","+n3+","+n2);
            }
        }
        else if(n2<n1 && n2<n3){
            if(n1<n3){
                System.out.println(+n2+","+n1+","+n3);
            }
            else{
                System.out.println(+n2+","+n3+","+n1);
            }
        }
        else if(n3<n1 && n3<n2){
            if(n1<n2){
                System.out.println(+n3+","+n1+","+n2);
            }
            else{
                System.out.println(+n3+","+n2+","+n1);
            }
        }
    }
}
 