/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author JuanAndresGuacanemeO
 */
public class Pincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escriba que quiere realiza \n 1- escribir \n 2- abrir archivos \n 3- crear \n 4- borrar \n 5- Leer el archivo");
        Scanner s = new Scanner(System.in);
        int opc = s.nextInt();
        Metodos metodo = new Metodos();

        switch (opc) {
            case 1:
                metodo.escrbir();
                break;
            case 2:

                metodo.abrirArchivo();
                break;
            case 3:

                metodo.crear();
                break;
            case 4:

                metodo.borrar();
                break;
            case 5:
                
                metodo.LeerArchivo();
                break;
            default:
                throw new AssertionError();
        }
    }

}
