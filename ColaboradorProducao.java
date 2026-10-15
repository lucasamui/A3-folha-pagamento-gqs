
public class ColaboradorProducao extends Colaborador {

    private double quantidadeProduzida;
    private double valorPorUnidade;

    public ColaboradorProducao(
            String matricula,
            String nome,
            double salarioBase,
            double quantidadeProduzida,
            double valorPorUnidade) {

        super(matricula, nome, salarioBase);

        if (quantidadeProduzida < 0) {
            throw new IllegalArgumentException(
                    "Quantidade produzida nao pode ser negativa.");
        }

        if (valorPorUnidade < 0) {
            throw new IllegalArgumentException(
                    "Valor por unidade nao pode ser negativo.");
        }

        this.quantidadeProduzida = quantidadeProduzida;
        this.valorPorUnidade = valorPorUnidade;
    }

    @Override
    public double calcularSalario() {

        double produtividade
                = quantidadeProduzida * valorPorUnidade;

        return getSalarioBase() + produtividade;
    }

    public double getQuantidadeProduzida() {
        return quantidadeProduzida;
    }

    public void setQuantidadeProduzida(
            double quantidadeProduzida) {

        if (quantidadeProduzida < 0) {
            throw new IllegalArgumentException(
                    "Quantidade produzida nao pode ser negativa.");
        }

        this.quantidadeProduzida = quantidadeProduzida;
    }

    public double getValorPorUnidade() {
        return valorPorUnidade;
    }

    public void setValorPorUnidade(
            double valorPorUnidade) {

        if (valorPorUnidade < 0) {
            throw new IllegalArgumentException(
                    "Valor por unidade nao pode ser negativo.");
        }

        this.valorPorUnidade = valorPorUnidade;
    }

    @Override
    public String getTipo() {
        return "Producao";
    }
}
