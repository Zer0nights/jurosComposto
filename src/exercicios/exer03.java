package exercicios;

public class exer03 {
    public static void main(String[] args) {
        int[] vetorA = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};

        boolean ehPalindromo = true;

        for (int i = 0; i < vetorA.length / 2; i++) {
            if (vetorA[i] != vetorA[vetorA.length - 1 - i]) {
                ehPalindromo = false;
                break;
            }
        }

        if (ehPalindromo) {
            System.out.println("O vetor é um palíndromo.");
        } else {
            System.out.println("O vetor não é um palíndromo.");
        }
    }
}

