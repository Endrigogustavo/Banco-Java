package Cliente;

import java.util.Scanner;

import Interface.InterfaceCliente;

public abstract class Cliente implements InterfaceCliente {
    private String Nome;
    protected int Saldo;

    Scanner scan = new Scanner(System.in);

    public Cliente(String nome){
        this.Nome = nome;
    }

    public String GetNome(){
        return Nome;
    }
    public void SetNome(String nome){
        this.Nome = nome;
    }


    @Override
    public void Depositar() {
       System.out.println("Digite um valor para depositar: ");
        int depositar = scan.nextInt();
        Saldo += depositar;
    }

    @Override
    public void Sacar() {
        System.out.println("Digite um valor para sacar: ");
        Double depositar = scan.nextDouble();
        Saldo -= depositar;
    }

    @Override
    public void Tranferir() {
        System.out.println("Digite um valor para tranferir: ");
        Double tranferir = scan.nextDouble();
        System.out.println("Para quem dejesa enviar? ");
        String nome = scan.nextLine();
        Saldo -= tranferir;
    }

    public abstract void Imprimir(); 


}
