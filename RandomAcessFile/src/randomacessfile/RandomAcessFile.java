/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomacessfile;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author admin
 */
public class RandomAcessFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        metodos al = new metodos();

        al.LeeEscribe("C:\\Users\\admin\\Documents\\NetBeansProjects\\RandomAcessFile\\manipulacion\\prueba.txt");

        al.CrearAbrirEscrituraArchivo();
        al.EscribirEnteros();
        al.cerrar();

        al.AbrirParaLeerArchivo();
        al.LeerEnteros();
        al.cerrar();
    }

}
