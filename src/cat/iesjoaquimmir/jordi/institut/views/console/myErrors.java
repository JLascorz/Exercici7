

package cat.iesjoaquimmir.jordi.institut.views.console;

public class myErrors extends Exception {

//<editor-fold defaultstate="collapsed" desc="Atributos">
        private Integer numC;

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Getters/Setters">

        public Integer getNumC() {
            return numC;
        }
        public void setNumC(Integer numC) {
            this.numC = numC;
        }
        
//</editor-fold>

        public myErrors (int n){
            numC = new Integer(n);
        }

        @Override
        public String toString(){
            return "Exception myErrors: Error motivat per valor = " + numC.toString();
        }
        

}
