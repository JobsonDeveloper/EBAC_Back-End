/**
 * Classe 'Pessoa', criada para exercitar os conhecimentos sobre classes
 */
public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private char sexo;

    // Construtor para o instanciamento da classe
    public void contructor(String nome, int idade, double altura, double peso, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    public void andar() {
        System.out.println("Andando...");
    }

    public void comer(String texto) {
        System.out.println("Comendo...");
    }
}
