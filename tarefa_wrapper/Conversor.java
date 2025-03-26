import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número: ");
        numero = scanner.nextInt();

        System.out.println("Número digitado: " + numero);

        // Convertendo para o tipo Wrapper
        Integer numeroWrapper = Integer.valueOf(numero);
        System.out.println("Número convertido: " + numeroWrapper);
    }
}
