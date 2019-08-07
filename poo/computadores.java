
package poo;

public abstract class computadores {

    protected float preco;
    protected boolean status;
    protected String so;

    void ligar() {
        this.status = true;
        System.out.println("O computador está ligado");

    }

    void InstallLinux() {
        if (this.status == true) {
            this.setSo("lunix");
            System.out.println("O sistema foi instalado");

        }
    }

    void Navegar() {
        if (this.status == false) {
            System.out.println("Não posso navegar");
        } else {
            System.out.println("Navegando");
        }
    }

    void Desligar() {
        if (this.status == true) {
            System.out.println("O computador foi desligado");
        } else {
            System.out.println("O computador já está Desligado");
        }
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }
        void MostrarCarac() {
        System.out.println("preco" + this.preco);
        System.out.println("status: " + this.status);
        System.out.println("So" + this.so);

    }

}
