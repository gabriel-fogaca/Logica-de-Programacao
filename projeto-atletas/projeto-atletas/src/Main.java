import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int atletas;
        String nome, nomeAlto = "";
        char sexo;
        double  altura, peso, pesoMedio = 0, alto = 0, masculino = 0, feminino = 0, alturaMedia = 0;

        System.out.print("Qual a quantidade de atletas? ");
        atletas = sc.nextInt();
        for(int i = 1; atletas >= i; i++){
            System.out.printf("Digite os dados do atleta numero %d: %n", i);
            System.out.print("Nome: ");
            sc.nextLine();
            nome = sc.nextLine();
            System.out.print("Sexo: ");
            sexo = sc.next().charAt(0);

            while (sexo != 'M' && sexo != 'F'){
                System.out.print("Valor invalido! Favor digitar F ou M: ");
                sexo = sc.next().charAt(0);
            }

            if(sexo == 'M'){
                masculino += 1;
            } else{
                feminino += 1;
            }

            System.out.print("Altura: ");
            altura = sc.nextDouble();

            while (altura < 1){
                System.out.print("Valor invalido! Favor digitar um valor positivo: ");
                altura = sc.nextDouble();
            }

            if(sexo == 'F'){
                alturaMedia += altura;
            }

            if (altura > alto){
                alto = altura;
                nomeAlto = nome;
            }

            System.out.print("Peso: ");
            peso = sc.nextDouble();

            while (peso < 1){
                System.out.print("Valor invalido! Favor digitar um valor positivo: ");
                peso = sc.nextDouble();
            }
            pesoMedio += peso;
        }
        pesoMedio = pesoMedio/atletas;
        double porcentagem = (100 * masculino)/ atletas;
        alturaMedia = alturaMedia / feminino;
        System.out.printf("%nRELATÓRIO: %n");
        System.out.printf("Peso médio dos atletas: %.2f%n", pesoMedio);
        System.out.printf("Atleta mais alto: %s %n", nomeAlto);
        System.out.printf("Porcentagem de homens: %.1f %%%n", porcentagem);
        if(feminino > 0){
            System.out.printf("Altura média das mulheres: %.2f", alturaMedia);
        }else {
            System.out.println("Não há mulheres cadastradas");
        }

        sc.close();
    }
}