/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila_ejercicio1;

/**
 *
 * @author Lili diaz
 * @param  <Z>
 */
public class Nodo <Z> {
    //Atributos
    private Z elemento;
    private Nodo<Z> siguiente; //Apunta al siguiente nodo
    
    //Contructor
    public Nodo(Z elemento, Nodo<Z> siguiente){
        this.elemento = elemento;
        this.siguiente = siguiente;
    }

    //Metodos
    public Z getElemento() {
        return elemento;
    }

    public void setElemento(Z elemento) {
        this.elemento = elemento;
    }

    public Nodo<Z> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<Z> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return elemento+"\n";
    }
   
    
    
}
