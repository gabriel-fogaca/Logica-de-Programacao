package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student stud = new Student();

        stud.Name = sc.nextLine();
        stud.Grade1 = sc.nextDouble();
        stud.Grade2 = sc.nextDouble();
        stud.Grade3 = sc.nextDouble();

        if( stud.finalGrade() > 60.00){
            System.out.println(stud);
            System.out.println("PASS");
        }
        else{
            System.out.println(stud);
            System.out.println("FAILED");
            System.out.println("FALTARAM " + stud.missGrade() + " PONTOS");
        }
        sc.close();
    }
}
