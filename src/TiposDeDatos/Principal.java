package TiposDeDatos;

public class Principal {

    public static void main(String[] args) {
        
        Floats prueba=new Floats();
        Integer entero=new Integer("3");
        Float flotante=new Float("7.0");
        String hola="Hola";
        String hola2=new String("Hola");
        int enteros[]={4,24,12,-7};
        String bb[]={"uno","dos","tres","cuatro"};
        int mas[]=new int[3];
        
        float operacion=entero+flotante;
        System.out.println(operacion);
        prueba.prueba();
        System.out.println(bb.length);
        
    }
    
}
