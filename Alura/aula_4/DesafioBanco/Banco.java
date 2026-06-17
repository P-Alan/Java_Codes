package Alura.aula_4.DesafioBanco;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        double saldo = 3000.00;
        String nome = "João Gabriel Avelar de Paiva";
        int operacao;
        Scanner leitor = new Scanner(System.in);
        double transferencia;

        int rodando = 1;

        while (rodando == 1)
        {
            String layout = """
                        ========================================
                        Dados da conta :

                        Nome : %s
                        Tipo : Corrente
                        Saldo disponível : %.2f
                        ========================================

                        Operações :

                        [1] Transferência pix
                        [2] Receber valor
                        [3] Sair

                        ****************************************
                """.formatted(nome, saldo);

            System.out.println(layout);
            operacao = leitor.nextInt();
            switch (operacao)
            {
                case 1 :
                    System.out.println("\nQuanto você quer transferir?");
                    transferencia = leitor.nextDouble();

                    if (transferencia > saldo)
                    {
                        System.out.println("\nSaldo insuficiênte !!\n");
                    }
                    if (transferencia <= 0)
                    {
                        System.out.println("\n !!! ERRO !!! \n");
                    }
                    else 
                    {
                        System.out.println("\nTransferência realizada com sucesso !!\n");
                        saldo = saldo - transferencia;
                    }
                    

                    break;
                case 2 :
                    System.out.println("\nQuanto você quer Receber?");
                    transferencia = leitor.nextDouble();
                    saldo = saldo + transferencia;
                    break;
                case 3 :
                    System.out.println("\n*=*=*=*=*=*=*=\nEncerrando sistema...\n*=*=*=*=*=*=*=\n");
                    rodando = 0;
                    break;
                default :
                    System.out.println("\nOpção inválida !!\n");
                    break;
            }
        }

        leitor.close();
    }
}
