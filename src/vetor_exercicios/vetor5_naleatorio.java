package vetor_exercicios;

/**
 * Crie um vetor com 5 numeros aleatorios (diferentes) entre 10 e 20.
 * @author Arow
 */
import java.util.Random;
import java.util.*;
public class vetor5_naleatorio {
        public static void main(String []args){
            Random gerador = new Random();
            int[] vetor = new int[5]; //cria o vetor com 100 posições
            int a = 0;
            for(int i = 0; i < vetor.length; i++) {
             a = (int) (10 + Math.random() * 10); // gera um valor randomico de 0.0 ate menores q 1.0, multiplica por 100 e soma 1. Convertendo o resultado para int.
            vetor[i] = a; // atribui o valor a cada indice do vetor
        }
        for(int i = 0; i < vetor.length; i++) {
            if(vetor.length != a){
            System.out.println(vetor[i]);
            
        }
       }
     }
}
        

