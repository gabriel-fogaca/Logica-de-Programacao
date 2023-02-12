package application;

import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Quantos contribuintes você vai digitar? ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            System.out.println();
            System.out.println("Digite os dados do " + (i + 1) + "o contribuinte:");
            System.out.print("Renda anual com salário: ");
            double salary = sc.nextDouble();
            System.out.print("Renda anual com prestação de serviço: ");
            double service = sc.nextDouble();
            System.out.print("Renda anual com ganho de capital: ");
            double capital = sc.nextDouble();
            System.out.print("Gastos médicos: ");
            double health = sc.nextDouble();
            System.out.print("Gastos educacionais: ");
            double education = sc.nextDouble();

            TaxPayer tax = new TaxPayer(salary, service, capital, health, education);
            list.add(tax);
        }

        for (TaxPayer obj : list) {
            System.out.println();
            System.out.println("Resumo do " + (list.indexOf(obj) + 1) + "o contribuinte:");
            System.out.printf("Imposto Bruto Total: %.2f%n", obj.grossTax() );
            System.out.printf("Abatimento: %.2f%n", obj.taxRebate() );
            System.out.printf("Imposto devido: %.2f%n", obj.netTax() );
        }

    }
}
