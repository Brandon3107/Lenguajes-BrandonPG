package Ejercicio2;

public class FinCuatri {

    public static void main(String[] args) {
        
        ExamenParcial parcial=new ExamenParcial();
        
        parcial.setCalificacion(10);
        parcial.setPorcentaje(.9f);
        
        ExamenFinal final1=new ExamenFinal();
        
        final1.setCalificacion(10);
        final1.setPorcentaje(.2f);
        
        ModeloEvaluacion evaluacion=new ModeloEvaluacion();
        
        evaluacion.evaluar(parcial, final1);
        
    }
    
}
