package application;

import entities.Lesson;
import entities.Video;
import entities.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Lesson> list = new ArrayList<>();
        System.out.print("Quantas aulas tem o curso? ");
        int n = sc.nextInt();
        for (int i=1; i <= n; i++){
            System.out.println();
            System.out.println("Dados da "+i+"a aula:");
            System.out.print("Conteúdo ou tarefa (c/t)? ");
            char ch = sc.next().charAt(0);
            if( ch == 'c'){
                System.out.print("Título: ");
                sc.next();
                String name = sc.nextLine();
                System.out.print("URL do vídeo: ");
                String url = sc.nextLine();
                System.out.print("Duração em segundos: ");
                int duraction = sc.nextInt();
                list.add(new Video(name, url, duraction));
            }
            else if (ch == 't' ) {
                System.out.print("Título: ");
                sc.next();
                String name = sc.nextLine();
                System.out.print("URL do vídeo: ");
                String description = sc.nextLine();
                System.out.print("Quantidade de questões: ");
                int question = sc.nextInt();
                list.add(new Task(name, description, question));
            }
        }
        int sum = 0;
        for (Lesson lesson: list) {
             sum += lesson.duration();
        }
        System.out.println();
        System.out.print("DURAÇÃO TOTAL DO CURSO = " + sum + " segundos");
        sc.close();
    }
}
