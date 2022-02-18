package com.ars.jcf;

class jcf1{

  public static void main(String args[]){

    String str = "Hello World !";
    /*String str1 = "hello";
    String str2 = "world";
    String str3 ;//= String.join(" ", str1, str2, str1);

    System.out.println(str1.length());
    System.out.println(str1.concat(str2));
    //System.out.println(str3);
    for(int i = 0; i < 4; i++){
      str3 = String.join(" " + i + " ", str1, str2);
      System.out.println(str3);
    }*/

    for(int i = str.length() - 1; i >= 0; i--){
      System.out.print(str.charAt(i));
    }System.out.println();

  }
}
