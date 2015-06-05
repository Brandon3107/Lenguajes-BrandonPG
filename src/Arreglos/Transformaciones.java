package Arreglos;

public class Transformaciones {
    
    Ejercicio nunu=new Ejercicio();
    
    String letra;
    byte xy;
    byte z[];
    int aaa;
    

    public void setLetra(String y){
        this.letra=y;
    }
    
    public void setNumero(byte y){
        this.xy=y;
    }
    
    public String getNumero(){
        byte letnum[]=letra.getBytes();
        this.aaa=letnum.length;
        for(int h=0;h<aaa;h++){
        z=letnum;
        }
        return (""+z[0]);
    }
    
    public String getLetra(){
        return (""+(char)xy);
    }
}
