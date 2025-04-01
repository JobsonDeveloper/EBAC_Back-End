package Interface;

public interface ICaneta {
    public void escrever(String texto);

    public String getCor();

    default void riscar() {
        System.out.println("Riscando...");
    }
}
