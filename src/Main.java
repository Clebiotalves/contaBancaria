import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Clébio Teodoro Alves";
        String tipoConta = "Conta corrente";
        int opcao = 0;
        double saldo = 1500.00;


        System.out.println("***************************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n****************************************");


        String menu = """
                \nEscolha uma opção:
                1 - Saldo da conta corrente
                2 - Depósito da conta corrente
                3 - Sacar dinheiro da conta corrente
                4 - Sair
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

           if (opcao == 1){
               System.out.println("\nSaldo atual é : " + saldo);
           }else if (opcao == 2){
               System.out.println("\nQual valor que deseja depositar? ");
               double valor = leitura.nextDouble();
               saldo = saldo + valor;
               System.out.println("\nSaldo agora: " + saldo);
           } else if (opcao == 3) {
               System.out.println("\nQual valor que deseja sacar? ");
               double valor = leitura.nextDouble();
               if (valor > saldo){
                   System.out.println("Não tem saldo suficiente para depositar");
               }
               double valor2 = leitura.nextDouble();
               saldo -= valor2;
               System.out.println("\nSaldo agora: " + saldo);
           }else if (opcao != 4) {
               System.out.println("\nOpção inválida!");
           }
        }
    }
}