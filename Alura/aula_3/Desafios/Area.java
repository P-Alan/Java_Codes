package Alura.aula_3.Desafios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        int escolha = 0;
        Scanner leitor = new Scanner(System.in);
        double base = 0;
        double altura = 0;

        System.out.println("Você quer calcular a área de um quadrado [1] ou de um triângulo [2]?");
        escolha = leitor.nextInt();

        if (escolha == 1)
        {
            System.out.println("Diga a altura : ");
            altura = leitor.nextDouble();
            System.out.println("Diga a base : ");
            base = leitor.nextDouble();
            System.out.println("Área = " + base*altura);
        }

        if (escolha == 2)
        {
            System.out.println("Diga a altura : ");
            altura = leitor.nextDouble();
            System.out.println("Diga a base : ");
            base = leitor.nextDouble();
            System.out.println("Área = " + (base*altura)/2);
        }

        leitor.close();
    }
}
