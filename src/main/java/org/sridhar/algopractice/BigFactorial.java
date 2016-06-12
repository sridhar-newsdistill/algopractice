package org.sridhar.algopractice;

import java.util.Scanner;


public class BigFactorial {

  public static final int MAX_SIZE = 5;

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int factNumber = sc.nextInt();
    int[] bigNumber = new int[MAX_SIZE];
    bigFactorial(bigNumber, factNumber);
  }

  public static int[] bigFactorial(int[] a, int n) {
    a[a.length - 1] = 1;
    int carry = 0;
    int digit =0;
    while (n > 0) {
      for (int i = a.length - 1; i > 1; i--) {
        digit = (a[i] * n) % 10;
        digit = digit + carry;
        carry = (a[i] * n) / 10;
        a[i]=digit;
      }
      n--;
    }
    return null;
  }

}
