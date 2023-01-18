package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle retangulo = new Rectangle();

        System.out.println("Entre com a largura e altura do retângulo: ");
        retangulo.height = sc.nextDouble();
        retangulo.width = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", retangulo.Area());
        System.out.printf("PERIMETRO = %.2f%n", retangulo.Perimeter());
        System.out.printf("DIAGONAL = %.2f%n", retangulo.Diagonal());
        sc.close();
    }
}
