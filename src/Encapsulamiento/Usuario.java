package Encapsulamiento;

public class Usuario {
    
    private String nombre;
    private int edad;
    
    public void setNombre(String x){
        
        this.nombre=x;
        
    }
    public void setEdad(int y){
        
        this.edad=y;
        
    }
    public String getNombre(){
        
        return nombre;
        
    }
    public int getEdad(){
        
        return edad;
        
    }
    
}
