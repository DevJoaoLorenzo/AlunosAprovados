package application;

import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Digite o número de alunos: ");
        n = sc.nextInt();
        Aluno[] vet = new Aluno[n];
        for(int i=0;i<vet.length;i++){
            sc.nextLine();
            System.out.printf("Digite o nome do %do aluno: ", i+1);
            String nome = sc.nextLine();
            System.out.printf("Digite as três notas do %do aluno: ", i+1);
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            double nota3 = sc.nextDouble();
            vet[i] = new Aluno(nome,nota1,nota2,nota3);
        }
        System.out.println("Alunos aprovados: ");

        for (Aluno aluno : vet) {
            if (aluno.media() > 7.0) {
                System.out.println(aluno.getNome());
            }
        }

        sc.close();
    }
}
