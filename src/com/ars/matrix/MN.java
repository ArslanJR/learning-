package com.ars.matrix;

import java.util.Scanner;

class MN{
  public static void main(String args[]){

    Scanner ch = new Scanner(System.in);
    int M, N;

    System.out.print("Укажите количество столбцов матрицы: ");
    M = ch.nextInt();
    System.out.print("Укажите количество строк матрицы: ");
    N = ch.nextInt();

    for(int i = 0; i < N; i++){
      for(int j = 0; j < M; j++){
        System.out.print( (int)(Math.random() * 50) + " ");
      }

      if(i != i+5) System.out.println();
    }

  }
}
