public class ContratosFactory extends Factory {
    @Override
    Carro verificaCarro(String grade) {
        if("A".equals(grade)) {
            return new Volkswagem(200, "full", "Preto");
        }
        else {
            return null;
        }
    }
}
