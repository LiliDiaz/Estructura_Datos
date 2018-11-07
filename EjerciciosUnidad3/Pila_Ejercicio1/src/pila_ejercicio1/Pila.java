/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila_ejercicio1;

/**
 *
 * @author Lili diaz
 * @param <Z>
 */
public class Pila <Z>{
     
    //Atributos
    private Nodo<Z> top; //Ultimo nodo que se ha incluido
    private int tamanio;
    
    //Constructores
    public Pila(){
        top = null; //No hay elementos
        this.tamanio = 0;
    }

    //Metodos
    /**
     * Indica si esta vacia o no
     * @return 
     */
    public boolean isEmpty(){
        return top == null;
    }
    
    public int size(){
        return this.tamanio;
    }
    
    public Z top(){
        if(isEmpty()){
            return null;
        }else{
            return top.getElemento();
        }
    }
    
    public Z pop(){
        if(isEmpty()){
            return null;
        }else{
            Z elemento = top.getElemento();
            Nodo<Z> aux = top.getSiguiente();
            top = null;
            top = aux;
            this.tamanio--;
            return elemento;
        }
    }
    
    public Z push(Z elemento){
        
        Nodo<Z> aux = new Nodo<>(elemento, top);
        top = aux;
        this.tamanio++;
        return aux.getElemento();
    }
    
    public String toString(){
        
        if(isEmpty()){
            return "La pila esta vacia";
        }else{
            
            String resultado="";
            Nodo<Z> aux = top;
            while(aux!=null){
                resultado += aux.toString();
                aux = aux.getSiguiente();
            }
            
            return resultado;
            
        }
        
        
        
    }
    public void Imprimir(){
    Nodo aux=top;
    while(aux!=null){
        System.out.print(aux.getElemento());
        aux=aux.getSiguiente();
    
    }
    }
    
}
