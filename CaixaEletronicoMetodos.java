Detalhesimport java.util.Scanner;

public class Caixa {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Caixa obj = new Caixa();
        float saldo = 0;
        int escolha;

        while (true) {
            obj.Menu();
            escolha = tcl.nextInt();

            switch (escolha) {
                case 1:
                    obj.Saldo(saldo);
                    break;
                case 2:
                    saldo = obj.Saque(saldo, saldo);
                    break;
                case 3:
                    saldo = obj.Deposito(saldo, saldo);
                    break;
                case 4:
                    obj.Sair();
                    break;
                default:
                    System.out.println("Valor inválido");
            }
        }

    }

    public void Saldo(double saldo) {
        System.out.println("Seu saldo é de: R$" + saldo);
    }

    public double Saque(double saldo, double saque) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Digite o valor do saque: R$");
        saque = tcl.nextInt();
        saldo = saldo - saque;
        System.out.println("Seu saldo agora é de: R$" + saldo);
        return saldo;
    }

    public double Deposito(double saldo, double deposito) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Digite o valor do depósito: R$");
        deposito = tcl.nextInt();
        saldo = saldo + deposito;
        System.out.println("Seu saldo agora é de: R$" + saldo);
        return saldo;
    }

    public void Sair() {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Deseja realmente sair? (S/N)");
        String sair = tcl.next();
        if (sair.equals("S")) {
            System.exit(0);
        }
    }

    public void Menu() {
        System.out.println("~~~CAIXA ELETRÔNICO~~~");
        System.out.println("1 - SALDO");
        System.out.println("2 - SAQUE");
        System.out.println("3 - DEPÓSITO");
        System.out.println("4 - SAIR");
    }
}
