public class Main {
    public static void main(String[] args) {
//        int [] arr = {1, 2, 3, 4, 5, 6, 7};
        int []  arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
//        int k = 4;
//        rotate(arr, k);
//        System.out.print(trapWater(arr));
//        System.out.print(productExceptSelf(arr));

            // display an array
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+ " ");
//        }
    }

    // rotate an array with k value
    // given an array and a number and rotate an array according to number
    // Approach 1: using Extra space
        // 1. create a new array with same length
        // 2. add item from kth position to end in new array
        // 3. add remaining data from original array to new array

    // Approach 2: without using extra space:
//    public static void rotate(int [] arr, int k) {
//        int n = arr.length;
//
//        k = k % n;
//
//        while( k > 0) {
//            int item = arr[n-1];
//
//            for (int i = n-2; i >= 0; i--) {
//                arr[i+1] = arr[i];
//            }
//            arr[0] = item;
//            k--;
//        }
//    }
    // Approach 3: Optimize solution

//    public static void rotate(int [] arr, int k) {
//        int n = arr.length;
//        k = k % n;
//
//        // reverse from 0 to n-k-1
//        reverse(arr, 0, n-k-1);
//
//        // reverse from k to last element
//        reverse(arr, n-k, n-1);
//
//        // reverse whole array
//        reverse(arr, 0, n-1);
//    }

    // inverse an array with limited indexing

//    public static void reverse(int [] arr, int i, int j) {
//        while(i < j) {
//            int temp = arr[j];
//            arr[j] = arr[i];
//            arr[i] = temp;
//
//            i++;
//            j--;
//        }
//    }

    // trap water LC: 42

//    public static int trapWater(int [] arr) {
//        int n = arr.length;
//        int []left = new int [n];
//        int []right = new int[n];
//
//        left[0] = arr[0];
//        right[n-1] = arr[n-1];
//        int answer = 0;
//
//        for(int i = 1; i < left.length; i++) {
//            left[i] = Math.max(left[i-1], arr[i]);
//        }
//
//        for(int j = n-2; j >= 0; j--) {
//            right[j] = Math.max(right[j+1], arr[j]);
//        }
//
//        for(int k = 0; k < n; k++) {
//            answer += Math.min(left[k], right[k]) - arr[k];
//        }
//        return answer;
//    }

    // Product of number except itself // LC: 238

//    public int[] productExceptSelf(int[] nums) {
//        int n = nums.length;
//        int [] left = new int [n];
//        int [] right = new int [n];
//        left[0] = 1;
//        right[n-1] = 1;
//
//        for(int i = 1; i < n; i++) {
//            left[i] = left[i-1] * nums[i-1];
//        }
//        for(int i = n-2; i >= 0; i--) {
//            right[i] = right[i+1] * nums[i+1];
//        }
//
//        for(int i = 0; i < n; i++) {
//            nums[i] = left[i] * right[i];
//        }
//
//        return nums;
//    }
}