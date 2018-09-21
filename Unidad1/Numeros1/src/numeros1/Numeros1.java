/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros1;

import java.util.Scanner;
/**
 *
 * @author Lili diaz
 */
public class Numeros1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner ajua=new Scanner(System.in);
        int n;
        int op;
        do{
           System.out.println("1.- Cero");
           System.out.println("2.- Sucesor");
           System.out.println("3.- Es cero");
           System.out.println("4.- Igual");
           System.out.println("5.- Suma");
           System.out.println("6.- Antecesor");
           System.out.println("7.- Diferencia");
           System.out.println("8.- Menor");
           System.out.println("Elige una opcion");
           op = ajua.nextInt();
           System.out.println("Ingrese un numero");
            n=ajua.nextInt();
           Operaciones ob1=new Operaciones(n);
           if(op == 1){
                System.out.println(ob1.Cero());
                    
           }
           else if(op==2){
               System.out.println("El numero sucesor de " +n+ " es: " + ob1.Sucesor());
           }
           else if (op==3){
               System.out.println(ob1.Escero());
           }
           else if (op==4){
               int a;
               System.out.println("Ingrese un nuevo numero");
               a=ajua.nextInt();
               System.out.println("El numero " + n + ob1.Igual(a) + "  a "+ a );
           }
           else if (op==5){
               int b;
               System.out.println("Ingrese un numero ");
               b=ajua.nextInt();
               System.out.println("La suma de los numeros es "+ ob1.Suma(b));
           }
           else if (op==6){
                System.out.println("El numero antecesor de "+n+" es: " + ob1.Antecesor());
           }
           else if (op==7){
               int c;
               System.out.println("Ingrese un nuevo numero");
               c=ajua.nextInt();
               System.out.println("La diferencia de " + n + " Es: " + ob1.Diferencia(c));
           }
           else if (op==8){
               int d;
               System.out.println("Ingrese un nuevo numero");
               d=ajua.nextInt();
               System.out.println("El numero  : " + n + ob1.Menor(d)+ " a " + d);
           }
        }while(op!=9);
        
    }
    
}
