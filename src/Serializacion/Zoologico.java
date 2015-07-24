package Serializacion;

public class Zoologico {

    public static void main(String[] args) throws Exception{
        
        ModeloPersistenciaAnimal mpa=new ModeloPersistenciaAnimal();
        Animal aa=new Animal();
        aa.setNombre("delfin");
        aa.setCarnivoro(true);
        mpa.Guardar(aa);
    for(Animal a:mpa.BuscarTodos()){
        System.out.println(a.getNombre());
    }

        
    }
    
}
