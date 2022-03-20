package com.ars.Strings;

import java.util.regex.*;

class RegEx{
    public static void main(String[] args){

      String str = " В Java исходным представлением qwerty12234@gmail.com этого шаблона всегда является строка, то есть объект класса String.";
      String reg = "[\\w\\d\\.]+@g?mail\\.[rucom]+";
      Pattern pat = Pattern.compile(reg);
      Matcher mat = pat.matcher(str);

      while(mat.find()){
        System.out.println(str.substring(mat.start(), mat.end()));
      }

    }
}
