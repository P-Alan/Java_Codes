package Alura.aula_3;

public class SwitchCase {
    public static void main(String[] args) {
        String diaDaSemana;
        int dia = 1;

        switch (dia) {
            case 1:
                diaDaSemana = "sexta";
                break;
        
            default:
                diaDaSemana = "dia_comum";
                break;
        }
        
        switch (diaDaSemana) {
            case "sexta":
                System.out.println("SEXTOU !!");
                break;
            default:
                System.out.println("Nâo sextou D:");
                break;
        }
    }
}
