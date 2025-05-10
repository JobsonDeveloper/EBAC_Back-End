public class Pessoa {
    String nome;
    String sexo;

    public void construtor(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
