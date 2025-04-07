public class Main {
    public static void main(String[] args) {
        Customer cliente1 = new Customer("A", false);
        Factory fabrica = selecionaFabrica(cliente1);
        Carro carro = fabrica.create(cliente1.mostrarGrade());
    }

    private static Factory selecionaFabrica(Customer cliente1) {
        if(cliente1.possuiContrato()) {
            return new ContratosFactory();
        }
        else {
            return  new SemContratosFactory();
        }
    }
}
