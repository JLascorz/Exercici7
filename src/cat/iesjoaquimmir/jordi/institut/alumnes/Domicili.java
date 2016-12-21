

package cat.iesjoaquimmir.jordi.institut.alumnes;

public class Domicili {
    
//<editor-fold defaultstate="collapsed" desc="Atributs">
    private String carrer;
    private int numero;
    private String pis;
    private String codipostal;
    private String poblacio;
    private String provincia;
    
    public static final String DEF_PIS= "2a";
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Metodes">
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
        //CARRER
        public String getCarrer(){
            return carrer;
        }
        public void setCarrer(String carrer){
            if(carrer == null){
                throw new IllegalArgumentException(String.format("El carrer no puede ser null."));
            }
            this.carrer = carrer;
        }
        //NUMERO
        public int getNumero(){
            return numero;
        }
        public void setNumero(int numero){
            if(numero == 0){
                throw new IllegalArgumentException(String.format("El numero no pot ser 0 o menor."));
            }
            this.numero = numero;
        }
        //PIS
        public String getPis(){
            return pis;
        }
        public void setPis(String pis){
            if(pis == null){
                throw new IllegalArgumentException(String.format("El pis no pot ser null."));
            }
            this.pis = pis;
        }
        //CODI POSTAL
        public String getCodiPostal(){
            return codipostal;
        }
        public void setCodiPostal(String codipostal){
            if(codipostal.length() == 0){
                throw new IllegalArgumentException(String.format("El codi postal no pot tenir menys de 5 numeros."));
            }
            this.codipostal = codipostal;
        }
        //POBLACIO
        public String getPoblacio(){
            return poblacio;
        }
        public void setPoblacio(String poblacio){
            if(poblacio == null){
                throw new IllegalArgumentException(String.format("La poblacio no pot ser null."));
            }
            this.poblacio = poblacio;
        }
        //PROVINCIA
        public String getProvincia(){
            return poblacio;
        }
        public void setProvincia(String provincia){
            if(provincia == null){
                throw new IllegalArgumentException(String.format("La provincia no pot ser null."));
            }
            this.provincia = provincia;
        }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructors">
        public Domicili(String carrer, int numero, String pis, String codipostal, String poblacio, String provincia){
            this.setCarrer(carrer);
            this.setNumero(numero);
            this.setPis(pis);
            this.setCodiPostal(codipostal);
            this.setPoblacio(poblacio);
            this.setProvincia(provincia);
        }
        
        public Domicili(String carrer, int numero,  String codipostal, String poblacio, String provincia){
            this(carrer, numero, DEF_PIS, codipostal, poblacio, provincia);
            /*this.setCarrer(carrer);
            this.setNumero(numero);
            this.setPis(DEF_PIS);
            this.setCodiPostal(codipostal);
            this.setPoblacio(poblacio);
            this.setProvincia(provincia);*/
        }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodes D'objectes">
        
        public String getDomiciliAmigable(){
            return String.format("%s, %d, %s, %s, %s, %s%n", carrer, numero, pis, codipostal, poblacio, provincia);
        }
        

    //</editor-fold>
//</editor-fold>
}
