import java.util.Scanner;

public class Motor {
    public String potencia;
    public String fabricante;

    public Motor(){}

    public Motor(String a, String b){
        this.potencia = a;
        this.fabricante = b;
    }

    public void activa(){
        System.out.println("Motor activado");
    }

    public void desactiva(){
        System.out.println("Motor desactivado");
    }

    public void mostrar(){
        System.out.println("Potencia: " + this.potencia);
        System.out.println("Fabricante: " + this.fabricante);
    }

    public void leer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese potencia: ");
        this.potencia = sc.nextLine();
        System.out.println("Ingrese Fabricante: ");
        this.fabricante = sc.nextLine();
    }
}
