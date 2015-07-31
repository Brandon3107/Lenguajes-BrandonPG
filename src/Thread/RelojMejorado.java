package Thread;

import java.util.Calendar;

public class RelojMejorado {

    public static void main(String[] args) {
        
        Thread t1=new Thread(new Runnable() {
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
        });
        t1.start();
        
    }
    
}
