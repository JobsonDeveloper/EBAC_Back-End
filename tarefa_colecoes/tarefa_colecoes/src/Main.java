import java.awt.*;
import java.util.*;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        atividadeUm();
        atividadeDois();
    }

    static String verificaSexo(String texto) {
        if (texto.contains("f") || texto.contains("F")) {
            return "F";
        } else {
            return "M";
        }
    }

    public static void atividadeUm() {
        Scanner scan = new Scanner(System.in);
        Set<String> nomes = new TreeSet<>();

        System.out.println("Digite o nome das pessoas pessarados por vírgula.");
        String[] result = scan.nextLine().split(",");

        for (String pessoa : result) {
            String nome = pessoa.replace(" ", "").toUpperCase();
            nomes.add(nome);
        }

        System.out.println("\nLista de pessoas: ");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

    public static void atividadeDois() {
        Scanner scan = new Scanner(System.in);
        List<Pessoa> meninos = new ArrayList<Pessoa>();
        List<Pessoa> meninas = new ArrayList<Pessoa>();
        String lista;

        System.out.println("Informe o nome e o sexo das pessoas.\nExemplo: Jobson-M,Maria-F\n");
        lista = scan.nextLine();

        try {
            String[] resposta = {lista};

            if (lista.contains(",")) {
                resposta = lista.split(",");
            }

            for (String pessoa : resposta) {
                String[] dadosPessoa = pessoa.split("-");
                String nome = dadosPessoa[0].replace(" ", "").toUpperCase();
                String sexo = verificaSexo(dadosPessoa[1]);

                if (sexo == "F") {
                    meninas.add(new Pessoa(nome, sexo));
                } else {
                    meninos.add(new Pessoa(nome, sexo));
                }
            }
        } catch (Exception e) {
            System.out.println("Os dados foram fornecidos de forma incorreta! " +
                    "\nSiga o exemplo fornecido: Jobson-M,Maria-F");
        }


        if (meninos.size() > 0) {
            System.out.println("\n----Meninos");
            for (Pessoa item : meninos) {
                System.out.println(item.nome);
            }
        }

        if (meninas.size() > 0) {
            System.out.println("\n----Meninas");
            for (Pessoa item : meninas) {
                System.out.println(item.nome);
            }
        }
    }
}