package Serializacion;

import java.io.*;
import java.util.ArrayList;

public class ModeloPersistenciaAnimales {
    
    String ruta="D:\\animales.xxx";
    String rutanimales;
    Animal animal;
    ArrayList<Animal> animales;

    public ModeloPersistenciaAnimales() {
        this.animales = new ArrayList<Animal>();
    }
    
    
    
    public void Guardar(Animal animal) throws Exception{
        
        //Crear archivo en donde se guardara el animal
        File file=new File(ruta);
        if(file.exists()){
           animales=  BuscarTodos();
        }
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        animales.add(animal);
        oos.writeObject(animales);
        File file2=new File(rutanimales);
        FileOutputStream fos2=new FileOutputStream(file2);
        ObjectOutputStream oos2=new ObjectOutputStream(fos2);
        oos.writeObject(animal);
        System.out.println("Animalito Comprimido con Exito");
        
    }
    
    public ArrayList<Animal> BuscarTodos() throws Exception{
     
        File file=new File(ruta);
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        animales=(ArrayList<Animal>) ois.readObject();
        return animales;
    }
    
}
