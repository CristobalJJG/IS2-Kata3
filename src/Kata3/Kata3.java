package Kata3;

public class Kata3 {
    public static void main(String[] args){
        
        Histogram<String> histogram= new Histogram<>();
        
        String[] nombres = new String[]{"gmail.com","gmail.com", 
            "nano.es", "nano.es", "nano.es", "nano.es", "nano.es",
            "nano.es", "hotmail.com", "hotmail.com", "hotmail.com",
            "hotmail.com", "ulpgc.es","ulpgc.es","ulpgc.es", 
            "hotmail.es", "hotmail.es", "hotmail.es", "yahoo.com",
            "yahoo.com"};
        
        for (String nombre : nombres) {
            histogram.increment(nombre);
        }

        new HistogramDisplay(histogram).execute();    
    }
}
