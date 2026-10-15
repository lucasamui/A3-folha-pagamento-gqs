
public class Main {

    public static void main(String[] args) {

        // Criando colaboradores de diferentes tipos
        ColaboradorPadrao col1 = new ColaboradorPadrao("001", "Joao Silva", 3000);

        ColaboradorComissionado col2 = new ColaboradorComissionado(
                "002", "Maria Santos", 2500, 10000, 5
        );

        ColaboradorProducao col3 = new ColaboradorProducao(
                "003", "Pedro Costa", 2000, 150, 50
        );

        // Exibindo os salários
        System.out.println("===== SISTEMA DE GESTAO DE SALARIOS =====\n");
        System.out.println(col1);
        System.out.println(col2);
        System.out.println(col3);

        // Testando alteração de valores
        System.out.println("\n===== APOS ALTERACOES =====\n");
        col2.setValorVendas(15000);
        col3.setQuantidadeProduzida(200);

        System.out.println(col2);
        System.out.println(col3);
    }
}
