package org.sridhar.algopractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PrintNumebrsRecursion {

  public static void main(String[] args) {
    //code
    // InputStream ins = new InputStream

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String number = null;
    try {
      number = br.readLine();
      int testCases = Integer.parseInt(number);
      String array[] = null;
      int i = 0;
      number = br.readLine();
      array = number.split("\\s+");
      while (testCases > 0) {
        printWithoutLoop(Integer.parseInt(array[i]));
        testCases--;
        i++;
      }

    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

  public static void printWithoutLoop(int n) {
    if (n > 1) {
      printWithoutLoop(n - 1);
      System.out.print(" " + n);
    } else {
      System.out.print(+n);
      return;
    }
  }
}
