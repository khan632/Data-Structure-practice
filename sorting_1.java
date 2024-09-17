//import java.util.Scanner;
//
//public class sorting_1 {
//    public static void main(String[] args) {
//
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int []arr = new int [n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = scn.nextInt();
//        }
//        bubbleSort(arr);
//        selectionSort(arr);
//        insertionSort(arr);
//        maxSubArray(arr);
//        displayArray(arr);
//    }


    // 1. Bubble sort
//    public static void bubbleSort(int [] arr) {
//        for (int turn = 1; turn < arr.length; turn++) {
//            for(int i = 0; i < arr.length - turn; i++) {
//                if(arr[i] > arr[i+1]) {
//                    swap(arr, i, i+1);
//                }
//            }
//        }
//    }

    // 2. Selection sort

//    public static void selectionSort(int [] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            int index = min_from_ith_index(arr, i);
//            swap(arr, i, index);
//        }
//    }

    // for finding minimum valued index from ith index in an array
//    public static int min_from_ith_index(int []arr, int i) {
//        int minIndex = i;
//
//        for(int j = i + 1; j < arr.length; j++) {
//            if(arr[j] < arr[minIndex]) {
//                minIndex = j;
//            }
//        }
//        return minIndex;
//    }
    // 3. Insertion sort
//    public static void insertionSort(int [] arr) {
//        for (int i = 1; i < arr.length; i++) {
//            InsertLastElement(arr, i);
//        }
//    }
//
//    public static void InsertLastElement(int [] arr, int i) {
//        int lastIndexToCompare = i - 1;
//        int valueToCompare = arr[i];
//
//        while(lastIndexToCompare >= 0 && arr[lastIndexToCompare] > valueToCompare) {
//            arr[lastIndexToCompare + 1] = arr[lastIndexToCompare];
//            arr[lastIndexToCompare] = valueToCompare;
//            lastIndexToCompare--;
//        }
//    }

   // 3. practice question
    // 3.1 maximum sum subArray
        // Approach 1:

//    public int maxSubArray(int[] nums) {
//        int ans = Integer.MIN_VALUE;
//
//        for(int i = 0; i < nums.length; i++) {
//            int sum = 0;
//            for( int j = i; j < nums.length; j++) {
//                sum += nums[j];
//
//                ans = Math.max(sum, ans);
//            }
//        }
//        return ans;
//    }

        // 3.2 Approch 2 (Kadane's Algorithms):
    // remove extra ietartion from loop when sum is in negative
//    public int maxSubArray(int[] nums) {
//        int ans = Integer.MIN_VALUE;
//        int sum = 0;
//
//        for(int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//            ans = Math.max(sum, ans);
//            if(sum < 0) {
//                sum = 0;
//            }
//        }
//        return ans;
//    }

//    public static void displayArray(int [] arr) {
//        for (int j : arr) {
//            System.out.print(j + " ");
//        }
//    }

//    public static void swap (int [] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//}
