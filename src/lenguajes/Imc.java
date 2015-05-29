/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes;

/**
 *
 * @author T-107
 */
public class Imc {
    
    private float peso;
    private float altura;
    
    /*public Imc(float a, float b){
        
        peso=80;
        altura=1.68f;
        
    }*/
    public String calcular(){
        
        float imc=peso/(altura*altura);
        return "Tu IMC es: "+imc;
        
    }
    public Imc(){
        
    }
    public void setPeso(float x){
        
        this.peso=x;
        
    }
    public void setAltura(float y){
        
        this.altura=y;
        
    }
    public float getPeso(){
        
        return peso;
        
    }
    public float getAltura(){
        
        return altura;
        
    }

}
