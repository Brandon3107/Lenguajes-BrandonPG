package Thread;

public class Tercer extends Thread {
    
        public void run() {
        while(true){
            try{
                Thread.sleep(1000);
                System.out.println("Yo soy el Tercer Thread");
            }catch(InterruptedException ie){
            
            }
        }
        
    }
        
}
