package Arow;
import java.util.Scanner;
//@author Arow
/*5) Escreva uma classe que leia 3 números e calcule quantos são pares e quantos são impares. (contador) 
Mostre: 
O Total de números pares é ____ 
O Total de números ímpares é ____ 
Nenhum numero par foi lido! 
OU Nenhum numero impar foi lido!*/
public class trab05 {
    public static void main(String args[]){
    Scanner ler = new Scanner (System.in);
    
    int par=0;
    int impar=0;
    
        for(int i=0;i<3;i++){
            System.out.print("Informe o "+(i+1)+"° número:");
            int n = ler.nextInt();
            
            if(n%2==0){
                par++;
            }
            else{
                impar++;
            }
        }
        
        if(par>0){
            System.out.println("O Total de números pares é: "+par);
        }
        else{
            System.out.println("Nenhum numero par foi lido!");
        }
        if(impar>0){
            System.out.println("O Total de números ímpares é: "+impar);
        }
        else{
            System.out.println("Nenhum numero impar foi lido!");
        }
    }
}
 