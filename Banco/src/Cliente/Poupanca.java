package Cliente;

public class Poupanca extends Cliente {
    public Poupanca(String nome) {
        super(nome);
    }

    @Override
    public void Imprimir() {
       System.out.println("Conta Poupança: \n Prazer "+ GetNome() +" \n Seu saldo é "+ Saldo);
        
    }
}
