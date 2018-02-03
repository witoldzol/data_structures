/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jvm;

/**
 *
 * @author cmuntean
 */
public class AnyClass {

    /**
     * @param args the command line arguments
     */
    public AnyClass() {

        System.out.println("In AnyClass constructor ");
        method1();
        System.out.println("Leaving AnyClass constructor ");
    }


    public void method1() {
        System.out.println("In method1");
        method2();
        System.out.println("Leaving method1");

    }

    public void method2() {
        System.out.println("In method2 ");
        /* spend some time in here */
        sleep(10000);
        System.out.println("Leaving method2 ");

    }


    private void sleep(long howLong) {
		// does nothing for the specified number of milliseconds
        long now = System.currentTimeMillis();
        long later = now + howLong;
        while (System.currentTimeMillis() < later )
         { }

    }


    public static void main (String args[]) {
      System.out.println("In main");
       AnyClass ax = new AnyClass();
       System.out.println("Finished");
    }
}
