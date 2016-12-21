/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.jordi.institut.views.console;
import java.util.ArrayList;
import cat.iesjoaquimmir.jordi.institut.alumnes.Alumne;
import cat.iesjoaquimmir.jordi.institut.alumnes.Domicili;
import cat.iesjoaquimmir.jordi.institut.alumnes.Moduls;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
         int calcul = 0;
                      
        do{        
        System.out.printf(" 1. Totes les dades."
                + "%n 2. No vull posar el nom. "
                + "%n 3. No vull posar l'edat. "
                + "%n 4. No vull posar el dni. "
                + "%n 5. No vull posar el nom i el dni. "
                + "%n 6. No vull posar l'edat i el dni."
                + "%n 7. No vull posar el nom i l'edat."
                + "%n 8. Domicili amb alumne(Ultimo Ejercicio)."
                + "%n Escoge: ");
        calcul = input.nextInt();
        }while(calcul < 1 || calcul > 8);
     switch(calcul){        

       case 1:
           tot();
       break;

       case 2:
           senseNom();
       break;

       case 3:      
           senseEdat();
       break;

       case 4:      
           senseDNI();
       break;
       
       case 5:      
           senseNomDNI();
       break;

       case 6:      
           senseEdatDNI();
       break;
       
       case 7:      
           senseNomEdat();
       break;
       
       case 8:
           domiAlumne();
       break;
        }
    }
   // Case 1  
   public static void tot(){
         Scanner  input = new Scanner(System.in);
        String nom;
        int edat;
        String dni;
        //Nom
        System.out.printf("Dime el teu nom: ");    
        nom = input.next();
        //Edat
        System.out.printf("Dime la teva edat: ");    
        edat = input.nextInt();
        //Dni
        System.out.printf("Dime el teu dni: ");    
        dni = input.next();
            
        /*Alumne a1 = new Alumne(nom, edat, dni);
        //System.out.printf("Nom: %s Edat: %d DNI: %s", a1.getNom(), a1.getEdat(), a1.getDNI());
        System.out.printf("%n %s %n", a1.getSalutacio());*/
    }
   // Case 2  
   public static void senseNom(){
        Scanner  input = new Scanner(System.in);
        int edat;
        String dni;

        //Edat
        System.out.printf("Dime la teva edat: ");    
        edat = input.nextInt();
        //Dni
        System.out.printf("Dime el teu dni: ");    
        dni = input.next();
            
        /*Alumne a2 = new Alumne( edat, dni);
        System.out.printf("%n %s %n", a2.getSalutacio());*/
    }
   // Case 3 
   public static void senseEdat(){
        Scanner  input = new Scanner(System.in);
        String nom;
        String dni;

        //Nom
        System.out.printf("Dime el teu nom: ");    
        nom = input.next();
        //Dni
        System.out.printf("Dime el teu dni: ");    
        dni = input.next();
            
        /*Alumne a3 = new Alumne(nom, dni);
        System.out.printf("%n %s %n", a3.getSalutacio());*/
    }
   // Case 4
   public static void senseDNI(){
        Scanner  input = new Scanner(System.in);
        String nom;
        int edat;

        //Nom
        System.out.printf("Dime el teu nom: ");    
        nom = input.next();
        //Edat
        System.out.printf("Dime la teva edat: ");    
        edat = input.nextInt();
            
        /*Alumne a4 = new Alumne(nom, edat);
        System.out.printf("%n %s %n", a4.getSalutacio());*/
    }
   // Case 5 
   public static void senseNomDNI(){
        Scanner  input = new Scanner(System.in);
        int edat;

        //Edat
        System.out.printf("Dime la teva edat: ");    
        edat = input.nextInt();
            
        /*Alumne a5 = new Alumne(edat);
        System.out.printf("%n %s %n", a5.getSalutacio());*/
    }
   // Case 6
   public static void senseEdatDNI(){
        Scanner  input = new Scanner(System.in);
        String nom;
        //Nom
        System.out.printf("Dime el teu nom: ");    
        nom = input.next();
        
        /*Alumne a6 = new Alumne(nom);
        System.out.printf("%n %s %n", a6.getSalutacio());*/
    }
   // Case 7
   public static void senseNomEdat(){
        Scanner  input = new Scanner(System.in);

        String dni;
        String nom = null;
        int edat = 0;
        //Dni
        System.out.printf("Dime el teu dni: ");    
        dni = input.next();
        
        /*Alumne a7 = new Alumne(dni, nom, edat);
        System.out.printf("%n %s %n", a7.getSalutacio());*/
    }
   // Case 8
   public static void domiAlumne(){
       Scanner  input = new Scanner(System.in);
       
        ArrayList<String> telefon = new ArrayList<String>();
        ArrayList<Moduls> modulos = new ArrayList<>();
        
       int continuar;
       //Variables Alumne
       String nom;
       String primercognom;
       String segoncognom;
       String dni;
       int edat;
       //Variables Moduls
       String nomModul;
       String descModul;
       int horesModul;
       
       //Preguntes
       System.out.printf("Nom del alumne: ");
       nom = input.nextLine();
       System.out.printf("Primer cognom del alumne: ");
       primercognom = input.next();
       System.out.printf("Segon cognom del alumne: ");
       segoncognom = input.next();
       System.out.printf("Dni: ");
       dni = input.next();
       System.out.printf("Edat del alumne: ");
       edat = input.nextInt();
       
       //PREGUNTAR TELEFON
       do{
           String telf;
       System.out.printf("Afegeix el teu telefon [9 Numeros]: ");
       telf = input.next();
       telefon.add(telf);
       showList(telefon);
       System.out.printf("Quieres seguir? (SI -> 1 | NO -> 0)");
       continuar = input.nextInt();
       }while(continuar != 0);
       
       continuar = 1;
       //PREGUNTAR MODULS
       do{
       System.out.printf("Nom del modul: ");
       nomModul = input.next();
       System.out.printf("Descripcio del modul: ");
       descModul = input.next();
       System.out.printf("Hores del modul: ");
       horesModul = input.nextInt();
       
       Moduls mod = new Moduls(nomModul, descModul, horesModul);
       
       modulos.add(mod);
       
       System.out.printf("Quieres seguir? (SI -> 1 | NO -> 0)");
       continuar = input.nextInt();
       }while(continuar != 0);
       
       
       Domicili domicili = new Domicili("Industria", 188, "08800", "Vilanova i la Geltru", "Barcelona");
       Alumne alumne = new Alumne(nom, primercognom, segoncognom, dni, edat, telefon , domicili, modulos);
       
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
       for(int i=0;i<telefon.size();++i){
           System.out.printf("\nElement %d: %s " , i+1, telefon.get(i));
       }
       System.out.printf("\n--------------\n");
       System.out.printf("");
   }
}