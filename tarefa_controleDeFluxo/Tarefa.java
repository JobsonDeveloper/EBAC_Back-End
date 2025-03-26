
import java.util.Scanner;

public class Tarefa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double somaNotas = 0.0;
        Integer media = 7;
        Double notaFinal;

        for (int i = 1; i <= 4; i++) {
            System.out.println("Digite a nota da " + i + "ª prova: ");
            somaNotas += scan.nextDouble();
        }

        notaFinal = somaNotas / 4;

        if (notaFinal >= 7) {
            System.out.println("Você foi aprovado com a média " + notaFinal);
        }
        else if(notaFinal >= 5) {
            System.out.println("Você ficou em recuperação com a média " + notaFinal);
        }
        else {
            System.out.println("Você foi reprovado com a nota " + notaFinal);
        }
    }
}
