public class CarFactory extends Factory{
    @Override
    Carro verificaCarro(String grade) {
        switch (grade) {
            case "A":
                return new Volkswagem(200, "full", "Preto");
            case "B":
                return new Toyota(850, "full", "Vermelho");
            default:
                System.out.println("Este tipo de carro não foi encontrado.");
                return null;
        }
    }
}
