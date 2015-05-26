package Constructores;

import javax.swing.JFrame;

public class ProbarTodo {

    public static void main(String[] args) {
        
        Test1 objeto1=new Test1(5);
        Test1 objeto2=new Test1();
        JFrame ventana=new JFrame("Mi primer ventana");
        
        ventana.setSize(400, 400);
        ventana.setVisible(true);
        
    }
    
}
