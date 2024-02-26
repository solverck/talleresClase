/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manipulacionarchivos;

import java.util.Scanner;
import manipulacionArchivos.Metodos;

/**
 *
 * @author LAB-TELECO
 */
public class ManipulacionArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Escriba que quiere realiza \n 1- escribir \n 2- abrir archivos \n 3- crear \n 4- borrar");
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
            default:
                throw new AssertionError();
        }
    }

}
