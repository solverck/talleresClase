/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasenlazadas;

/**
 *
 * @author LAB-TELECO
 */
public class Nodo {

    Object valor;
    Nodo siguiente;

    public Nodo(Object valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public Object obtenerValor() {
        return valor;
    }

    public void enlazarSiguiente(Nodo n) {
        siguiente = n;
    }

    public Nodo obtenerSiguiente() {
        return siguiente;
    }
    
    
}
