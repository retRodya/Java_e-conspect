package L01toL07;

/**
 * What number is more?
 */
class WhatMore {
  static int a = 1;

  static int b = 2;

 public static void main(String[] args) {
  System.out.println(isMore(a, b));
 }
 static int isMore(int a, int b) {
  if (a > b) {
   return a;
  } else return b;
 }
}
