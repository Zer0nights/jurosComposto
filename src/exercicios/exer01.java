package exercicios;

import java.util.Scanner;

public class exer01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] vetorA = new int[10];
        int zero = 0;
        int um = 0;

        for(int i = 0;i<10;i++){
            vetorA[i]=(int)Math.round(Math.random()*1);
        }
        for (int elemento : vetorA) {
            if (elemento == 0) {
                zero++;
            } else if (elemento == 1) {
                um++;
            }
        }
        double percentualZeros = (zero / (double) vetorA.length) * 100;
        double percentualOnes = (um / (double) vetorA.length) * 100;

        System.out.println("Vetor A: " + java.util.Arrays.toString(vetorA));
        System.out.printf("Percentual de 0s: %.2f%%\n", percentualZeros);
        System.out.printf("Percentual de 1s: %.2f%%\n", percentualOnes);
    }
}
