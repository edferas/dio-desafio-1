import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Todo Do: Conhecer e importar a classe scanner

        // Todo Do: Exibir as mensagens para o usuário
        // Todo Do: Obter pela scanner os valores digitados no terminal

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da conta!");
        int numeroConta = sc.nextInt();

        System.out.println("Agora, digite a agência!");
        String agenciaConta = sc.next();

        System.out.println("Qual o seu nome completo?");
        String nomeCliente = sc.next();

        String splitNome[] = nomeCliente.split(" ");
        String primeiroNome = splitNome[0];
        
        sc.close();

        //Todo Do: Gerar aleatóriamente o saldo do cliente
        int min = 0;
        int max = 1000;

        int saldoAleatorio = (int)Math.floor(Math.random()*(max-min+1)+min);
        int saldoCliente = saldoAleatorio;

        // Todo Do: Exibir a mensagem conta criada
        
        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, o número da conta é %s e seu saldo %s já está disponível para saque.", primeiroNome, agenciaConta, numeroConta, saldoCliente));
    }
}
