/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.es.vaimeufilho;

import java.util.HashMap;

/**
 *
 * @author 1998547
 */
public class Calculadora {
    
    private HashMap<String,Integer> mapaNumeros;
    
    public Calculadora(){
        mapaNumeros = new HashMap<String,Integer>();
        mapaNumeros.put("I", 1);
        mapaNumeros.put("V", 5);
        mapaNumeros.put("X", 10);
        mapaNumeros.put("L", 50);
        mapaNumeros.put("C", 100);    
        mapaNumeros.put("D", 500);    
        mapaNumeros.put("M", 1000);    
    }
    
  
    public int calcular (String romano){
        char Rom[] = {' ','I','V','X','L','C','D','M'};
        int valor [] = {0,1,5,10,50,100,500,1000};
        int ant = 0;
        int soma = 0;
        char letra = ' ';
        for(int i=0;i<romano.length();i++){//percorrrer numero romano
            letra = romano.charAt(i);
            for(int j=0;j<Rom.length;j++){//percorrer array Rom
                if(letra==Rom[j]){
                        soma = soma + valor[j];
                    if(ant<valor[j]){//se o valor da letra anterior é menor que o valor da letra atual
                        soma = soma - ant*2;//subtrair duas vezes o menor dos dois
                        ant = valor[j];
                    }
                }
            }
        }
        return soma;
   } 

    
     
        
}
    

