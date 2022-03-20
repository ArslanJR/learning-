package com.ars.Strings;

class palindrome{
  public static void main(String[] args){
    String str1 = "Madam, I'm Adam";
    String str2 = str1.replaceAll("[^A-z]", "").toLowerCase();

    for(int i = 0; i <= str2.length()/2; i++){
      if(str2.charAt(i) != str2.charAt(str2.length() - 1 - i)){
        System.out.println("\n\u001b[2;31;40m" + "Expression \"" + str1 + "\" is a not palindrome" + "\u001b[0m\n");
        return;
      }
    }

    System.out.println("\n\u001b[1;32;40m" + "Expression \"" + str1 + "\" is a palindrome" + "\u001b[0m\n");

  }
}
