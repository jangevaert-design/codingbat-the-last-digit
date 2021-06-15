package edu.cnm.deepdive;

/*
Given three ints, a b c, return true if two or more of them have the same rightmost digit.
The ints are non-negative.

lastDigit(23, 19, 13) → true
lastDigit(23, 19, 12) → false
lastDigit(23, 19, 3) → true
 */

public class CodingBatTheLastDigit {

  public static void main(String[] args) {
    System.out.printf("with the ints %d, %d and %d the outcome is " + lastDigit(23, 19, 13) + ".\n",
        23, 19, 13);
    System.out.printf("with the ints %d, %d and %d the outcome is " + lastDigit(23, 19, 12) + ".\n",
        23, 19, 12);
    System.out.printf("with the ints %d, %d and %d the outcome is " + lastDigit(23, 19, 3) + ".\n",
        23, 19, 3);
  }

  public static boolean lastDigit(int a, int b, int c) {
    int count = 0;

    if (a % 10 == b % 10) {
      count++;
    }
    if (a % 10 == c % 10) {
      count++;
    }
    if (b % 10 == c % 10) {
      count++;
    }
    return (count >= 1);
  }
}
