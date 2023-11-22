import java.util.Scanner;

public class juros {
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
        System.out.println("prazo em meses: ");
        tPrazo = ler.nextInt();
        System.out.println("Digite o valor do aporte mensal: ");
        aAporte = ler.nextDouble();

        if(mOn == "M"){
            nPeriodos = 12;
        }else {
            nPeriodos = 1;
        }
        rTaxaJuros = rTaxaJuros / nPeriodos;
        nPeriodos = nPeriodos*tPrazo;
        montanteFinal = pCapitalInicial;

        for(int i = 1;i <=nPeriodos;i++){
            montanteFinal = montanteFinal * (1 + rTaxaJuros) + aAporte;
        }
        System.out.println("\n==================== Resultado ===================");
        System.out.printf("Capital inicial: R$ %.2f\n", pCapitalInicial);
        System.out.printf("Taxa de juros anual: %.2f%%\n", rTaxaJuros * 100);
        System.out.printf("Número de períodos de capitalização por ano (n): %d\n", nPeriodos);
        System.out.printf("Prazo de aplicação em anos (t): %d\n", tPrazo);
        System.out.printf("Valor do aporte mensal: R$ %.2f\n", aAporte);
        System.out.printf("Montante final da aplicação: R$ %.2f\n", montanteFinal);
    }
}
