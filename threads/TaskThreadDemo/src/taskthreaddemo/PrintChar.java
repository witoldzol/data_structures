/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskthreaddemo;

/**
 *
 * @author munaw
 */
// The task for printing a specified character in specified times
class PrintChar implements Runnable {
  private char charToPrint; // The character to print
  private int times; // The times to repeat

  /** Construct a task with specified character and number of
   *  times to print the character
   */
  public PrintChar(char c, int t) {
    charToPrint = c;
    times = t;
  }

  @Override /** Override the run() method to tell the system
   *  what the task to perform
   */
  public void run() {
    for (int i = 0; i < times; i++)(){
      System.out.println(i + "\t" + charToPrint);
      try {
      if (i >= 10) Thread.sleep(1000);
    }
    catch (InterruptedException ex) {
    }
    }
  }
}

// The task class for printing number from 1 to n for a given n
class PrintNum implements Runnable {
  private int lastNum;

  /** Construct a task for printing 1, 2, ... i */
  public PrintNum(int n) {
    lastNum = n;
  }

  @Override /** Tell the thread how to run */
  public void run() {
    for (int i = 1; i <= lastNum; i++) {
      System.out.print(" " + i);
      

    }
  }
}
