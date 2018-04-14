/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createtextfiletest;

/**
 *
 * @author HP
 */
public class CreateTextFileTest
{
   public static void main( String[] args )
   {
      CreateTextFile application = new CreateTextFile();

      application.openFile();
      application.addRecords();
      application.closeFile();
   } // end main
} // end class CreateTextFileTest