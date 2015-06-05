package Arreglos;

public class Probar {

    public static void main(String[] args) {
        
        int x[]={1,45,-12,7}; //Primer forma de arreglo
        int y[]=new int[3]; //Segunda forma de arreglo
        y[0]=34;
        y[1]=12;
        y[2]=45;
        int z[]=new int[]{3,-12,9}; //Tercer forma de arreglo
        String hola="hola";
        byte algo[]=hola.getBytes();
        
        for(int i=0;i<x.length;i++){
            System.out.println("Este elemento tiene un valor de: "+x[i]);
        }
        for(int m:algo){
            System.out.println("Este elemento tiene un valor de: "+(char)m);
        }
        
        
        
    }
    
}
