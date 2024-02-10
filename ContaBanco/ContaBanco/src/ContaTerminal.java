import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //To do: Conhecer e importar a classe scanner, exibir as mensagens para o nosso usuário 
        //obter pela classe scanner os valores digitados no terminal e exibir a mensagem da conta criada. 
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
                            
        System.out.println("Por favor, digite o numero de sua agencia:");
        String Agencia = scanner.nextLine();

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        String mensagem = "Olá " +nomeCliente+ " ,obrigado por criar uma conta em nosso banco. Sua agência é: " +Agencia+ " conta " +numero+ " e seu saldo " +saldo+ " \njá está disponível para saque.";


        System.out.println(mensagem);
    }
}
