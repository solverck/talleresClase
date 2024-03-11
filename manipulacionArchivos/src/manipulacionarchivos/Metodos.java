

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manipulacionArchivos;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author JuanAndresGuacanemeO
 */
public class Metodos {

    public void crear() {
        File carpeta = new File("NuevaCarpeta");
        System.out.println("Como quieres que se llame el archivo");
        Scanner s = new Scanner(System.in);
        String nombreArchivo = s.nextLine();
        File archivos = new File("NuevaCarpeta\\"+nombreArchivo);
        try {
            boolean nuevaCarpeta = carpeta.mkdir();
            boolean filecrated = archivos.createNewFile();
            if (nuevaCarpeta || filecrated) {
                System.out.println("el archivo se creao correctamente");
            } else {
                System.out.println("el archivo ya existe");
            }
        } catch (IOException e) {
            System.out.println("exepcion al crear el archivo" + e);
        }

    }

    public void borrar() {
        System.out.println("Escribe la ruta del archivo que quieres eliminar");
        Scanner s = new Scanner(System.in);
        String archivoElminar = s.nextLine();
        File file = new File("NuevaCarpeta\\"+archivoElminar);
        if (file.delete()) {
            System.out.println("El archivo se borro correctamente");
        } else {
            System.out.println("No se pudo borrar el archivo");
        }
    }

    public void abrirArchivo() {
        System.out.println("Escribe la ruta del archivo que quieres abrir");
        Scanner s = new Scanner(System.in);
        String archivoAbrir = s.nextLine();
        try {
            File file = new File("NuevaCarpeta\\"+archivoAbrir);
            Desktop desktop = Desktop.getDesktop();
            desktop.open(file);
        } catch (IOException ex) {
            System.out.println("Error al abrir el archivo: " + ex.getMessage());
        }
    }

    public void escrbir() {
        System.out.println("Escribe la ruta del archivo que quieres editar");
        Scanner s = new Scanner(System.in);
        String archivoEditar = s.nextLine();
        try {
            FileWriter writer = new FileWriter("NuevaCarpeta\\"+archivoEditar);
            System.out.println("que quieres poner en el archivo");
            writer.write(s.nextLine());
            writer.close();
            
        } catch (IOException e) {
            System.out.println("no se pudo excribir lo siento erro: " + e);
        }

    }
}