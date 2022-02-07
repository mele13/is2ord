package model;

/**
 * @author Mele13
 * v1.0.0
 * created at 07/02/2022
 */
public class Deportiva extends ExperienciaTuristica {

    private String deporte;

    public Deportiva(String deporte, String nombre, 
            Double precio, String descripcion, Localizacion localizacion) {
        this.deporte = deporte;
        setNombre(nombre);
        setPrecio(precio);
        setDescripcion(descripcion);
        setLocalizacion(localizacion);
    }

    public String getDeporte() {
        return deporte;
    }

    @Override
    public String getTipoExperiencia() {
        return (deporte);
    }
    
    
}
