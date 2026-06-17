package Alura.aula_3;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int i = 0;

        while(nota != -1)
        {
            System.out.println("Diga sua nota para o Filme ou '-1' para sair : ");
            nota = leitura.nextDouble();
            if (nota != -1)
            {
            media += nota;
            i++;
            }
        }

        System.out.println("Média : " + media/i);

        leitura.close(); // Impede o vazamento de memória do 'leitura'
    }
}
