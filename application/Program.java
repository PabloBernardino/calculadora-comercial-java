package application;
import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        int opcao;

        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);

        // Menu de opções
        do {
            System.out.println();
            System.out.println();

            System.out.println("Escolha uma opção: ");

            System.out.println();

            System.out.println("---------------------");

            System.out.println();

            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Desconto");
            System.out.println("6 - Juros");
            System.out.println("7 - IMC");
            System.out.println("8 - Média Escolar");
            System.out.println("0 - Sair");

            System.out.println(); // Pular linha para melhor visualização

            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();

            // Processar a opção escolhida
            switch (opcao) {
                case 1:

                    System.out.println("Digite os números para a soma: ");

                    System.out.println(); // Pular linha para melhor visualização

                    // Ler os números e realizar a soma
                    System.out.print("Digite o primeiro número: ");
                    int primeiroNumero = sc.nextInt();
                    System.out.print("Digite o segundo número: ");
                    int segundoNumero = sc.nextInt();

                    int soma = primeiroNumero + segundoNumero;

                    System.out.println(); // Pular linha para melhor visualização

                    // Exibir o resultado
                    System.out.print("Resultado: " + soma);

                    break;
                case 2:

                    System.out.println("Digite os números para a subtração: ");

                    System.out.println(); // Pular linha para melhor visualização

                    // Ler os números e realizar a subtração
                    System.out.print("Digite o primeiro número: ");
                    int primeiroNumeroSubtracao = sc.nextInt();
                    System.out.print("Digite o segundo número: ");
                    int segundoNumeroSubtracao = sc.nextInt();

                    int subtracao = primeiroNumeroSubtracao - segundoNumeroSubtracao;

                    System.out.println(); // Pular linha para melhor visualização

                    // Exibir o resultado
                    System.out.print("Resultado: " + subtracao);

                    break;
                case 3:

                    System.out.println("Digite os números para a multiplicação: ");

                    System.out.println(); // Pular linha para melhor visualização

                    // Ler os números e realizar a multiplicação
                    System.out.print("Digite o primeiro número: ");
                    int primeiroNumeroMultiplicacao = sc.nextInt();
                    System.out.print("Digite o segundo número: ");
                    int segundoNumeroMultiplicacao = sc.nextInt();

                    int multiplicacao = primeiroNumeroMultiplicacao * segundoNumeroMultiplicacao;

                    System.out.println(); // Pular linha para melhor visualização

                    // Exibir o resultado
                    System.out.print("Resultado: " + multiplicacao);

                    break;
                case 4:

                    System.out.println("Digite os números para a divisão: ");

                    System.out.println();

                    // Ler os números e realizar a divisão
                    System.out.print("Digite o dividendo: ");
                    int dividendo = sc.nextInt();

                    System.out.print("Digite o divisor: ");
                    int divisor = sc.nextInt();

                    if (divisor == 0) {

                        System.out.println("Não é possível dividir por zero.");

                    } else {

                        double divisao = (double) dividendo / divisor;

                        System.out.println(); // Pular linha para melhor visualização

                        // Exibir o resultado
                        System.out.println("Resultado: " + divisao);
                    }

                    break;
                case 5:
                    System.out.print("Digite os números para o desconto: ");

                    System.out.println(); // Pular linha para melhor visualização

                    // Ler o valor original e a porcentagem de desconto
                    System.out.print("Digite o valor original: ");
                    double valorOriginal = sc.nextDouble();

                    System.out.print("Digite a porcentagem de desconto: ");
                    double porcentagemDesconto = sc.nextDouble();

                    // Calcular o valor do desconto
                    double desconto =  valorOriginal * (porcentagemDesconto / 100);

                    System.out.println(); // Pular linha para melhor visualização

                    // Exibir o resultado
                    System.out.printf("Valor do desconto: %.2f%n", desconto);

                    break;
                case 6:

                    System.out.println("Seria juros simples ou compostos? (Digite 'simples' ou 'compostos')");
                    String tipoJuros = sc.next();

                    System.out.println(); // Pular linha para melhor visualização

                    if (tipoJuros.equalsIgnoreCase("simples")) { // (equalsIgnoreCase) para comparar strings sem considerar maiúsculas ou minúsculas

                        System.out.println("Digite os números para o juros simples: ");

                        System.out.println(); // Pular linha para melhor visualização

                        // Ler o valor principal, a taxa de juros e o tempo
                        System.out.print("Digite o valor principal: ");
                        double valorPrincipal = sc.nextDouble();

                        System.out.print("Digite a taxa de juros (em %): ");
                        double taxaJuros = sc.nextDouble();

                        System.out.print("Digite o tempo (em anos): ");
                        int tempo = sc.nextInt();

                        // Calcular o valor do juros simples
                        double jurosSimples = valorPrincipal * (taxaJuros / 100) * tempo;

                        System.out.println(); // Pular linha para melhor visualização

                        // Exibir o resultado
                        System.out.printf("Valor do juros simples: %.2f%n", jurosSimples);

                    } else if (tipoJuros.equalsIgnoreCase("compostos")) { // (equalsIgnoreCase) para comparar strings sem considerar maiúsculas ou minúsculas

                        System.out.println("Digite os números para o juros compostos: ");

                        System.out.println();

                        // Ler o valor principal, a taxa de juros e o tempo
                        System.out.print("Digite o valor principal: ");
                        double valorPrincipal = sc.nextDouble();

                        System.out.print("Digite a taxa de juros (em %): ");
                        double taxaJuros = sc.nextDouble();

                        System.out.print("Digite o tempo (em anos): ");
                        int tempo = sc.nextInt();

                        // Calcular o valor do juros compostos
                        double jurosCompostos = valorPrincipal * Math.pow(1 + (taxaJuros / 100), tempo) - valorPrincipal;

                        System.out.println(); // Pular linha para melhor visualização

                        // Exibir o resultado
                        System.out.printf("Valor do juros compostos: %.2f%n", jurosCompostos);

                    } else {

                        System.out.println("Tipo de juros inválido. Tente novamente.");

                        //while (tipoJuros != "simples" && tipoJuros != "compostos") {

                        //System.out.println("Digite 'simples' ou 'compostos': ");

                        //tipoJuros = sc.next();
                        //}
                    }

                    break;
                case 7:

                    System.out.println("Digite os números para o IMC: ");

                    System.out.println();

                    // Ler o peso e a altura
                    System.out.print("Digite o peso (em kg): ");
                    double peso = sc.nextDouble();

                    System.out.print("Digite a altura (em metros): ");
                    double altura = sc.nextDouble();

                    // Calcular o IMC
                    double imc = peso / (altura * altura);

                    System.out.println(); // Pular linha para melhor visualização

                    // Exibir o resultado
                    System.out.printf("Seu IMC é: %.2f%n ", imc);

                    System.out.println(); // Pular linha para melhor visualização

                    if (imc < 17) {

                        System.out.println("Situação: Muito abaixo do peso");

                    } else if (imc >= 17 && imc <= 18.49) {

                        System.out.println("Situação: Abaixo do peso");

                    } else if (imc >= 18.50 && imc <= 24.99) {

                        System.out.println("Situação: Peso normal");

                    } else if (imc >= 25 && imc <= 29.99) {

                        System.out.println("Situação: Acima do peso");

                    } else if (imc >= 30 && imc <= 34.99) {

                        System.out.println("Situação: Obesidade I");

                    } else if (imc >= 35 && imc <= 39.99) {

                        System.out.println("Situação: Obesidade II (severa)");

                    } else if (imc >= 40) {

                        System.out.println("Situação: Obesidade III (mórbida)");
                    }

                    break;
                case 8:

                    System.out.println("Calcúlo da média escolar");

                    System.out.println();

                    // Ler a quantidade de disciplinas
                    System.out.print("Digite a quantidade de disciplinas: ");
                    int quantidadeDisciplinas = sc.nextInt();

                    System.out.println(); // Pular linha para melhor visualização

                    // Ler as notas das disciplinas
                    System.out.print("Digite as notas das disciplinas: ");

                    double somaNotas = 0;

                    for (int contador = 0; contador < quantidadeDisciplinas; contador++) {

                        somaNotas += sc.nextDouble();
                    }

                    // Calcular a média escolar
                    double media = somaNotas / quantidadeDisciplinas;

                    System.out.println(); // Pular linha para melhor visualização

                    // Exibir o resultado
                    System.out.print("Média escolar: " + media);

                    break;
                case 0:

                    System.out.println("Saindo...");

                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();

    }
}
