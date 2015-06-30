package Ejercicio2;

public class ValidarPorcentaje{

    public static void ValidarPorcentaje(ExamenParcial ep, ExamenFinal ef) throws PorcentajeException{
        float pex=ep.getPorcentaje()+ef.getPorcentaje();
        if(pex!=1) throw new PorcentajeException();
        
    }
    
    
}
