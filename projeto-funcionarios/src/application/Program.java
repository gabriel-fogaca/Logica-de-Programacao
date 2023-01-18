package application;

import entities.Employee;

import javax.sound.midi.SysexMessage;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Nome: ");
        employee.Name = sc.nextLine();

        System.out.print("Salário Bruto: ");
        employee.GrossSalary = sc.nextDouble();

        System.out.print("Imposto: ");
        employee.Tax = sc.nextDouble();

        System.out.println("Funcionário: " + employee);

        System.out.print("Qual a porcentagem para aumentar o salário? ");
        double percentage = sc.nextDouble();
        employee.IncreaseSalary(percentage);

        System.out.println("Dados atualizados: " + employee);

        sc.close();
    }
}
