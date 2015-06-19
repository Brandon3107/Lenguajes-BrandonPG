package Excepciones;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ProbarValidacion {

    public static void main(String[] args) {
        
        int edad=8;
        System.out.println("Vamos a validar tu edad.");
        try {
            ValidarEdad.validar(edad);
            System.out.println("Bien, puedes pasar.");
        } catch (MenorDeEdadException ex) {
            System.err.println(ex.getMessage());
        } catch (PendejoException ex) {
            Logger.getLogger(ProbarValidacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
