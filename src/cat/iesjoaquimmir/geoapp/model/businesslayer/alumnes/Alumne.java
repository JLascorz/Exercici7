/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.model.businesslayer.alumnes;

/**
 *
 * @author Jordi Lascorz
 */
public class Alumne {

//<editor-fold defaultstate="collapsed" desc="Atributs">
    private String nom;
    private int edat;
    private String dni;
    
    public static final String DefNom = "Anonymous";
    public static final int DefEdat = 99;
    public static final String DefDNI = "00000000A";
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Metodes">
      //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
        //NOM
        public String getNom(){
            return nom;
        }
        public void setNom(String nom){
            if(nom == null){
                throw new IllegalArgumentException(String.format("El valor %s no puede ser null"));
            }
            this.nom = nom;
        }
        
        //EDAT
        public int getEdat(){
            return edat;
        }
        public void setEdat(int edat){
            if(edat < 3){
                throw new IllegalArgumentException(String.format("La edat no pot ser menor a 3."));
            }
            this.edat = edat;
        }
        
        //DNI
        //NOM
        public String getDNI(){
            return dni;
        }
        public void setDNI(String dni){
            if(dni == null){
                throw new IllegalArgumentException(String.format("El valor no pot ser null."));
            }
            this.dni = dni;
        }
     
        
        

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructors">
        public Alumne(String nom, int edat, String dni){
            
            this.setNom(nom);
            this.setEdat(edat);
            this.setDNI(dni);
        }
        
        //Alumne sin valores
        public Alumne(){
            this(DefNom , DefEdat, DefDNI);
        }
        //Alumne sin nom i sin dni
        public Alumne(int edat){
            this(DefNom, edat, DefDNI);
        }
        //Alumne sin edat i sin dni
        public Alumne(String nom){
            this(nom , DefEdat, DefDNI);
        }
        //Alumne sin nom i sin edat
       /*public Alumne(String dni, String nom, int edat){
            if(nom == null && edat < 3){
               this.setDNI(dni);
               this.setNom(DefNom);
               this.setEdat(DefEdat);
            }

         }*/
        //Alumne sin dni
        public Alumne(String nom, int edat){
            this(nom , edat, DefDNI);
        }
        //Alumne sin nom
        public Alumne(int edat, String dni){
            this(DefNom, edat, dni);
        }
        //Alumne sin edat
        public Alumne(String nom, String dni){
            this(nom, DefEdat, dni);
        }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodes D'objectes">
        public String getSalutacio(){
            return String.format("Hola, sóc en/la %s amb la identificació %s i tinc %d anys", nom, dni, edat);
        }

    //</editor-fold>
//</editor-fold>
    
}
