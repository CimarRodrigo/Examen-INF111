import java.util.Scanner;

public class Moto extends Vehiculo{
    private String serie;


    public Moto(){}

    public Moto(String col, Motor m, String s){
        super(col, m);
        this.serie = s;
    }

    public void leer(){
        super.leer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese serie: " );
        this.serie = sc.nextLine();



    }

    public void mostrar(){
        super.mostrar();
        System.out.println("Serie: " + this.serie);

    }
}
