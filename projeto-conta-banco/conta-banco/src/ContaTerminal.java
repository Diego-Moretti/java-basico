
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args){
        //TODO: Conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        System.out.println("Digite a agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();
        
        //Exibir as mensagens
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
        scanner.close();
    }
}   
