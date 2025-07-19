package my_pets.utilidades;

import java.io.*;
import java.util.*;
import my_pets.modelo.*;

public class GestorArchivos {
    
    // Guarda el historial de acciones en un archivo de texto.
    public static void guardarHistorial(ArrayList<Acciones> historial, String nombreArchivo) {
        
        try {
            
            FileWriter archivoNuevo = new FileWriter(nombreArchivo);
            PrintWriter escritor = new PrintWriter(archivoNuevo);

            // Guardamos cada acción en una línea.
            for (Acciones accion : historial) {
                escritor.println(accion.getAccion());
            }

            escritor.close(); //Cerramos el escritor.
            
            System.out.println("- Historial guardado correctamente en " + nombreArchivo);
            
        } catch (IOException e) {
            
            System.out.println("- Error al guardar historial: " + e.getMessage());
        }
    }

    // Lee el historial de acciones desde un archivo.
    public static ArrayList<Acciones> leerHistorial(String nombreArchivo) {
        
        ArrayList<Acciones> historial = new ArrayList<>();
        
        try {

            FileReader archivoLeer = new FileReader(nombreArchivo);
            BufferedReader lector = new BufferedReader(archivoLeer);
            
            String linea;

            // Cada línea es una acción.
            while ((linea = lector.readLine()) != null) {
                historial.add(new Acciones(linea));
            }

            lector.close();
            
            System.out.println("- Historial cargado correctamente desde " + nombreArchivo);
            
        } catch (IOException e) {
            
            System.out.println("- Error al leer historial: " + e.getMessage());
        }
        
        return historial;
    }

    // Guarda el estado de la mascota.
    public static void guardarEstadoMascota(Mascota mascota, String nombreArchivo) {

        try {

            FileWriter nuevaLectura = new FileWriter(nombreArchivo);
            PrintWriter escritor = new PrintWriter(nuevaLectura);

            // Guardamos cada atributo en una línea
            escritor.println(mascota.getClass().getSimpleName());
            escritor.println(mascota.getNombre());
            escritor.println(mascota.getFelicidad());
            escritor.println(mascota.getHambre());
            escritor.println(mascota.getEnergia());

            escritor.close();

            System.out.println("- Estado de la mascota guardado correctamente en " + nombreArchivo);

        } catch (IOException e) {
            
            System.out.println("- Error al guardar el estado: " + e.getMessage());
        }
    }

    // Lee el estado de la mascota desde un archivo y devuelve un array con los datos.
    public static String[] leerEstadoMascota(String nombreArchivo) {

        String[] datos = new String[5]; // nombre, felicidad, hambre, energía

        try {
            
            FileReader nuevaLectura = new FileReader(nombreArchivo);
            BufferedReader lector = new BufferedReader(nuevaLectura);

            datos[0] = lector.readLine(); // nombre
            datos[1] = lector.readLine(); // felicidad
            datos[2] = lector.readLine(); // hambre
            datos[3] = lector.readLine(); // energía
            datos[4] = lector.readLine(); // energía

            lector.close();
            
            System.out.println("- Estado de la mascota cargado correctamente desde " + nombreArchivo);
            
        } catch (IOException e) {
            
            System.out.println("- Error al leer el estado: " + e.getMessage());
        }
        
        return datos;
    }
    
}
