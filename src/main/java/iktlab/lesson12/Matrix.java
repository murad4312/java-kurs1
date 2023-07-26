package iktlab.lesson12;

public class Matrix {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int arrSize = arr.length;

        for(int i = 0; i < Math.pow(arrSize, 2); i++) {
            System.out.println(arr[i / arrSize][i % arrSize] + " ");
        }
    }
}
