public abstract class Factory {
    public Carro create(String grade) {
        Carro carro = verificaCarro(grade);
        carro = preparaCarro(carro);
        return carro;
    }

    private Carro preparaCarro(Carro carro) {
        carro.ligarMotor();
        carro.buzinar();
        carro.encherTanque();
        return carro;
    }

    abstract Carro verificaCarro(String grade);
}
