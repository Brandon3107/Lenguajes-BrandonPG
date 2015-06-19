package Excepciones;

public class TamanoValidar {
    
    public static void validar(int tamano) throws TamanoException{
        
        if((tamano<4)||(tamano>10)) throw new TamanoException();
        
    }
    
}