
public class ColaboradorComissionado extends Colaborador {

    private double valorVendas;
    private double percentualComissao;

    public ColaboradorComissionado(
            String matricula,
            String nome,
            double salarioBase,
            double valorVendas,
            double percentualComissao) {
        super(matricula, nome, salarioBase);
        if (valorVendas < 0) {
            throw new IllegalArgumentException(
                    "Valor das vendas nao pode ser negativo.");
        }
        if (percentualComissao < 0) {
            throw new IllegalArgumentException(
                    "Percentual de comissao nao pode ser negativo.");
        }
        this.valorVendas = valorVendas;
        this.percentualComissao = percentualComissao;
    }

    @Override
    public double calcularSalario() {
        double comissao
                = valorVendas * (percentualComissao / 100);
        return getSalarioBase() + comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        if (valorVendas < 0) {
            throw new IllegalArgumentException(
                    "Valor das vendas nao pode ser negativo.");
        }
        this.valorVendas = valorVendas;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(
            double percentualComissao) {

        if (percentualComissao < 0) {
            throw new IllegalArgumentException(
                    "Percentual de comissao nao pode ser negativo.");
        }
        this.percentualComissao = percentualComissao;
    }

    @Override
    public String getTipo() {
        return "Comissionado";
    }
}
