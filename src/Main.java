import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double salario, servico, capital, gastoMed, gastoEdu, impostoTot, maxDed,gastoDed;
        double impostoSal = 0.00;

        System.out.print("Renda anual com salário: ");
        salario = sc.nextDouble();

        System.out.print("Renda anual com prestação de serviço: ");
        servico = sc.nextDouble();

        System.out.print("Renda anual com ganho de capital: ");
        capital = sc.nextDouble();

        System.out.print("Gastos médicos: ");
        gastoMed = sc.nextDouble();

        System.out.print("Gastos educacionais: ");
        gastoEdu = sc.nextDouble();

        if((salario/12) < 3000){
            impostoSal = 0.00;
        }
        else if ((salario/12) > 3000 && (salario/12) < 5000) {
            impostoSal = salario * 0.1;
        }
        else {
            impostoSal = salario * 0.2;
        }

        servico = servico * 0.15;
        capital = capital * 0.20;
        impostoTot = capital + impostoSal + servico;

        maxDed = (impostoTot) * 0.3;
        gastoDed = (gastoMed + gastoEdu);

        double abatimento = (gastoDed < maxDed) ?  gastoDed : maxDed;

        System.out.println();
        System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
        System.out.println();
        System.out.println("CONSOLIDADO DE RENDA: ");
        System.out.printf("Imposto sobre salário: %.2f %n", impostoSal);
        System.out.printf("Imposto sobre serviços: %.2f %n", servico);
        System.out.printf("Imposto sobre de capital: %.2f %n", capital);

        System.out.println();

        System.out.println("DEDUÇÕES: ");
        System.out.printf("Máximo dedutível: %.2f %n", maxDed);
        System.out.printf("Gastos dedutível: %.2f %n", gastoDed);

        System.out.println();

        System.out.println("RESUMO:");
        System.out.printf("Imposoto bruto total: %.2f %n", impostoTot);
        System.out.printf("Abatimento: %.2f %n", abatimento);
        System.out.printf("Imposto devido: %.2f %n", (impostoTot - abatimento));


        sc.close();
    }
}