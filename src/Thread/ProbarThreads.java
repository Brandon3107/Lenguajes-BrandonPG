package Thread;

public class ProbarThreads {

    public static void main(String[] args) {
        
        //Paso 1: Creamos el Thread
        Primer p1=new Primer();
        Segundo s2=new Segundo();
        Tercer t3=new Tercer();
        
        //Paso 2: Iniciamos el Thread
        p1.start();
        s2.start();
        t3.start();
        
        //Paso 3 y 4: Se inician por el Thread en el paso 2
        
    }
    
}
