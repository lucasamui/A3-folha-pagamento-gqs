
public class ColaboradorPadrao extends Colaborador {

    public ColaboradorPadrao(
            String matricula,
            String nome,
            double salarioBase) {

        super(matricula, nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }

    @Override
    public String getTipo() {
        return "Padrao";
    }
}
