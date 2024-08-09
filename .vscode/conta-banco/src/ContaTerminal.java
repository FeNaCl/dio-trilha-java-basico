import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);

        Double saldo = 1300.20;

        System.out.println("Insira seu Nome: ");
        String nomeCliente = leitura.nextLine();

        System.out.println("Insira a Agência: ");
        String agencia = leitura.nextLine();

        System.out.println("Insira o Número da Agência: ");
        Integer numeroAgencia = leitura.nextInt();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é "
                + agencia
                + ", conta " + numeroAgencia + " e seu saldo de R$" + saldo + " já está disponível para saque.");

        leitura.close();

    }
}
