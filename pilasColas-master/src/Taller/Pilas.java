/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller;

import java.util.Stack;

/**
 *
 * @author JuanAndresGuacanemeO
 */
public class Pilas {

    /**
     * @param args the command line arguments last in first out
     */
    public static void main(String[] args) {
        Stack<String> pila = new Stack<String>();


        //agregar
        pila.push("Guayaba");
        pila.push("Limon");
        pila.push("Naranja");
        pila.push("Pera");
        pila.push("Manzana");

        //Imprimimos la pila
        System.out.println(pila);
        //Primer elemento
        System.out.println("el primer elemento es: " + pila.firstElement());
        //Tamaño de la pila
        System.out.println("el tamano de la pila es: " + pila.size());
        //ultimo elemento
        System.out.println("el ultimo elemento es: "+ pila.peek());
        //Eliminar un elemento
        System.out.println("Eliminar un elemento: " + pila.pop());
        //Imprimimos la pila
        System.out.println(pila);
 
    }

}
