/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x17143853
 
public class factorial {
   
    
    public static int fact(int n){
    
        if(n == 0){
            return 1;
        }
        else {
            return n * fact(n-1);
        }
        
    }
    
    public static void main(String[] args){
        
        System.out.println(fact(14));
        
        
    }
}

