import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Conta conta = new Conta();
        System.out.println("Abrir conta S ou N? ");
        conta.setAbrirConta2(input.next());
        if (conta.isStatus()==true) {
            System.out.println("Qual sua numéro da conta ?");
            conta.setNumConta(input.nextInt());
            System.out.println("Qual o nome da nova conta ?");
            conta.setDono(input.next());
            System.out.println("Qual o tipo de conta ? Conta Corrente digite ÇC'se for Conta Poupança digite 'CP'");
            conta.setTipo(input.next());
            conta.abrirConta();
            System.out.println("Você deseja depositar? S ou N ");
            conta.setDesejaDepositar(input.next());
                    if (conta.getDesejaDepositar().equalsIgnoreCase("S")){
                        System.out.println("Quanto deseja depositar?");
                        conta.depositar(input.nextInt());
                    }else if(conta.getDesejaDepositar().equalsIgnoreCase("N")){
                        System.out.println("Muito Obrigado");
                    }
            System.out.println("Você deseja Sacar? S ou N ");
            conta.setDesejaSacar(input.next());
                   if (conta.getDesejaSacar().equalsIgnoreCase("S")){
                       System.out.println("Quanto deseja sacar?");
                       conta.sacar(input.nextInt());
                   }else if(conta.getDesejaSacar().equalsIgnoreCase("N")){
                       System.out.println("Muito Obrigado");
                   }
            System.out.println("Pagar mensalidade ? S ou N");
            conta.setPagarMensalidade2(input.next());
                    if(conta.getPagarMensalidade2().equalsIgnoreCase("S")){
                    conta.pagarMensalidade();
                    }
       }else {
                  System.out.println("Programa encerrado");
             }

        conta.statusDaConta();

}
}