package Alura.aula_3;

public class If {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;

        String plano = "plus+";

        if (anoDeLancamento >= 2022)
        {
            System.out.println("Lançamento !!");
        } else {
            System.out.println("Filme retrô !!");
        }

        if (incluidoNoPlano && plano.equals("plus+"))
        {
            System.out.println("Filme de graça !!");
        } else {
            System.out.println("Filme pago !!");
        }
    }
}
