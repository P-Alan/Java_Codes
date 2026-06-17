package Alura.aula_3;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++)
        {
            System.out.println("Diga sua nota para o Filme: ");
            nota = leitura.nextDouble();
            media += nota;
        }

        System.out.println("Média : " + media/3);

        leitura.close(); // Impede o vazamento de memória do 'leitura'
    }
}
