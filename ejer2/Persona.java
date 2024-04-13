import com.sun.nio.sctp.AbstractNotificationHandler;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public abstract class Persona {
    public int ci;
    public String nombre;


    public Persona(){

    }
    public Persona(String n, int c){
        this.nombre = n;
        this.ci = c;
    }


    public void leer(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre: ");
        this.nombre = sc.nextLine();
        System.out.println("Ingrese el ci: ");
        this.ci = sc.nextInt();

    }


    public void mostrar(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("CI: " + this.ci);
    }

}
