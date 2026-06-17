package Alura.aula_3;

import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine(); 
        // nextLine lê até o "Enter"
        // next lê até o " "
        // nextInt so lê inteiros
        // !!! o nextInt não lê o "Enter", que fica esperando o próximo comando, então se tivee um nextLine logo apos o nextInt ele vai ler somente o "Enter". Basta criar um nextLine 'sacrifício' para limpar a memória
        System.out.println("Qual o ano de lançamento");
        int lancamento = leitura.nextInt();
        System.out.println("Qual nota você dá para o filme?");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme + "\n" + lancamento + "\n" + avaliacao);
        leitura.close();
    }
}
