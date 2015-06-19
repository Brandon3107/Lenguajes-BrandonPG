package Excepciones;

public class ValidarEdad {
    
    public static void validar(int edad) throws MenorDeEdadException, PendejoException{
        
        if((edad<18)&&(edad>=1)) throw new MenorDeEdadException();
        if(edad<=0) throw new PendejoException();
        
    }
    
}
