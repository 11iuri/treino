package poo;

public class POO {

    public static void main(String[] args) {
        Notbook n1 = new Notbook();
        Notbook n2 = new Notbook("verde", "z32", 15);
        netbook net1 = new netbook();
        net1.preco = 15f;
        net1.so = "elementary";
        //net1.MostrarCarac();
        //n1.MostrarCarac();
        //n2.MostrarCarac();
        //n2.ligar();
        //n2.InstallLinux();
        //n2.Navegar();
        //n2.Desligar();
        net1.boasvindas();
        n2.boasvindas();

    }

}
