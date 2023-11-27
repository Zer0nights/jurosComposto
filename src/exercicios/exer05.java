package exercicios;

public class exer05 {
    public static void main(String[] args) {
        int[] vetorA ={1,2,4,5,7,9,8,6,54,34};
        int[] vetorB ={2,5,4,2,12,34,5,4,3,10};
        int[] vetorC = new int[vetorA.length];
        int num = 0;

        for(int i = 0;i< vetorA.length;i++){
            if(vetorA[i]>vetorB[i]) {
                vetorC[i] = 1;
            } else if (vetorA[i]<vetorB[i]) {
                vetorC[i]= 0;
            } else if (vetorA[i]<vetorB[i]) {
                vetorC[i] = -1;
            }
        }

        for(int i = 0;i< vetorA.length;i++){
            int elemento = vetorC[i];
            System.out.println(" " + elemento);
        }



    }
}

