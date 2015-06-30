package Ejercicio2;

public class ModeloEvaluacion {
    
    public void evaluar(ExamenParcial xparcial, ExamenFinal xfinal){
        try{
            ValidarPorcentaje.ValidarPorcentaje(xparcial, xfinal);
            float calificacion=(xparcial.getCalificacion()*xparcial.getPorcentaje())+(xfinal.getCalificacion()*xfinal.getPorcentaje());
            System.out.println("Tu calificacion es: "+calificacion);
        } catch (PorcentajeException ex) {
            System.err.println(ex.getMessage()+"("+((xparcial.getPorcentaje()+xfinal.getPorcentaje())*100)+"%)");
        }

    }
    
}
