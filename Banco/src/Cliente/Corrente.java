package Cliente;

public class Corrente extends Cliente {
    
    public Corrente(String nome) {
        super(nome);

    }

    @Override
    public void Imprimir() {
        System.out.println("Conta Corrente: \n Prazer"+ GetNome() +" \n Seu saldo é :"+ Saldo);
    }
}
