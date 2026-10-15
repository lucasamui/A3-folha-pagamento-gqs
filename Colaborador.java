
public abstract class Colaborador {

    private final String matricula;
    private final String nome;
    private double salarioBase;

    public Colaborador(String matricula, String nome, double salarioBase) {

        if (matricula == null || matricula.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Matrícula é obrigatória.");
        }

        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Nome é obrigatório.");
        }

        if (salarioBase < 0) {
            throw new IllegalArgumentException(
                    "Salário base não pode ser negativo.");
        }

        this.matricula = matricula;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public abstract String getTipo();

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {

        if (salarioBase < 0) {
            throw new IllegalArgumentException(
                    "Salario base nao pode ser negativo.");
        }

        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {

        return "Matricula: " + matricula
                + " | Nome: " + nome
                + " | Tipo: " + getTipo()
                + " | Salario Base: R$ "
                + String.format("%.2f", salarioBase)
                + " | Salario Final: R$ "
                + String.format("%.2f", calcularSalario());
    }
}
