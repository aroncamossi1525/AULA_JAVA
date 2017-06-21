package Arow;
import java.util.Scanner;
//@author Arow
//3) Sabe-se que para iluminar de maneira correta os cômodos de uma casa, para cada m², deve-se usar 18 w de potência. Faça uma classe que leia as duas dimensões de um cômodo (em metros), calcule e mostre a sua área (em m²) e a potência de iluminação que deverá ser utilizada
public class trab03 {
    public static void main(String args[]){
    Scanner ler = new Scanner (System.in);
    
        System.out.print("Informe a 1° diemensão: ");
        int d1 = ler.nextInt();
            while(d1<=0){
                System.out.println("A dimensão nao pode ser maior que zero ( 0 ), informe novamente a 1° diemensão: ");
                d1 = ler.nextInt();
            }
        System.out.print("Informe a 2° diemensão: ");
        int d2 = ler.nextInt();
            while(d2<=0){
                System.out.println("A dimensão nao pode ser maior que zero ( 0 ), informe novamente a 2° diemensão: ");
                d2 = ler.nextInt();
            }
            
        System.out.println("A área é de "+(d1*d2)+"m² e a potência necessitada é de "+((d1*d2)*18)+"W.");
    }
}
 