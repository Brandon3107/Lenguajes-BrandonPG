package Herencia;

public class Zoologico {

    public static void main(String[] args) {
        
        Tortuga animal1=new Tortuga();
        animal1.setNombre("Caguama");
        animal1.setEdad(12);
        Leon animal2=new Leon();
        animal2.setNombre("Simba");
        animal2.setEdad(5);
        Delfin animal3=new Delfin();
        animal2.setNombre("Fliper");
        animal2.setEdad(05);
        Aguila animal4=new Aguila();
        animal2.setNombre("America");
        animal2.setEdad(38);
        
        System.err.println(Tortuga.class.getInterfaces());
    }
    
}
