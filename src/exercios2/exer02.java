package exercios2;

import java.util.Arrays;

public class exer02 {
    public static void main(String[] args) {
        int[] vetorA = {1,2,3,4,1,4,2,2,1,2};
        int[] vetorb = new int[vetorA.length];
        for(int i = 0; i< vetorA.length;i++){
            vetorb[i] = vetorA[vetorA.length - 1 - i];
        }
        System.out.println("vetor A: " + Arrays.toString(vetorA));
        System.out.println("vetor B: " + Arrays.toString(vetorb));
    }
}
