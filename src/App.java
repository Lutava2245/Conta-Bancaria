import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String nome_cliente;
        String agencia;
        int numero;
        double saldo = 0;

        System.out.print("Nome: ");
        nome_cliente = scan.nextLine();

        System.out.print("Agência: ");
        agencia = scan.nextLine();

        System.out.print("Número da Conta: ");
        numero = scan.nextInt();

        System.out.print("Saldo: ");
        saldo = scan.nextDouble();

        System.out.printf("Cliente %s criado, com a Conta %d da agência %s, com o saldo de R$ %.2f", nome_cliente, numero, agencia, saldo);
        scan.close();
    }
}
