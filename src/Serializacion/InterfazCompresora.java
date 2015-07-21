package Serializacion;

public class InterfazCompresora {

    public static void main(String[] args) {
        
        Animal animal=new Animal();
        animal.setNombre("Leon");
        animal.setCarnivoro(true);
        
        ModeloPersistenciaAnimal mpa=new ModeloPersistenciaAnimal();
        try{
            mpa.Guardar(animal);
        }catch(Exception e){
            System.out.println("Error al guardar");
        }

        
    }
    
}
