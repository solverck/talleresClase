/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author JuanAndresGuacanemeO
 */
public class Cola {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<String>();
        
        
        cola.offer("Ferrari");
        cola.offer("Toyota");
        cola.offer("Mazda");
        cola.offer("BMW");
        cola.offer("Suzuki");
        
        
        
        
        
        ArrayList listaCola = new ArrayList(cola);
        //Mostrar la cola
        System.out.println(cola);
        //Mostar primer el primer elemento
        System.out.println("El primer elemento es: "+ cola.peek());
        //Ultimo elemento
        System.out.println("El ultimo elemento es:" + listaCola.get(listaCola.size()-1));
        //Tamaño de la cola es
        System.out.println("El tamano de la cola es: " + cola.size());
        //Eliminamos el elemento
        System.out.println("Eliminamos el primer elemento: "+ cola.poll());
         //Mostrar la cola
        System.out.println(cola);
    }
}
