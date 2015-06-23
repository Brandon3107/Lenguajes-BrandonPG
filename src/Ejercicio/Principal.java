package Ejercicio;

public class Principal {

    public static void main(String[] args) {
        
        String nombre="Juan";
        int edad=42;
        String email="jcampos@gmail.com";
        int cp=55130;
        String municipio="Ecatepec";
        
        Direccion dir=new Direccion(cp,municipio);
        Usuario usu=new Usuario(nombre,edad,email,dir);
        
        System.out.println("Nombre: "+usu.getNombre());
        System.out.println("Edad: "+usu.getEdad());
        System.out.println("Email: "+usu.getEmail());
        System.out.println("Municipio: "+usu.getDireccion().getMunicipio());
        System.out.println("CP: "+usu.getDireccion().getCp());
    }
    
}
