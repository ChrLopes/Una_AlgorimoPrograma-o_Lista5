package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcao = 1;

        while (opcao != 0) {

            System.out.println("\n===== CHAPÉU SELETOR =====");

            System.out.print("Digite o nome do aluno: ");
            String nome = entrada.nextLine();

            System.out.print("Digite a idade: ");
            int idade = entrada.nextInt();

            System.out.print("Coragem: ");
            double coragem = entrada.nextDouble();

            System.out.print("Inteligência: ");
            double inteligencia = entrada.nextDouble();

            System.out.print("Ambição: ");
            double ambicao = entrada.nextDouble();

            System.out.print("Lealdade: ");
            double lealdade = entrada.nextDouble();

            System.out.print("Estratégia: ");
            double estrategia = entrada.nextDouble();

            System.out.print("Criatividade: ");
            double criatividade = entrada.nextDouble();

            entrada.nextLine();

            Aluno aluno = new Aluno(
                    nome,
                    idade,
                    coragem,
                    inteligencia,
                    ambicao,
                    lealdade,
                    estrategia,
                    criatividade
            );

            aluno.calcularCasa();

            aluno.exibirInformacoes();

            System.out.println("\nDigite 1 para continuar");
            System.out.println("Digite 0 para sair");

            opcao = entrada.nextInt();
            entrada.nextLine();
        }

        System.out.println("Programa encerrado!");

        entrada.close();
    }
}
