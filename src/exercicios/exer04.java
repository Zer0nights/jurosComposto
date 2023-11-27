package exercicios;

public class exer04 {
    public static void main(String[] args) {
        int[] vetorA ={1,2,4,5,7,9,8,6,54};
        int[] vetorB = new int[vetorA.length];
        int num = 0;

        for(int i = 0;i< vetorA.length;i++){
            if(vetorA[i] % 2 == 0){
                vetorB[i] = 1;
            }else{
                vetorB[i] = 0;
            }
        }

        for(int i = 0;i< vetorA.length;i++){
            int elemento = vetorB[i];
            System.out.println(" " + elemento);
        }



    }
}
