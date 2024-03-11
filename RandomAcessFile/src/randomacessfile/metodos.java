/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package randomacessfile;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class metodos {

    RandomAccessFile arch;
    String rutaArchivo;

    public void LeeEscribe(String ruta) {
        rutaArchivo = ruta;
    }

    public void CrearAbrirEscrituraArchivo() {
        try {
            arch = new RandomAccessFile(rutaArchivo, "rw");
        } catch (IOException e) {
            System.out.println("error al abrir para escritura");
        }
    }

    public void AbrirParaLeerArchivo() {
        try {
            arch = new RandomAccessFile(rutaArchivo, "r");
        } catch (IOException e) {
            System.out.println("error al abrir para lectura");
        }
    }

    public void cerrar() {
        try {
            arch.close();
        } catch (IOException e) {
            System.out.println("error al cerrar");
        }

    }

    public void leerTodoPorLineas() {
    }

    public void LeerEnteros() {
        try {

            System.out.println(arch.readLine());

        } catch (Exception e) {
            System.out.println("error al grabar");
        }
    }

    public void EscribirEnteros() {
        boolean seguir = false;
        try {
            
            do {
                arch.writeChars("  ");
                System.out.println("Escribe lo que quieres agregar al archivo");
                Scanner sn = new Scanner(System.in);
                String escribir = sn.nextLine();
                arch.writeChars(escribir);

                System.out.println("Quiere seguir escribiendo el archivo? /n SI /n NO");
                String opcion = sn.nextLine();
                if (opcion.equals("SI")) {
                    seguir = true;
                    
                } else if (opcion.equals("NO")) {
                    seguir = false;
                } else {
                    System.out.println("has escojido una opciona invalida");
                }
            } while (seguir == true);

        } catch (Exception e) {
            System.out.println("error al grabar");
        }
    }
}
