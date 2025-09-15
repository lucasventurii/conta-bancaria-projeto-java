import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome = "José Ribeiro da Silva";
        String tipoConta = "Corrente";
        double valorConta = 1599.99;
        int opcao = 0;

        System.out.println("*************************************");
        System.out.println("Dados do cliente");
        System.out.println("Nome: "+ nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Valor: " + valorConta);
        System.out.println("*************************************");

            do {
            System.out.println("Digite sua opção");
            System.out.println("""
                    1- Consultar saldo
                    2- Receber valor
                    3- Transferir valor
                    0- Sair                    
                    """);
            System.out.println(" Digite a opção desejada: ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("O saldo da sua conta é de: " + valorConta);
                    break;
                case 2:
                    System.out.println("Digite o valor que quer adicionar a sua conta: ");
                    double receber = scanner.nextDouble();
                    valorConta += receber;
                    System.out.println("Valor da conta atualizado: " + valorConta);
                    break;
                case 3:
                    System.out.println("Digite o valor que quer retirar de sua conta: ");
                    double retirar = scanner.nextDouble();
                    if (retirar > valorConta){
                        System.out.println("Valor indisponível em conta");
                    } else {
                    valorConta -= retirar;
                    System.out.println("Valor da conta atualizado: " + valorConta);}
                    break;
                case 0:
                    System.out.println("Até breve");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            opcao = escolha;

        } while (opcao != 0);
        scanner.close();
    }
}
