

package cat.iesjoaquimmir.geoapp.model.businesslayer.alumnes;
import java.util.ArrayList;

public class Moduls {
//<editor-fold defaultstate="collapsed" desc="Atributs">
    private String nom;
    private String descripcio;
    private int hores;
    
    public static final String DEF_DESC = "Aquest modul no te descripcio.";
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodes">
    //<editor-fold defaultstate="collapsed" desc="Getters / Setters">
        //NOM
        public String getNom(){
            return nom;
        }
        public void setNom(String nom){
            if(nom == null){
                throw new IllegalArgumentException(String.format("El nom no pot ser null"));
            }
            this.nom = nom;
        }
        //DESCRIPCIO
        public String getDescripcio(){
            return descripcio;
        }
        public void setDescripcio(String descripcio){
            if(descripcio == null){
                throw new IllegalArgumentException(String.format("La descripcio no pot ser null"));
            }
            this.descripcio = descripcio;
        }
        //HORES
        public int getHores(){
            return hores;
        }
        public void setHores(int hores){
            if(hores < 1){
                throw new IllegalArgumentException(String.format("No pots tenir el modul amb menys d'una hora."));
            }
            this.hores = hores;
        }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Moduls(String nom, String descripcio, int hores){
            
            this.setNom(nom);
            this.setDescripcio(descripcio);
            this.setHores(hores);
            
    }
    public Moduls(String nom, int hores){
            this(nom, DEF_DESC, hores);
            
    }

    //</editor-fold>
        public String getModuls(){
            return String.format("%n %s %s %d", getNom(), getDescripcio(), getHores());
        }
//</editor-fold>
}
