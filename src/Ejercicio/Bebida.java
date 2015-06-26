package Ejercicio;

public class Bebida {
    
    private String tipo;
    private String bebida[];
    
    public String[] ObtenerRecomendaciones(){
        if(this.tipo.equals("Alcoholicas")){
            String alcohol[]={"Vino","Cerveza","Vodka","Tequila","Wisky"};
            return alcohol;
        }else{
            String salcohol[]={"Jugo","Agua","Refresco","Cafe","Te"};
            return salcohol;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String[] getBebida() {
        return bebida;
    }

    public void setBebida(String[] bebida) {
        this.bebida = bebida;
    }
    
}
