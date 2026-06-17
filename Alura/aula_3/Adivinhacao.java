package Alura.aula_3;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        int tentativas = 0;
        Scanner leitura = new Scanner(System.in);
        int numero = new Random().nextInt(100);
        int numeroDigitado = 0;

        while (tentativas < 5)
        {
            System.out.println(String.format("tentativa: %d", 1 + tentativas));
            System.out.println("Digite um número inteiro de 0 - 100 : ");
            numeroDigitado = leitura.nextInt();

            if (numeroDigitado == numero)
            {
                System.out.println("NÚMERO CORRETO, PARABÉNS !!");
                break;
            } else {
                if (numeroDigitado > numero) 
                {
                    System.out.println("Número digitado muito alto !!");
                } else {
                    System.out.println("Número digitado muito baixo !!");
                }
            }
            tentativas++;
        }

        if (tentativas == 5 && numeroDigitado != numero)
        {
            System.out.println("VOCÊ NÃO CONSEGUIU ACERTAR O NÚMERO");
            System.out.println(String.format("Número correto: %d", numero));
        }
        leitura.close();
    }
}