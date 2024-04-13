import java.util.Scanner;

public class Profesor extends Persona{
    private String item;

    public Profesor(){

    }
    public Profesor(String n, int c, String i){
        super(n, c);

        this.item = i;
    }

    public void leer(){
        Scanner sc = new Scanner(System.in);

        super.leer();
        System.out.println("Ingrese el item: ");
        this.item = sc.nextLine();

    }

    public void mostrar(){
        super.mostrar();
        System.out.println("Item: " + this.item);
    }

}
