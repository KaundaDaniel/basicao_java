import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int numero;
        String nome, agencia;
        double saldo;

        System.out.println("Digiteo seu numero da sua Conta");
        numero=sc.nextInt();
        System.out.println("Digite o seu nome");
        nome=sc.next();
        System.out.println("Digite o seu saldo");
        saldo=sc.nextDouble();
        System.out.println("Digite a sua agencia");
        agencia=sc.next();
        System.out.println("Ola" +nome + "obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + "conta" + numero + "e seu saldo " + saldo + " já está disponível para saque" );
    }
}
