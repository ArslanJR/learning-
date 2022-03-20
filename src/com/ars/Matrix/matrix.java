package com.ars.Matrix;

class matrix{
	public static void main(String[] args){
		int M = (int)( (Math.random() * ((5 - 2) + 1)) + 2 );
		int N = (int)( (Math.random() * ((5 - 2) + 1)) + 2 );
		int[][] arr = new int[M][N];
		int min, max;

		for(int i = 0; i < M; i++){
			for(int j = 0; j < N; j++){
				arr[i][j] = (int)( Math.random() * (50 + 1) );
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}

		min = arr[0][0];
		max = arr[0][0];

		int indexMin = 0, indexMax = 0;

		for(int i = 0; i < M; i++){
			for(int j = 0; j < N; j++){
				if(min > arr[i][j]){
					min = arr[i][j];
					indexMin = i;
				}
				if(max < arr[i][j]){
					max = arr[i][j];
					indexMax = i;
				}
			}
		}

		if(indexMin == indexMax) return;

		System.out.println("\nmin: " + min + " \nmax: " + max);
		System.out.println("\nindexMin: " + indexMin + "\nindexMax: " + indexMax + "\n");

		int[] minArr = new int[N];
		int[] maxArr = new int[N];

		for(int i = 0; i < N; i++){
			minArr[i] = arr[indexMin][i];
			maxArr[i] = arr[indexMax][i];
		}

		for(int i = 0; i < N; i++){
			arr[indexMin][i] = maxArr[i];
			arr[indexMax][i] = minArr[i];
		}

		for(int i = 0; i < M; i++){
			for(int j = 0; j < N; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}
