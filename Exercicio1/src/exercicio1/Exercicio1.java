package exercicio1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Entrada de dados
        System.out.println("===== CÁLCULO DE IMC =====");

        System.out.print("Digite o nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite a idade: ");
        int idade = entrada.nextInt();

        System.out.print("Digite a altura (ex: 1.75): ");
        double altura = entrada.nextDouble();

        System.out.print("Digite o peso: ");
        double peso = entrada.nextDouble();

        // Criando objeto
        Pessoa pessoa = new Pessoa(nome, sobrenome, idade, altura, peso);

        // Calculando IMC
        pessoa.calculaIMC();

        // Saída
        System.out.println("\n===== RESULTADO =====");

        System.out.println("Nome completo: "
                + pessoa.getNome() + " "
                + pessoa.getSobrenome());

        System.out.println("Idade: " + pessoa.getIdade());

        System.out.printf("IMC: %.2f\n", pessoa.getImc());

        System.out.println("Classificação: "
                + pessoa.informaObesidade());

        entrada.close();
    }
}