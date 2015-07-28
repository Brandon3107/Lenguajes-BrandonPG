package Thread;

public class Segundo extends Thread {
    
        public void run() {
        while(true){
            try{
                Thread.sleep(1000);
                System.out.println("Yo soy el segundo Thread");
            }catch(InterruptedException ie){
            
            }
        }
        
    }
        
}
