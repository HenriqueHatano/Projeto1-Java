import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
        System.out.println("Qual o seu nome completo?: ");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Por favor digite o número de sua agência (3 digitos): ");
        int agencia = scanner.nextInt();

        System.out.println("Digite o número de sua conta (5 digitos): ");
        int conta = scanner.nextInt();

        double saldo = 1534.50;

        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco. Sua agência é: " + agencia + ", conta: " + conta + " e seu saldo: " + saldo + " já está disponível para saque.");

    }


    }

