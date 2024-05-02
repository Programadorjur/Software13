
package Datos;

import Entidad.Matricula;

import Entidad.Notas;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escrituratxt {
    public void registrarMatricula(Matricula matricula) {
    String rutaArchivo = "matricula.txt";

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
        // Escribir los datos en el archivo separados por comas
        writer.write(matricula.getNombre() + "," + matricula.getCelular() + "," + matricula.getEdad() + "," + matricula.getDireccion() + "," + matricula.getDni() + "\n");

        System.out.println("Registro guardado exitosamente en " + rutaArchivo);
    } catch (IOException e) {
        System.out.println("Error al intentar escribir en el archivo " + rutaArchivo);
    }
}
    public void registrarMascota(Notas notas) {
        // Ruta del archivo donde se guardarán los registros
        String rutaArchivo = "notas.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            // Escribir los datos en el archivo separados por comas
            writer.write(notas.getDniMatricula() + "," + notas.getNota1() + "," + notas.getNota2() + "," + notas.getNota3() + "\n");

            System.out.println("Registro de mascota guardado exitosamente en " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error al intentar escribir en el archivo " + rutaArchivo);
        }
    }
}
