package ExceptionChecked;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProbarExcepciones {

    public static void main(String[] args) {
        
        //Primer Excepcion: FileNotFoundException (Es posible que el archivo no exista)
        File f=new File("Archivaldo");
        try {
            FileOutputStream fos=new FileOutputStream(f);
            //Segunda Excepcion: IOException (Es posible que no se pueda escribir en el archivo)
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            } catch (FileNotFoundException ex) {
                
            } catch (IOException ex) {
            
            //Tercera Excepcion: Exception (Cualquier posible excepcion que pueda oscurrir)
            } catch (Exception ex) {

        }
             
    }
    
}

