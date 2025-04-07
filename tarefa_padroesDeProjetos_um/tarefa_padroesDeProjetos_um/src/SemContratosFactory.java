public class SemContratosFactory extends Factory {
    @Override
    Carro verificaCarro(String grade) {
        if("A".equals(grade)) {
            return new Toyota(200, "full", "Preto");
        }
        else {
            return null;
        }
    }
}
