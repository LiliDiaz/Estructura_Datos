/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila_ejercicio1;

import java.util.*;

/**
 *Li
 * @author Lili diaz
 */
public class Pila_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pila<String> pilaNumeros = new Pila<>();
        Scanner teclado= new Scanner(System.in);
        
        int b;
        
        System.out.println("Ingrese la cadena: ");
        String cad= teclado.nextLine();
        b=cad.length();
        
        char descom;
        
        char letter [] = cad.toCharArray();
        for (int i=0; i<letter.length; i++){
        descom=cad.charAt(i);
        String x= Character.toString (descom);
        
        pilaNumeros.push(x);
        }

      

        System.out.println("Lo ingresado queda de manera: ");
        System.out.println("");
        System.out.println("");
            pilaNumeros.Imprimir();
        System.out.println("");

    }
    }
    

