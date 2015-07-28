package Thread;

//1° Forma: Heredando un Thread
public class Primer extends Thread{
    
    public void run() {
        while(true){
            try{
                Thread.sleep(1000);
                System.out.println("Yo soy el primer Thread");
            }catch(InterruptedException ie){
            
            }
        }
        
    }
    
}
