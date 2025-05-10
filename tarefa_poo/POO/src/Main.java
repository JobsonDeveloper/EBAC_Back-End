//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Pessoa Física
        PessoaFisica pessoaFisica = new PessoaFisica("Jobson", 'M', 24, "4515445780");
        System.out.println(pessoaFisica);

        // Pessoa Jurídica
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Carolina", 'F', 46, "748457848454874");
        System.out.println(pessoaJuridica);
    }
}