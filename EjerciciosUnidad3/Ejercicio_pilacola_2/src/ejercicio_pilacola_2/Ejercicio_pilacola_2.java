/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_pilacola_2;

import java.util.Scanner;

/**
 *
 * @author Lili diaz
 */
public class Ejercicio_pilacola_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado= new Scanner (System.in);
        Pila<Integer> pilaNumeros= new Pila<>();
       // pilaNumeros.push(10);
        //pilaNumeros.push(250);
        //pilaNumeros.push(40);
       int numero;
        System.out.println("Bienvenido al programa");
       
        System.out.println("¿Cuantos numeros desea ingresar?");
        numero=teclado.nextInt();
        for (int i =0; i < numero; i++)
        {
            System.out.println("Ingrese el numero: ");
            int a=teclado.nextInt();
            pilaNumeros.push(a);
        }
    
        System.out.println(pilaNumeros);
        Cola c=new Cola();
        System.out.println("Imprimir cola:");
        c.LlenarCola(pilaNumeros);
        System.out.println("Estado de la pila:");
        System.out.print("");
        System.out.println(pilaNumeros);
        
    
    }
    
}
