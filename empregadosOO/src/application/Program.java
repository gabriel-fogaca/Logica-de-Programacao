package application;

import entities.Address;
import entities.Department;
import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do departamento: ");
        String departmentName = sc.nextLine();

        System.out.print("Dia do pagamento: ");
        Integer payDay = sc.nextInt();

        System.out.print("Email: ");
        sc.nextLine();
        String email = sc.nextLine();

        System.out.print("Telefone: ");
        String phone = sc.nextLine();

        Address address = new Address(email, phone);
        Department dept = new Department(departmentName, payDay, address);


        System.out.print("Quantos funcionários tem o departamento? ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Dados do funcionário "+i+":");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salário: ");
            double salary = sc.nextDouble();

            Employee employee = new Employee(name, salary);
            dept.addEmployee(employee);
        }
        showReport(dept);
        sc.close();
    }
    private static void showReport(Department dept){
        System.out.println(dept.toString());
    }
}
