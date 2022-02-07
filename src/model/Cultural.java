package model;

/**
 * @author Mele13
 * v1.0.0
 * created at 07/02/2022
 */
public class Cultural extends ExperienciaTuristica {

    private String actividad;

    public Cultural(String actividad, String nombre, Double precio, 
            String descripcion, Localizacion localizacion) {
        this.actividad = actividad;
        setNombre(nombre);
        setPrecio(precio);
        setDescripcion(descripcion);
        setLocalizacion(localizacion);
    }

    public String getActividad() {
        return actividad;
    }

    @Override
    public String getTipoExperiencia() {
        return actividad;
    }   
}
