public class Customer {
    private String grade;
    private Boolean contrato;

    public Customer(String grade, boolean contrato) {
        this.grade = grade;
        this.contrato = contrato;
    }

    public boolean possuiContrato() {
        return contrato;
    }

    public String mostrarGrade() {
        return grade;
    }
}
