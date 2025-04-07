public abstract class Carro {
    private Integer potencia;
    private String fonteDeCombustivel;
    private String cor;

    public Carro(Integer potencia, String fonteDeCombustivel, String cor) {
        this.potencia = potencia;
        this.fonteDeCombustivel = fonteDeCombustivel;
        this.cor = cor;
    }

    public void ligarMotor() {
        System.out.println("Carro da " + getClass().getSimpleName() + " Adquirido.");
        System.out.println("Ligando..");
        System.out.println("Vrum...");
    }

    public void buzinar() {
        System.out.println("Pi!!!");
    }

    public void verificarMotor() {
        System.out.println("Está tudo certo com o motor.");
    }

    public void encherTanque() {
        System.out.println("O tanque foi abastecido.");
    }
}
