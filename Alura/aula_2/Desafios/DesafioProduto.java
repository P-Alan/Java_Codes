package Alura.aula_2.Desafios;

public class DesafioProduto {
    public static void main (String[] args) {
        double precoProduto = 13.99;
        int quantidade = 300;
        double valorTotal = precoProduto * quantidade;

        System.out.println(String.format("Valor total : %.2f", valorTotal));
    }
}
