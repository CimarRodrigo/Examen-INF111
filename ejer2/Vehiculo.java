import java.util.Scanner;

public class Vehiculo implements Objeto{
    public String color;
    public Motor motor = new Motor();


    public Vehiculo(){}

    public Vehiculo(String col, Motor m){
        this.color = col;
        this.motor = m;
    }
    

    public void leer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese color: ");
        this.color = sc.nextLine();
        this.motor.leer();
    }

    public void mostrar(){
        System.out.println("Color: " + this.color);
        this.motor.mostrar();
    }
}
