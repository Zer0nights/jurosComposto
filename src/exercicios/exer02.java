package exercicios;

import java.util.Scanner;

public class exer02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetorA = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        // Inicializar a variável de sinalização (flag) como true
        boolean todosPares = true;

        // Verificar se todos os elementos do vetor são pares
        for (int elemento : vetorA) {
            if (elemento % 2 != 0) {
                // Se encontrar um elemento ímpar, definir a flag como false e sair do loop
                todosPares = false;
                break;
            }
        }

        // Exibir o resultado
        if (todosPares) {
            System.out.println("Todos os elementos do vetor são pares.");
        } else {
            System.out.println("Pelo menos um elemento do vetor não é par.");
        }
    }
}
