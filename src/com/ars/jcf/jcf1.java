package com.ars.jcf;

class jcf1{

  public static void main(String args[]){

    String str = new String("Hello World !");

    for(int i = str.length() - 1; i >= 0; i--){
      System.out.print(str.charAt(i));
    }

    System.out.println();

  }
}
