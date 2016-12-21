/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.jordi.institut.alumnes;
import java.util.ArrayList;
/**
 *
 * @author Jordi Lascorz
 */
public class Alumne {

//<editor-fold defaultstate="collapsed" desc="Atributs">
    private String nom;
    private String primercognom;
    private String segoncognom;
    private String dni;
    private ArrayList<String> telefon = null;
    private int edat;
    private int i = 0;
    private Domicili domicili;
    private ArrayList<Moduls> modul;
    
    public static final String DefNom = "Anonymous";
    public static final int DefEdat = 99;
    public static final String DefDNI = "00000000A";
    public static final String DefTelf = "977166322";
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Metodes">
      //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
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
        
        //COGNOMS
            //PRIMER COGNOM
        public String getPrimerCognom(){
            return primercognom;
        }
        public void setPrimerCognom(String primercognom){
            if(primercognom == null){
                throw new IllegalArgumentException(String.format("El cognom no pot ser null"));
            }
            this.primercognom = primercognom;
        }
            //SEGON COGNOM
        public String getSegonCognom(){
            return segoncognom;
        }
        public void setSegonCognom(String segoncognom){
            if(segoncognom == null){
                throw new IllegalArgumentException(String.format("El cognom no pot ser null"));
            }
            this.segoncognom = segoncognom;
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

        public String getDNI(){
            return dni;
        }
        public void setDNI(String dni){
            if(dni == null){
                throw new IllegalArgumentException(String.format("El valor no pot ser null."));
            }
            this.dni = dni;
        }
        
        //DNI

        public ArrayList<String> getTelefon(){
            return telefon;
        }
        public void setTelefon(ArrayList<String> telefon){
            if(telefon == null){
                throw new IllegalArgumentException(String.format("El telefon no pot tenir menys de 9 numeros."));
            }
            this.telefon = telefon;
        }
     
        //DOMICILI
        
        public Domicili getDomicili(){
            return domicili;
        }
        
        public void setDomicili(Domicili domicili){
            if(domicili == null){
                throw new IllegalArgumentException(String.format("El domicili no pot ser null."));
            }
            this.domicili = domicili;
        }
        
        //MODULS
        
        public ArrayList<Moduls> getModul(){
            return modul;
        }
        
        public void setModul(ArrayList<Moduls> modul){
            if(modul == null){
                throw new IllegalArgumentException(String.format("El modul no pot ser null."));
            }
            this.modul = modul;
        }
        

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructors">
        
        public Alumne(String nom, String primercognom, String segoncognom, String dni, int edat, ArrayList<String> telefon, Domicili domicili, ArrayList<Moduls> modul){
            
            this.setNom(nom);
            this.setPrimerCognom(primercognom);
            this.setSegonCognom(segoncognom);
            this.setDNI(dni);
            this.setEdat(edat);
            this.setTelefon(telefon);
            this.setDomicili(domicili);
            this.setModul(modul);
            
        }
        //Sense Telefon y Moduls
        public Alumne(String nom, String primercognom, String segoncognom, String dni, int edat, Domicili domicili){
            this(nom, primercognom, segoncognom, dni, edat, new ArrayList<String>(), domicili, new ArrayList<Moduls>());    
        }
        
        
        //Sense DNI
        public Alumne(String nom, String primercognom, String segoncognom, int edat, ArrayList<String> telefon, Domicili domicili, ArrayList<Moduls> modul){
            this(nom, primercognom, segoncognom, DefDNI, edat, telefon, domicili, modul);    
        }
        
        //Sense Edat i Dni
        public Alumne(String nom, String primercognom, String segoncognom, ArrayList<String> telefon, Domicili domicili, ArrayList<Moduls> modul){
            this(nom, primercognom, segoncognom, DefEdat, telefon, domicili, modul);
        }
         //Sense Edat, Dni, Telefon
        /*public Alumne(String nom, String primercognom, String segoncognom, int edat, Domicili domicili){
            this(nom, primercognom, segoncognom, edat, DefTelf, domicili);
        }
        
        //Sense Edat, Dni, Telefon
        public Alumne(String nom, String primercognom, String segoncognom, Domicili domicili){
            this(nom, primercognom, segoncognom, DefTelf, domicili);
        }*/
        
        /*//Alumne sin valores
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
       public Alumne(String dni, String nom, int edat){
            if(nom == null && edat < 3){
               this.setDNI(dni);
               this.setNom(DefNom);
               this.setEdat(DefEdat);
            }

         }
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
        }*/
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodes Estatics">
        public boolean potAfegirTelefon(String telf){
            if(this.getTelefon().size()<=3){
                return true;
            }
            return false;
        }
        
        public void agafaTelefon(String telf){
           try{
            if(potAfegirTelefon(telf)){
                this.telefon.add(telf);
                System.out.printf("%nTelefon %s afegit!%n", telf);
            }
           }catch(Exception t){
               System.err.printf("%n No es pot afegir el telefon %s%n", telf);
           }
        }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodes D'objectes">
        
        public String getSalutacio(){
            return String.format("Hola, sóc en/la %s amb la identificació %s i tinc %d anys", getNom(), getDNI(), getEdat());
        }
        public String getNomComplert(){
            return String.format("%n%s %s, %s", getPrimerCognom(), getSegonCognom(), getNom());
        }
        public String getAltresDades(){
            return String.format("%nDni: %s Edat: %d ", getDNI(), getEdat());
        }

        public String toEdatAdult(){
            return String.format(getEdat()>=18 ?"%nL'alumne " + getNom() +" "+ getPrimerCognom() + " es mayor d'edat" : "%nL'alumne " + getNom() +" "+ getPrimerCognom() + " es menor d'edat");
        }
        
        public String allTelefon(){
            return String.format("%nTelefons: %s" , getTelefon());
        }

        /*public String getModulsAl(){
            for(int j=0;j<modul.size();++j){
                 return String.format("%n %s %s %d", getModul().get(j).getNom(), getModul().get(j).getDescripcio(), getModul().get(j).getHores());
            }
        }*/

    //</editor-fold>

//</editor-fold>
    
}
