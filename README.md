# Sistema de Folha de Pagamento

Trabalho Integrador da disciplina de Garantia da Qualidade de Software (A1 e A3).

O sistema cadastra os colaboradores de uma empresa e calcula automaticamente quanto cada um tem a receber. São três tipos de colaborador:

- Padrão: recebe só o salário base.
- Comissionado: salário base + valor das vendas × percentual ÷ 100.
- Produção: salário base + quantidade produzida × valor por unidade.

Depois do cálculo, o sistema gera a folha de pagamento com o valor de cada colaborador e um resumo com o total da folha.

## Equipe

- Lucas Veras Amui
- Peterson Luis Taborda Garcia

## Como executar

É preciso ter o Java 17 ou mais novo instalado. Dentro da pasta 05_Codigo_Fonte:

    javac *.java
    java Main

Por enquanto o código tem as classes dos colaboradores e um exemplo de cálculo. O sistema completo, com menu e banco de dados, vai ser entregue na A3.

## Onde está cada coisa

- 01_Requisitos: Documento de Visão, ERS e Matriz de Rastreabilidade
- 02_Analise: diagrama de casos de uso
- 03_Projeto: diagramas UML e Documento de Arquitetura
- 04_Testes: Plano de Testes e Casos de Teste
- 05_Codigo_Fonte: código em Java
- 06_Banco_Dados: scripts do banco (A3)
- 07_Executavel: versão executável (A3)
- 08_Manuais: Manual do Usuário e Manual Técnico (A3)
- 09_Homologacao: Termo de Homologação (A3)
- 10_Qualidade: Plano de Garantia da Qualidade, defeitos e métricas
- 11_Apresentacao: material da apresentação (A3)

O Planejamento do Projeto (EAP, cronograma e responsáveis) está na raiz do repositório.

## Entregas

- A1 (20/10/2026): planejamento, modelagem e qualidade
- A3 (01/12/2026): implementação, testes e homologação