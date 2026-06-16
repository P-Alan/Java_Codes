package Alura.aula_2.Desafios;

public class DesafioDesconto {
    public static void main (String[] args) {
        double preco = 10.00;
        double desconto = 0.9;
        double novoPreco = preco * desconto;

        String mensagem = """
                \nPreço original: %.2f
                Desconto: 10%%
                Novo preço: %.2f
                """.formatted(preco, novoPreco);

        System.out.println(mensagem);
    }
} 
