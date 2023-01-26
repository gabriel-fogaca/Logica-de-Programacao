package application;

import entities.Bank;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Bank bank;

        System.out.print("Enter account number: ");
        int num = sc.nextInt();

        System.out.print("Enter account holder: ");
        String x = sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char resp = sc.nextLine().charAt(0);

        double deposit = 0;

        if(resp == 'y'){
            System.out.print("Enter initial deposit value: ");
            deposit = sc.nextDouble();
            bank = new Bank(name, num, deposit);
        }
        else{
            bank = new Bank(name, num);
        }


        System.out.println("Account data: ");
        System.out.println(bank);

        System.out.print("Enter a deposit value: ");
        deposit = sc.nextDouble();
        bank.depositValue(deposit);

        System.out.println("Updated account data:");
        System.out.println(bank);

        System.out.print("Enter a withdraw value: ");
        deposit = sc.nextDouble();
        bank.withdrawValue(deposit);

        System.out.println("Updated account data:");
        System.out.println(bank);

        sc.close();
    }
}
