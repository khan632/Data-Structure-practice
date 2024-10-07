import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");

    //     Scanner scn = new Scanner(System.in);
  //       int n = scn.nextInt(); // for row
//         int m = scn.nextInt(); // for column

        // decleration of 2d array
        // int [][] arr;

        // decleration with initialisation
//        int [][] arr1 = new int[n][m];

        // hard coded 2D array
        // int [][] hardcode_array = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12} };

//        int row_length = arr1.length;
//        int col_length = arr1[0].length;

        // taking input in 2d array
//        for (int i = 0; i < n; i++) { // row iteration
//            for (int  j = 0; j < m; j++) { // column iteration
//                arr1[i][j] = scn.nextInt();
//            }
//        }
//        int target = scn.nextInt();
//
//        zig_zag_array(arr1);
//        jaggedArray();
//        printWave(arr1);
//        transpose(arr1);
//        searchInSortedArray(arr1, target);
//    }

    // practise question 1:
    // print zig-zag array

//    public static void zig_zag_array(int [][] arr) {
//        for (int col = 0; col < arr[0].length; col++) {
//            if(col % 2 == 0) {
//                for (int row = 0; row < arr.length; row++) {
//                    System.out.print(arr[row][col]+ " ");
//                }
//            }else {
//                for (int row = arr.length - 1; row >= 0; row--) {
//                    System.out.print(arr[row][col]+ " ");
//                }
//            }
//            System.out.println();
//        }
//    }

    // creating jaggad array

//    public static void jaggedArray () {
//        Scanner scn = new Scanner(System.in);
//
//        int n = scn.nextInt();
//
//        int [][] arr = new int[n][];
//
//        for(int i = 0; i < arr.length; i++) {
//            int m = scn.nextInt();
//            arr[i] = new int[m];
//        }
//        displayJaggedArray(arr);
//    }
//
//    public static void displayJaggedArray(int [][] arr) {
//        for (int[] ints : arr) { // row iteration
//            for (int j = 0; j < ints.length; j++) { // column iteration
//                System.out.println(ints[j] + " ");
//            }
//        }
//    }

    // practise question 2: print row wave array

//    public static void printWave (int [][] arr) {
//        for (int col = 0; col < arr[0].length; col++) {
//            if(col % 2 == 0) {
//                for (int row = 0; row < arr.length; row++) {
//                    System.out.print(arr[row][col]+ " ");
//                }
//                System.out.println();
//            }else {
//                for (int row = arr.length - 1; row >= 0; row--) {
//                    System.out.print(arr[row][col]+ " ");;
//                }
//                System.out.println();
//            }
//        }
//    }

    // practise question 3: Transpose matrix

//    public static void transpose(int [][] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for(int j = i + 1; j < arr[0].length; j++) {
//                int temp = arr[i][j];
//                arr[i][j] = arr[j][i];
//                arr[j][i] = temp;
//            }
//        }
//        display(arr);
//    }

    // practice question 4: search in sorted array

//    public static boolean searchInSortedArray(int [][] arr, int item) {
//        int r = 0;
//        int c = arr[0].length - 1;
//        while (r < arr.length && c >= 0) {
//            if (arr[r][c] == item) {
//                return true;
//            } else if (arr[r][c] > item) {
//                c--;
//            } else {
//                r++;
//            }
//        }
//        return false;
//    }

    // practice question 5: spiral print

//    public static void spiralPrint(int [][] arr) {
//        int minr = 0;
//        int minc = 0;
//        int maxr = arr.length - 1;
//        int maxc = arr[0].length - 1;
//        int totalEle = arr.length * arr[0].length;// row*col
//        int count = 0;
//        while (count < totalEle) {
//            for (int i = minc; i <= maxc && count < totalEle; i++) {
//                System.out.print(arr[minr][i] + " ");
//                count++;
//
//            }
//            minr++;
//            for (int i = minr; i <= maxr && count < totalEle; i++) {
//                System.out.print(arr[i][maxc] + " ");
//                count++;
//            }
//            maxc--;
//            for (int i = maxc; i >= minc && count < totalEle; i--) {
//                System.out.print(arr[maxr][i] + " ");
//                count++;
//            }
//            maxr--;
//            for (int i = maxr; i >= minr && count < totalEle; i--) {
//                System.out.print(arr[i][minc] + " ");
//                count++;
//            }
//            minc++;
//        }
//    }

//    public static void display(int [][] arr) {
//        for (int i = 0; i < arr.length; i++) { // row iteration
//            for (int  j = 0; j < arr[0].length; j++) { // column iteration
//                System.out.print(arr[i][j]+ " ");
//            }
//            System.out.println();
//        }
//    }
//}