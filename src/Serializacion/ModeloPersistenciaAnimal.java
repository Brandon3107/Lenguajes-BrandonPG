package Serializacion;

import java.io.*;

public class ModeloPersistenciaAnimal {
    
    public void Guardar(Animal animal) throws Exception{
        
        //Crear archivo en donde se guardara el animal
        File file=new File("D:\\animalitos.xxx");
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(animal);
        System.out.println("Animalito Comprimido con Exito");
        
    }
    
}
