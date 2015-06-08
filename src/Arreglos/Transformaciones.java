package Arreglos;

import java.math.BigInteger;

public class Transformaciones {
    
    String letra;
    String numero;
    int z[];
    byte letnum[],numlet[];
    

    public void setLetra(String y){
        this.letra=y;
    }
    
    public void setNumero(String y){
        this.numero=y;
    }
    
    public String getNumero(){
        this.letnum=letra.getBytes();
        StringBuilder letranumero=new StringBuilder();
        for(byte m:letnum){
            letranumero.append(m);
            letranumero.append(" ");
        }
        return (""+letranumero.toString());
    }
    
    public String getLetra(){
        this.numlet=numero.getBytes();
        StringBuilder xyz=new StringBuilder();
        StringBuilder numeroletra=new StringBuilder();
        byte zyx;
        for(byte m:numlet){
            if(m!=32){
                xyz.append((char)m);
                
            }else{
                Byte ascii=new Byte(xyz.toString());
                char b=(char)ascii.byteValue();
                xyz.delete(0, xyz.length());
                numeroletra.append(b);
                numeroletra.append(" ");
            }
        }
        return (""+numeroletra.toString());
        //return (""+(char)xy);
    }
}
