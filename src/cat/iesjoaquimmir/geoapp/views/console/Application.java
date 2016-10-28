/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.views.console;

import cat.iesjoaquimmir.geoapp.model.businesslayer.alumnes.Alumne;
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
                + "%n Escoge: ");
        calcul = input.nextInt();
        }while(calcul < 1 || calcul > 7);
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
        }
    }
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
            
        Alumne a1 = new Alumne(nom, edat, dni);
        //System.out.printf("Nom: %s Edat: %d DNI: %s", a1.getNom(), a1.getEdat(), a1.getDNI());
        System.out.printf("%n %s %n", a1.getSalutacio());
    }
     
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
            
        Alumne a2 = new Alumne( edat, dni);
        System.out.printf("%n %s %n", a2.getSalutacio());
    }
    
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
            
        Alumne a3 = new Alumne(nom, dni);
        System.out.printf("%n %s %n", a3.getSalutacio());
    }
    
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
            
        Alumne a4 = new Alumne(nom, edat);
        System.out.printf("%n %s %n", a4.getSalutacio());
    }
    
   public static void senseNomDNI(){
        Scanner  input = new Scanner(System.in);
        int edat;

        //Edat
        System.out.printf("Dime la teva edat: ");    
        edat = input.nextInt();
            
        Alumne a5 = new Alumne(edat);
        System.out.printf("%n %s %n", a5.getSalutacio());
    }
   
   public static void senseEdatDNI(){
        Scanner  input = new Scanner(System.in);
        String nom;
        //Nom
        System.out.printf("Dime el teu nom: ");    
        nom = input.next();
        
        Alumne a6 = new Alumne(nom);
        System.out.printf("%n %s %n", a6.getSalutacio());
    }
   
   public static void senseNomEdat(){
        Scanner  input = new Scanner(System.in);

        String dni;

        //Dni
        System.out.printf("Dime el teu dni: ");    
        dni = input.next();
        
        Alumne a7 = new Alumne(dni);
        System.out.printf("%n %s %n", a7.getSalutacio());
    }
}