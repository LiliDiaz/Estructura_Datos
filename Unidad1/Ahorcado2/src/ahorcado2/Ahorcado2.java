/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado2;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Lili diaz
 */
public class Ahorcado2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner entrada = new Scanner(System.in);
       Random r = new Random(); //Numero ramdom.
       String[] palabras = {"Saltar","llave","celular","mesa", "mar", "botella", "programar", "cables", "luz", "laptop", "ciudad", "niños"}; //Arreglo de palabras.
       int n_azar = r.nextInt(palabras.length); //Convercion variable r en integer.
       
       //Declaracion del Objeto.
       Procesos pro = new Procesos(); 
       
       //Objetos.
       pro.Cadena(palabras, n_azar); //Convierte la cadena string a char.
       pro.OcultarCadena(); //Oculta la palabra.
       
       for(int i = 1; i <= 6; i++){
           pro.Juego(entrada, i);
           pro.Verificacion(i);
            System.out.println(pro.getCadenaJuego()); 
       }
    }
    
}

        