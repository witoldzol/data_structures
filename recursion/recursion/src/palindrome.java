
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x17143853
 
public class palindrome {
    
    public static boolean isPali(String word){
        
        if(word.length() == 0 || word.length() == 1){
            return true;
        } else {
            if(word.charAt(0) != word.charAt(word.length() - 1) ){
                return false;
            }
            System.out.println("new word is: " + word);
            return isPali(word.substring(1, word.length()-1));
        }
    }
    
   public static String reverse(String str) 
    {     
        if ((str==null)||(str.length() <= 1) )
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
    
   
    
    public static void main(String[] args){
        System.out.println(test("laep"));
    }
    
}
