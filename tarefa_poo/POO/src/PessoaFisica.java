public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, Character sexo, Integer idade, String cpf) {
        this.cpf = cpf;
        this.setNome(nome);
        this.setSexo(sexo);
        this.setIdade(idade);
    }

    @Override
    public String toString() {
        return "\ncpf: " + cpf + "\n" + super.toString();
    }
}