
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x17143853
 */

public class TowersOfHanoi {

    public void solve(int n, String start, String mid, String end){
    
        if(n==1){
            System.out.println(start + "->" + end);
        }
        else{
            solve(n-1, start, end, mid);
            System.out.println(start + "->" + end);
            solve(n-1, mid, start, end);
        }
    }
    
    
   public static void main(String[] args) {
       TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
       System.out.print("Enter number of discs: ");
       Scanner scanner = new Scanner(System.in);
       int discs = scanner.nextInt();
       towersOfHanoi.solve(discs, "A", "B", "C");
   }
}