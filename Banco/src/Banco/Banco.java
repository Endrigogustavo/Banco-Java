package Banco;

public class Banco {
    
    private String NomeBanco;

    public Banco(String nome){
        this.NomeBanco = nome;
    }

    public String GetNomeBanco(){
        return NomeBanco;
    }
    public void SetNomeBanco(String nome){
        this.NomeBanco = nome;
    }
}
