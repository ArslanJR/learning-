package com.ars.matrix;

class MinMax{
  public static void main(String args[]){
    //  (Math.random() * ((max - min) + 1)) + min;
    int L = (int)((Math.random() * ((5 - 1) + 1)) + 1); // длина строки матрицы
    int C = (int)((Math.random() * ((5 - 1) + 1)) + 1); // длина столбца матрицы
    int matrix[][] = new int[L][C];
    int min = 0, max = 0;

    for(int i = 0; i < L; i++){
      for(int j = 0; j < C; j++){
        matrix[i][j] = (int)(Math.random() * (50 + 1));
        System.out.print(matrix[i][j] + " ");

        min = matrix[0][0];
        max = matrix[0][0];

        if(min > matrix[i][j]){
          
        }
      }

      if(i != i+5) System.out.println();
    }

  }
}
