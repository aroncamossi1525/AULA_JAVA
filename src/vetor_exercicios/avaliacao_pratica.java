package vetor_exercicios;
import javax.swing.JOptionPane;
//@author Arow
public class avaliacao_pratica{
    public static void main(String args[]){
    int[] numeros = new int [10];
    int i=0;
    int j=0;
    int aux=0;
    int soma=0;
    int maior=0;
    int menor=0;
    int Npares=0;
    int Nimpares=0;
    int[] pares = new int [10];
    int[] impares = new int [10];
    int numero=0;
    int[] crescente = new int [10];
        for(i=0;i < numeros.length; i++){//lendo valores
            numeros[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o "+(i+1)+"° numero:"));
        }
            for(i=0; i < numeros.length; i++){//somando
                soma+=numeros[i];
            }
            System.out.println("A soma do vetor é: "+soma);
            
            for(i=0;i < numeros.length; i++){//exibindo maior
                if(numeros[i] > maior){
                    maior=numeros[i];
                }
            }
            System.out.println("O número "+maior+" é o maior numero do vetor");
            
            menor=maior;//BR sendo BR
            for(i=0;i < numeros.length; i++){//exibindo menor
                if(numeros[i] < menor){
                    menor=numeros[i];
                }
            }
            System.out.println("O número "+menor+" é o menor numero do vetor");
           
//*************************************************
            
    for(i=0;i < numeros.length; i++){//contando numeros pares do vetor
        if(numeros[i]%2==0){
            Npares++;
        }
    }
            
    for(i=0; i < numeros.length; i++){//contando numeros impares do vetor
        if(numeros[i]%2==1){
            Nimpares++;
        }
    }
     
//*************************************************

            j=0;
            for(i=0;i < numeros.length; i++){//armazenando valores pares
                if(numeros[i]%2==0){
                        pares[j]=numeros[i];
                        j++;
                }
            }
            
            j=0;
            for(i=0;i < numeros.length; i++){//armazenando valores impares
                if(numeros[i]%2==1){
                    impares[j]=numeros[i];
                    j++;
                }
            }
            
            System.out.print("Há "+Npares+" numeros pares no vetor e são: ");//exibindo quantidade e numeros pares do vetor
            for(i=0; i < Npares; i++){
                System.out.print(+pares[i]+" ");
            }
            System.out.print("\n");
            
            System.out.print("Há "+Nimpares+" numeros impares no vetor e são: ");//exibindo quantidade e numeros impares do vetor
            for(i=0; i < Nimpares; i++){
                System.out.print(+impares[i]+" ");
            }
            System.out.print("\n");
            
            numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numero que quer procurar:"));//recebendo o numero a ser solicitao pelo usucario
            i=0;
            for(i=0; i<numeros.length; i++){//procurando numero solicitado pelo usuario no vetor
                if(numero==numeros[i]){
                    JOptionPane.showMessageDialog(null,"O numero "+numero+" esta na casa "+i+" do vetor ");
                }
                else if(numero!=numeros[i]){
                    aux++;
                }
            }
            if(aux==10){
                JOptionPane.showMessageDialog(null,"O numero informado não existe no vetor" ,"ERRO!" , JOptionPane.ERROR_MESSAGE);
            }
                        
            for(i=0; i<numeros.length; i++){//vetor crescente recebe os valores de numeros na ordem digitada pelo usuario
                crescente[i]=numeros[i];
            }
            aux=0;
            for(j=0; j<10; j++){//primeira repetiçao que pega os numeros de um por um pra comparar com os outros 9
                for(i=0; i<9; i++){//segunda repetiçao compara os 9 numeros com o que esta no primeira repetiçao
                   if(crescente[i]>crescente[i+1]){
                        aux = crescente[i];//aux recebe o numero que for maior entre os 2 comparados
                        crescente[i] = crescente[i+1];//crescente[y] recebe o numero menor
                        crescente[i+1] = aux;//crescente[y+1] recebe o aux que é o maior
                    }
                }
            }
            System.out.print("Vetor ordenado em ordem crescente: ");
            for(i=0; i<10; i++){
                System.out.print(+crescente[i]+" "); 
            }
            
    }
}
