/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package t9exercises;

public class T9Exercises {

   public static int twotothepowerof(int x) {
         if (x == 0)
		return 1;
	else
		return 2* twotothepowerof(x-1);

     }

	public static int power(int base, int exp) {
         // returns base to the power of exp
         if (exp == 1)
		return base;
	else
		return base * power (base, exp-1);

      }

    public static void reverseString(String string) {
         if (string.length() > 0) {
             System.out.print(string.substring(string.length()- 1));
            reverseString(string.substring(0, string.length()- 1));
        }
    }


     public static boolean isPalindrome(String inString) {

         if (inString.length()<=1)
	  return true;
	else
   {
    if (inString.charAt(0)!=inString.charAt(inString.length()-1))
	    return false;
	 else
	    return isPalindrome (inString.substring(1, inString.length()-1));
   }

     }
         /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("2**8 is " + twotothepowerof(8));
	  System.out.println("4**3 is " + power(4,3));
	  System.out.println("Reverse of cat is:");
          reverseString("cat");
          System.out.println(" ");
        System.out.println("LEVEL is palindrome " + isPalindrome("LEVEL"));
        System.out.println("MAMMAM is palindrome " + isPalindrome("MAMMAM"));
        System.out.println("ABCDEFG is palindrome " + isPalindrome("ABCDEFG"));
    }


}