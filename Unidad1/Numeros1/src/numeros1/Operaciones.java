/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros1;

/**
 *
 * @author Lili diaz
 */
public class Operaciones {
    int num;
    Operaciones(int n){
    this.num=n;
}
    int Cero(){
        num=0;
    return num;
    }
    int Sucesor()
    {
        num++;
        return num;
    }
    int Antecesor(){
        num--;
        return num;
    }
   String Escero()
   {
       String r;
       if (num==0)
           r=" Es cero";
       else 
           r=" No es cero";
       return r;
   }
   String Igual(int n)
   {
       String r;
       if (num==n)
           r=" Es igual ";
       else
           r=" No es igual ";
       return r;
   }
   int Suma(int n){
       int r;
       r=num+n;
       return r;
   }
   String Menor(int n){
       String r;
       if (num<n){
           r=" Es menor ";
       }
       else 
           r=" Es mayor ";
       return r;
   }
   int Diferencia(int n){
       int r;
       r=num-n;
       return r;
   }
}
