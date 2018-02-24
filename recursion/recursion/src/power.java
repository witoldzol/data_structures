/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x17143853
 
public class power {
    
    public static int pwr(int x, int n){
        
        if(n==0){
            return 1;
        }
        else {
            
            return x * pwr(x , n-1);
        }
                
    }
    
    public static void main(String[] args){
        System.out.println(pwr(3,3));
    }

}
