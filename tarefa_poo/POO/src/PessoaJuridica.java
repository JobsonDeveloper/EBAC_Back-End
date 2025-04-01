public class PessoaJuridica extends Pessoa{
    private String cnpj;

    public PessoaJuridica(String nome, Character sexo, Integer idade, String cnpj) {
        this.cnpj = cnpj;
        this.setNome(nome);
        this.setSexo(sexo);
        this.setIdade(idade);
    }

    @Override
    public String toString() {
        return "\ncnpj: " + cnpj + "\n" + super.toString();
    }
}
