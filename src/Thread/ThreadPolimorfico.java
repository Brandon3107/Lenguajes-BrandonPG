package Thread;

import java.util.Calendar;

public class ThreadPolimorfico implements  Runnable{

    public static void main(String[] args) {
        
        Runnable r=new ThreadPolimorfico();
        Thread t1=new Thread(r);
        t1.start();
        
    }

    public void run() {
        
        while(true){
            try{
                Thread.sleep(1000);
                Calendar c=Calendar.getInstance();
                int hrs=c.get(Calendar.HOUR);
                int min=c.get(Calendar.MINUTE);
                int seg=c.get(Calendar.SECOND);
                System.out.println(hrs+":"+min+":"+seg);
            }catch(Exception e){
                
            }
        }
        
    }
    
}
