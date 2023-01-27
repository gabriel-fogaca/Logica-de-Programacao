package application;

import entities.Champion;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Champion x, y;

        System.out.println("Digite os dados do primeiro campeão: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Vida inicial: ");
        int life = sc.nextInt();

        System.out.print("Ataque: ");
        int attack = sc.nextInt();

        System.out.print("Armadura: ");
        int armor = sc.nextInt();

        x = new Champion(name, life, attack, armor);

        System.out.println("Digite os dados do segundo campeão:");
        String p = sc.nextLine();
        System.out.print("Nome: ");
        name = sc.nextLine();

        System.out.print("Vida inicial: ");
        life = sc.nextInt();

        System.out.print("Ataque: ");
        attack = sc.nextInt();

        System.out.print("Armadura: ");
        armor = sc.nextInt();

        y = new Champion(name, life, attack, armor);

        System.out.print("Quantos turnos você deseja executar? ");
        int round = sc.nextInt();

        System.out.println();

        for( int i = 1; i <= round; i++){

            if(y.getLife() > 0 && x.getLife() > 0){
                y.takeDamage(x);
                x.takeDamage(y);

                System.out.println("Resultado do turno " + i + ":");

                System.out.println(x.status());
                System.out.println(y.status());
                System.out.println();
            }
            else{
                i = round;
            }
        }
        System.out.println("FIM DO COMBATE");
        sc.close();
    }
}
