package model;

/**
 * @author Mele13
 * v1.0.0
 * created at 07/02/2022
 */
public abstract class ExperienciaTuristica {

    String nombre;
    Double precio;
    Localizacion localizacion;
    String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public Localizacion getLocalizacion() {
        return localizacion;
    }
    
    public abstract String getTipoExperiencia();

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

   void setPrecio(Double precio) {
        this.precio = precio;
    }

    void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }

    void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }    
}
