import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome");
        var nomeCliente = sc.next();
        
        System.out.println("Digite o número da conta: ");
        var numero = (sc.nextInt());

        System.out.println("Digite a agência ");
        var agencia = sc.next();

        System.out.println("Quanto saldo deseja colocar na conta? ");
        var saldo = sc.nextDouble();        
        sc.close();
        
        var conta = new Conta(nomeCliente, numero, agencia, saldo);
        
        System.out.println(conta.toString());
    }
}