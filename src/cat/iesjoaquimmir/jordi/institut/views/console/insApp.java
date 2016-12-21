

package cat.iesjoaquimmir.jordi.institut.views.console;

import cat.iesjoaquimmir.jordi.institut.alumnes.Alumne;
import cat.iesjoaquimmir.jordi.institut.alumnes.Domicili;
import cat.iesjoaquimmir.jordi.institut.alumnes.Moduls;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class insApp {

    public static ArrayList<String> telefon = new ArrayList<String>();
    public static ArrayList<Moduls> modulos = new ArrayList<>();
    public static String telf = null;
    public static Alumne alumne;
    
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
       
        
        
        
       int continuar;
       //Variables Alumne
       String nom = null;
       String primercognom;
       String segoncognom;
       String dni = null;
       int edat;
       //Variables Moduls
       String nomModul;
       String descModul;
       int horesModul;
       //Variables domicili
       String carrer;
       int numcasa = 0;
       String postal;
       String poble;
       String ciutat;
       
       //<editor-fold defaultstate="collapsed" desc="Alumne">
       
       try{
       System.out.printf("Nom del alumne: ");
       nom = input.nextLine();
       provocoNomA(nom);
       }catch(Exception ca){
           System.err.printf("\nEl nom afegit no pot ser null.\n");
           main(args);
       }
       
       System.out.printf("Primer cognom del alumne: ");
       primercognom = input.nextLine();
       System.out.printf("Segon cognom del alumne: ");
       segoncognom = input.nextLine();
       try{
       System.out.printf("Dni: ");
       dni = input.nextLine();
       provocoNIF(dni);
       }catch(InputMismatchException nif){
           nif.printStackTrace();
           main(args);
       }catch(Exception nif){
           nif.printStackTrace();
       }finally{
           
       }
        System.out.printf("Edat del alumne: ");
        edat = input.nextInt();
        
       //</editor-fold>
       //<editor-fold defaultstate="collapsed" desc="Domicili">
       System.out.printf("Carrer: ");
       carrer = input.next();
       
       try{
       System.out.printf("Numero de la casa: ");
       numcasa = input.nextInt();
       provocoNumCasa(numcasa);
       }catch(myErrors n){
        n.printStackTrace();
       }catch(InputMismatchException n){
        System.err.printf("El valor introduit, no es un numero!\n");
       }

       System.out.printf("Codi postal: ");
       postal = input.next();
       System.out.printf("Poble: ");
       poble = input.next();
       System.out.printf("Provincia: ");
       ciutat = input.next();
       //</editor-fold>
       Domicili domicili = new Domicili(carrer, numcasa, postal, poble, ciutat);
       Alumne alumne = new Alumne(nom, primercognom, segoncognom, dni, edat , domicili);
       //<editor-fold defaultstate="collapsed" desc="Telefon">
       
       
        do{
        
        try{
            System.out.printf("Afegeix el teu telefon [9 Numeros]: ");
            telf = input.next();
            alumne.agafaTelefon(telf);
            provocoTelf(telf);
        }catch(Exception t){
            System.err.printf("\nEl telefon %s afegit te la llargada erronea.\n", telf);
            t.printStackTrace();
        }
        
        System.out.printf("Quieres seguir? (SI -> 1 | NO -> 0)");
        continuar = input.nextInt();
        }while(continuar != 0);
        showList(alumne.getTelefon());

       
       continuar = 1;
       //</editor-fold>
       //<editor-fold defaultstate="collapsed" desc="Modulos">
       try{
        do{
        System.out.printf("Nom del modul: ");
        nomModul = input.next();
        System.out.printf("Descripcio del modul: ");
        descModul = input.next();
        System.out.printf("Hores del modul: ");
        horesModul = input.nextInt();

        Moduls mod = new Moduls(nomModul, descModul, horesModul);
        modulos.add(mod);

        provocoModuls(modulos);

        System.out.printf("Quieres seguir? (SI -> 1 | NO -> 0)");
        continuar = input.nextInt();
        }while(continuar != 0);
       }catch(Exception m){
           m.printStackTrace();
       }
       //</editor-fold>
       
       
       
       
       
       System.out.printf("%n%nAlumne:");
       //Mostra el format Cognom1, Cognom2, Nom
       System.out.printf(alumne.getNomComplert());
       //Altres dades
       System.out.printf(alumne.getAltresDades());
       //Mostrar telefon
       System.out.printf("%nForma 1: %n");
       for(int j=0;j<telefon.size();++j){
           System.out.printf("Telefon %d: %s %n" , j+1, alumne.getTelefon().get(j));
       }
       System.out.printf("Forma 2: ");
       System.out.printf(alumne.allTelefon());
       
       //Mostrar edat
       System.out.printf(alumne.toEdatAdult());
       
       //Domicili
       System.out.printf("%n%nDomicili: %n");
       System.out.printf(domicili.getDomiciliAmigable());
       //Pinta el mateix que la linia anterior
       System.out.printf(alumne.getDomicili().getDomiciliAmigable());

       //Moduls
       System.out.printf("%n%nModuls: %n");
       //System.out.printf(alumne.getModulsAl());
       
       for(int j=0;j<modulos.size();++j){
           System.out.printf("Modul %d: %s %s %d %n" , j+1, modulos.get(j).getNom(), modulos.get(j).getDescripcio(), modulos.get(j).getHores());
       }
       //Printar otro alumne
       //System.out.printf("%n%nVols afegir un altra alumne?");
 
   }
    
    private static void showList(ArrayList<String> telefon){
       System.out.printf("\n--------------");
       for(int i=0;i<telefon.size();i++){
           System.out.printf("\nTelefon %d: %s " , i+1, telefon.get(i));
       }
       System.out.printf("\n--------------\n");
       System.out.printf("");
   }
    
    public static void provocoNumCasa(int valor) throws myErrors{
        if(valor < 0) throw new myErrors(valor);
    }
    
    public static void provocoNomA(String valor) throws Exception{
        if(valor.isEmpty()) throw new Exception(String.format("El nom es obligatori"));
    }
    
    public static void provocoNIF(String valor) throws Exception, InputMismatchException{
        if(valor.isEmpty()){
            throw new InputMismatchException(String.format("El dni no pot ser null."));
        }else if(valor.length() < 9 || valor.length() > 9){
            throw new Exception(String.format("El dni %s no te la llargada adecuada.", valor));
        }
    }
    
    public static void provocoTelf(String tlfs) throws Exception{
        
        if(tlfs.length() < 9 || tlfs.length() > 9){ 
            throw new Exception();
        }
        
        //telefon.add(telf);
        //System.out.printf("\nTelefon: %s afegit.\n", telf);
    }
    
    public static void provocoModuls(ArrayList<Moduls> valor) throws Exception{
        int numModuls = modulos.size()-1;
        if(valor.size()<1){
            modulos.remove(numModuls);
            throw new Exception(String.format("Te que tenir minim un modul."));
        }else if(valor.size()>13){
            modulos.remove(numModuls);
            throw new Exception(String.format("No pot tenir més de 13 moduls."));
        }
    }
    
}
