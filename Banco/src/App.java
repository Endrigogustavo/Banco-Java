import Cliente.Conta;
import Cliente.Poupanca;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo ao banco!!! \n");
        Conta conta = new Conta("Teste");
        conta.Depositar();

        Poupanca pou = new Poupanca("Teste");
        pou.Imprimir();
    }
}
