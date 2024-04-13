package Ejer3;

import java.util.*;

public class Conjunto {
    private char[] elementos = new char[100];
    private int cantidad;
    
    public Conjunto(){

    }
    public Conjunto(int n) {
        this.cantidad = n;
    }


    public void leer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("  los elementos: ");
        for (int i = 0; i < this.cantidad; i++) {
            this.elementos[i] = sc.next().charAt(0);
        }
    }

    public void mostrar() {
        for (int i = 0; i < this.cantidad; i++) {
            System.out.println(this.elementos[i]);
        }
    }

    public Conjunto restar(Conjunto c) {
        Conjunto res = new Conjunto();
        res.cantidad = this.cantidad;
        for (int i = 0; i < this.cantidad; i++) {
            res.elementos[i] = this.elementos[i];
        }
        for (int i = 0; i < c.cantidad; i++) {
            for (int j = 0; j < res.cantidad; j++) {
                if (c.elementos[i] == res.elementos[j]) {
                    res.elementos[j] = ' ';
                }
            }
        }
        return res;
    }
}
