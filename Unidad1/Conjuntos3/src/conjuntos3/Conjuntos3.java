/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjuntos3;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Lili diaz
 */
public class Conjuntos3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado = new Scanner (System.in);
         ArrayList <Integer> CA = new ArrayList();
        CA.add(25);
        CA.add(8);
        CA.add(6);
        CA.add(9);
        CA.add(7);
        CA.add(4);
        CA.add(3);
        CA.add(20);
        ArrayList <Integer> CB = new ArrayList();
        CB.add(9);
        CB.add(4);
        CB.add(7);
        CB.add(11);
        CB.add(12);
        CB.add(13);
        CB.add(14);
        System.out.println("EL arreglo A: "+CA);
        System.out.println("El arreglo B: "+CB);
        int opcion;
        do {
          Operaciones ob = new Operaciones();
        System.out.println("Bienvenido Al programa");
        System.out.println("1.- Conjunto Vacio");
        System.out.println("2.- Es Vacio");
        System.out.println("3.- Agregar");
        System.out.println("4.- Union");
        System.out.println("5.- Buscar elemento");
        System.out.println("6.- Interseccion");
        System.out.println("7.- Diferencia");
        System.out.println("8.- Eliminar elemento");
        System.out.println("9.- Salir"); 
        System.out.print("Eliga una Opcion :");
        opcion = teclado.nextInt();
        if (opcion==1){
            ob.ConjuntoVacio(CA);
        }else if(opcion ==2){ 
            ob.EsVacio(CA);
        }else if(opcion==3){
           ob.Agregar(CA);
        }else if(opcion ==4){
            ob.Union(CA,CB);
        }else if(opcion==5){
            int z;
            System.out.println("Ingrese el numero a buscar: ");
            z=teclado.nextInt();
            ob.Buscar(CA,z);
        }else if(opcion==6){
             ob.Interseccion(CA, CB);
        }else if(opcion==7){
            ob.Diferencia(CA, CB);
        }else if(opcion==8){
             ob.Eliminar(CA);
        }else if(opcion==9){
            System.out.println("El programa ha finalizado, Gracias por usarlo"); 
        }
       
        } while(opcion !=9);
    }
    
}
