package model;

/**
 * @author Mele13
 * v1.0.0
 * created at 07/02/2022
 */
public enum Localizacion {

    TENERIFE("TENERIFE"),
    GOMERA("GOMERA"),
    PALMA("PALMA"),
    HIERRO("HIERRO"),
    GRANCANARIA("GRANCANARIA"),
    LANZAROTE("LANZAROTE"),
    GRACIOSA("GRACIOSA"),
    FUERTEVENTURA("FUERTEVENTURA");

    public final String label;

    public static Localizacion getByLocalizacion(String localizacion) {
        switch(localizacion) {
            case "TENERIFE": return TENERIFE;
            case "GOMERA": return GOMERA;
            case "PALMA": return PALMA ;
            case "HIERRO": return HIERRO;
            case "GRANCANARIA": return GRANCANARIA;
            case "LANZAROTE": return LANZAROTE;
            case "GRACIOSA": return GRACIOSA;
            case "FUERTEVENTURA": return FUERTEVENTURA;        
        }        
        return null;
    }
    
    private Localizacion(String label) {
        this.label = label;
    }

    public String getValue() {
        return label;
    }
}