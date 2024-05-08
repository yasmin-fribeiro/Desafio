import java.util.Locale;
import java.util.Scanner;

public class AboutMeScanner {
    public static void main(String[] args) {
        try (//criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite seu nome");
            String nome = scanner.next();
            
            System.out.println("Digite sua conta");
            int conta = scanner.nextInt();
            
            System.out.println("Digite sua agência");
            String agencia = scanner.next();

            System.out.println("Digite seu saldo");
            Double saldo = scanner.nextDouble();

            
            //imprimindo os dados obtidos pelo usuario
            System.out.println("Olá " +  nome + "," + " obrigado por criar uma conta em nosso banco, sua agência é " +  agencia + ", sua conta é " + conta +" e seu saldo de "+ saldo +" já está disponível para saque.");
        }
        
        
    }
}
