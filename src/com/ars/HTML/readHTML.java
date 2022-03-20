package com.ars.HTML;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class readHTML{

  public static void main(String[] args) throws IOException {
    URL oracle = new URL("http://localhost/");
    BufferedReader in =  new BufferedReader(new InputStreamReader(oracle.openStream()));

    File outFile = new File("volume.html");
    OutputStream os = new FileOutputStream(outFile);
    OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
    BufferedWriter out = new BufferedWriter(osw);

    String inputLine;
    while((inputLine = in.readLine()) != null){
      System.out.println(inputLine);
      out.write(inputLine);
    }

    out.close();
    in.close();
  }
}
