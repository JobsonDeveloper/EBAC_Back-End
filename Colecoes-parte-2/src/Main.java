import java.io.IOException;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> feminino = new ArrayList<Pessoa>();
        List<Pessoa> masculino = new ArrayList<Pessoa>();
        Boolean sair = false;

        while (sair == false) {
            String resposta = "";

            System.out.println("Digite 'Sair' para encerrar \nou digite o nome de uma pessoa: ");
            resposta = scanner.nextLine();

            if(resposta.compareToIgnoreCase("sair") == 0) {
                sair = true;
                break;
            }
            else {
                System.out.println("É do sexo Masculino ou Feminino? ");
                String sexo = scanner.nextLine();
                Pessoa pessoa = new Pessoa();

                if(sexo.compareToIgnoreCase("feminino") == 0) {

                    pessoa.construtor(resposta.toUpperCase(), "FEMININO");
                    feminino.add(pessoa);
                }
                else if (sexo.compareToIgnoreCase("masculino") == 0) {
                    pessoa.construtor(resposta.toUpperCase(), "MASCULINO");
                    masculino.add(pessoa);
                }
                else {
                    System.out.println("Opção de sexo não disponível, tente novamente.");
                }
            }
        }

        if(masculino.size() > 0) {
            System.out.println("\nPessoas do sexo Masculino:");
            for(Pessoa item : masculino) {
                System.out.println(item.nome);
            }
        }
        if(feminino.size() > 0) {
            System.out.println("\nPessoas do sexo Feminino:");
            for(Pessoa item : feminino) {
                System.out.println(item.nome);
            }
        }
    }
}