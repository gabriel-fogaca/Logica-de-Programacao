import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int atletas;
        String nome;
        char sexo;
        double altura, peso;
        System.out.print("Qual a quantidade de atletas? ");
        atletas = sc.nextInt();
        for(int i = 1; atletas >= i; i++){
            System.out.printf("Digite os dados do atleta numero %d: %n", i);
            System.out.print("Nome: ");
            nome = sc.next();

            System.out.print("Sexo: ");
            sexo = sc.next().charAt(0);
            if(sexo == 'F' && sexo == 'M'){
                System.out.println("Valor invalido! Favor digitar F ou M:");
            }
            System.out.print("Altura: ");
            altura = sc.nextDouble();

            System.out.print("Peso: ");
            peso = sc.nextDouble();
        }
        sc.close();
    }
}