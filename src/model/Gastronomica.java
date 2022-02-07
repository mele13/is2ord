package model;


/**
 * @author Mele13
 * v1.0.0
 * created at 07/02/2022
 */
public class Gastronomica extends ExperienciaTuristica{
    String tipoGastronomia;
    
    Gastronomica(String tipoGastronomia, String nombre, Double precio, 
            String descripcion, Localizacion localizacion){
        this.tipoGastronomia = tipoGastronomia;
        setNombre(nombre);
        setPrecio(precio);
        setDescripcion(descripcion);
        setLocalizacion(localizacion);
        
    }
    
    @Override
    public String getTipoExperiencia(){
        return(tipoGastronomia);
    }    
}
