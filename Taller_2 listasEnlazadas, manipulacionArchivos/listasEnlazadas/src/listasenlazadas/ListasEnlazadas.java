/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasenlazadas;

import java.util.LinkedList;

/**
 *
 * @author LAB-TELECO
 */
public class ListasEnlazadas {

    /**
     * @param args the command line arguments
     */
    Nodo cabeza;

     public static void main(String[] args) {
        ListasEnlazadas lista = new ListasEnlazadas();
        lista.agregar("ejemplo");
        lista.agregar(45);
        lista.agregar("hola");
        lista.agregar("eddy");

        lista.imprimirLista();

        lista.borrar("hola");
        lista.imprimirLista();

        lista.modificar("ejemplo", "nuevo ejemplo");
        lista.imprimirLista();
    }

    public static void printList(Nodo cabeza) {
        Nodo ptr = cabeza;
        while (ptr != null) {
            System.out.print(ptr.valor + " -> ");
            ptr = ptr.siguiente;
        }

        System.out.println("null");
    }

    // Método para agregar un nuevo nodo al final de la lista
    public void agregar(Object valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.obtenerSiguiente() != null) {
                actual = actual.obtenerSiguiente();
            }
            actual.enlazarSiguiente(nuevoNodo);
        }
    }

    // Método para eliminar un nodo con un valor dado de la lista
    public void borrar(Object valor) {
        if (cabeza != null) {
            if (cabeza.obtenerValor().equals(valor)) {
                cabeza = cabeza.obtenerSiguiente();
            } else {
                Nodo actual = cabeza;
                while (actual.obtenerSiguiente() != null && !actual.obtenerSiguiente().obtenerValor().equals(valor)) {
                    actual = actual.obtenerSiguiente();
                }
                if (actual.obtenerSiguiente() != null) {
                    actual.enlazarSiguiente(actual.obtenerSiguiente().obtenerSiguiente());
                }
            }
        }
    }

    // Método para modificar el valor de un nodo en la lista
    public void modificar(Object valorAntiguo, Object valorNuevo) {
        Nodo actual = cabeza;
        while (actual != null && !actual.obtenerValor().equals(valorAntiguo)) {
            actual = actual.obtenerSiguiente();
        }
        if (actual != null) {
            actual.valor = valorNuevo;
        }
    }

    // Método para imprimir la lista
    public void imprimirLista() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.obtenerValor() + " -> ");
            actual = actual.obtenerSiguiente();
        }
        System.out.println("null");
    }

}
