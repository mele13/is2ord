package model;

import java.util.ArrayList;

/**
 * @author Mele13
 * v1.0.0
 * created at 07/02/2022
 */
public class PaqueteTuristico {

    public ArrayList<ExperienciaTuristica> experienciasTuristicas;
    
    public PaqueteTuristico() {
        experienciasTuristicas = new ArrayList<ExperienciaTuristica>();    
    }
    
    public void addExperienciaGastronomica(String tipoGastronomia, String nombre, Double precio, String descripcion, Localizacion localizacion) {
        experienciasTuristicas.add(new Gastronomica(tipoGastronomia, nombre, precio, descripcion, localizacion));
    }
    
    public void addExperienciaLudica(String actividad, String nombre, Double precio, String descripcion, Localizacion localizacion) {
        experienciasTuristicas.add(new Ludica(actividad, nombre, precio, descripcion, localizacion));
    }
    
    public void addExperienciaCultural(String actividad, String nombre, Double precio, String descripcion, Localizacion localizacion) {
        experienciasTuristicas.add(new Cultural(actividad, nombre, precio, descripcion, localizacion));
    }
    
    public void addExperienciaDeportiva(String deporte, String nombre, Double precio, String descripcion, Localizacion localizacion) {
        experienciasTuristicas.add(new Deportiva(deporte, nombre, precio, descripcion, localizacion));
    }
}