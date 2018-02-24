/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x17143853
 
public class fibonacci {
    
    public static int fibonacci (int n){
        int fib;
        if((n == 1) || ( n== 2)){
            fib =1;
        }
        else{
            fib = fibonacci(n-1) + fibonacci(n - 2);
        }
        return fib;
    }
    
    public static void main(String[] args){
        int n = 12;
        
        System.out.println(fibonacci(n));
        
    }
    
}

* */