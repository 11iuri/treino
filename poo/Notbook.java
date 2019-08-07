package poo;

public class Notbook extends computadores implements computadors {

    private String cor;
    private String modelo;
    private int tela;

    public Notbook() {

        this.cor = "azul";
        this.modelo = "s72";
        this.preco = 5.90f;
        this.status = false;
        this.tela = 15;

    }

    public Notbook(String cor, String modelo, int tela) {

        this.cor = cor;
        this.modelo = modelo;
        this.tela = tela;
        this.status = false;
        this.preco = 15f;

    }

    @Override
    public void ligar() {
    }

    @Override
    public void desligar() {
    }    
    @Override 
    public void boasvindas (){
        System.out.println("Salve");
    }


}
