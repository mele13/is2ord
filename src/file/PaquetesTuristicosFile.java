package file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Localizacion;
import org.apache.commons.io.FileUtils;

/**
 * @author Mele13
 * v1.0.0
 * created at 07/02/2022
 */
public class PaquetesTuristicosFile {

    public List<String[]> cargarPaquetesTuristicos(Localizacion localizacion) { 
        return buscarPaquetesLocalizacion(localizacion.getValue());
    }
    
    private List<String[]> buscarPaquetesLocalizacion(String localizacion) {
        return buscarMultiplesCoincidenciasEnArchivo("Paquetes.txt", localizacion, 4);
    }
    
    private List<String[]> buscarMultiplesCoincidenciasEnArchivo(String nombreArchivo, String datoBusqueda, int numeroCampo) {
        List<String[]> coincidencias = new ArrayList<>();
        for (String[] fila : buscarTodosLosDatosDelArchivo(nombreArchivo)) {
            if (datoBusqueda.equalsIgnoreCase(fila[numeroCampo])) {
                coincidencias.add(fila);
            }
        }
        return coincidencias;
    }
    
        private List<String[]> buscarTodosLosDatosDelArchivo(String nombreArchivo) {
        List<String[]> data = new ArrayList<>();
        try {
            File archivo = new File(nombreArchivo);
            Scanner reader = new Scanner(archivo);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] datos = line.split(";");
                data.add(datos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}
