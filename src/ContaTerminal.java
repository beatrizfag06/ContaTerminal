import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Seja bem-vindo à sua conta bancária");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, informe o seu nome!");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, informe o seu saldo!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nomeCliente +", obrigao por criar uma conta em nosso banco, sua Agência é: "+ agencia +", conta "+numero+" e seu saldo R$"+saldo+" já está disponível para saque.");
    }
}
