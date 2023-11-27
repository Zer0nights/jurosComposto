package exercios2;

public class exer01 {
    public static void main(String[] args) {
        int[] A = {5, 8, 7, 10, 6, 4, 7, 9, 11, 8};
        char[] B = new char[10];


        for (int i = 0; i < A.length; i++) {
            if (A[i] < 7) {
                B[i] = 'a';
            } else if (A[i] == 7) {
                B[i] = 'b';
            } else if (A[i] > 7 && A[i] < 10) {
                B[i] = 'c';
            } else if (A[i] == 10) {
                B[i] = 'd';
            } else {
                B[i] = 'e';
            }
        }


        System.out.print("Vetor B: ");
        for (char value : B) {
            System.out.print(value + " ");
        }
    }
}

