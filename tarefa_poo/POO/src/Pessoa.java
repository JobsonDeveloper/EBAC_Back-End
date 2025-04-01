public abstract class Pessoa {
    private String nome;
    private Character sexo;
    private Integer idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "nome=: " + nome + "\nsexo: " + sexo + "\nidade: " + idade;
    }
}
