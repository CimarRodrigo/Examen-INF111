import java.util.Scanner;

public class Auto extends Vehiculo{
    private String tipo;
    private String detalle;

    public Auto(){}

    public Auto(String col, Motor m, String t, String d){
        super(col, m);
        this.tipo = t;
        this.detalle = d;
    }

    public void leer(){
        super.leer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tipo: " );
        this.tipo = sc.nextLine();
        System.out.println("Ingrese detalle: ");
        this.detalle = sc.nextLine();


    }

    public void mostrar(){
        super.mostrar();
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Detalle: " + this.detalle);
    }

}
