import java.util.Scanner;

import models.ContaBancaria;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        System.err.print("Por favor, digite o número da Agência: ");
        conta.setNumero(sc.nextInt());

        System.err.print("Por favor, digite a Agência: ");
        conta.setAgencia(sc.next());

        sc.nextLine();

        System.err.print("Por favor, digite o seu Nome: ");
        conta.setNomeCliente(sc.nextLine());

        System.err.print("Por favor, digite o Saldo: ");
        conta.setSaldo(sc.nextDouble());

        System.err.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", conta.getNomeCliente(), conta.getAgencia(), conta.getNumero(), conta.getSaldo()));

        sc.close();
    }
}
