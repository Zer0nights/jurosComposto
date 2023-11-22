import java.util.Scanner;
public class prova {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double pCapitalInicial = 0;
        double rTaxaJuros = 0;
        int nPeriodos = 0;
        int tPrazo = 0;
        double aAporte = 0;
        double montanteFinal = 0;

        System.out.println("Informe a taxa de juros: ");
        rTaxaJuros = ler.nextDouble();
        rTaxaJuros = rTaxaJuros / 100;

        System.out.println("A taxa de juros é mensal ou anual? M/A");
        String mOn = ler.next().toUpperCase();

        System.out.println("Informe o capital inicial: ");
        pCapitalInicial = ler.nextDouble();

        System.out.println("Prazo em meses: ");
        tPrazo = ler.nextInt();

        System.out.println("Digite o valor do aporte mensal: ");
        aAporte = ler.nextDouble();

        if (mOn.equals("M")) {
            nPeriodos = 12;
        } else {
            nPeriodos = 1;
        }

        rTaxaJuros = rTaxaJuros / nPeriodos;

        System.out.println("\n==================== Resultado ===================");
        System.out.printf("Capital inicial: R$ %.2f\n", pCapitalInicial);
        System.out.printf("Taxa de juros: %.2f%% ao mês\n", rTaxaJuros * 100);
        System.out.printf("Prazo de aplicação: %d meses\n", tPrazo);
        System.out.printf("Aporte mensal: R$ %.2f\n", aAporte);

        for (int i = 1; i <= 10; i++) {
            montanteFinal = montanteFinal * (1 + rTaxaJuros) + aAporte;
            System.out.printf("O montante final da aplicação no ano %d é de: R$ %.2f\n", i, montanteFinal);
        }

        System.out.println("\n==================== Fim da Operação ===================");
    }}