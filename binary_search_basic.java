//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int []arr = new int [n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = scn.nextInt();
//        }
//        int target = scn.nextInt();
//        int n = scn.nextInt();
//        int target = scn.nextInt();
//        System.out.println(binary_search(arr, target));
//        System.out.println(xPowerSomething(k,n));
//        System.out.println(searchInRotatedArray(arr, target));
//    }

    // Binary search
    // An algo which work on sorted array by repeatedly dividing the search interval in half
    // complexity: O(log N)

    // ALgo:
//    1. Divide the search by two equal half by finding mid.
//    2. compare middle element of search with key
//    3. if key == middle elemnt of array then loop will terminate and index will return
//    4. if middle !== key then
//            4.1 key > middle element the searching will in right side of array
//            4.2 key < middle element then searching will in left side of array

//    public static int binary_search(int [] arr, int target) {
//        int start = 0;
//        int end = arr.length;
//
//        while(end >= start) {
//            int mid = (start + end) / 2;
//
//            if(arr[mid] < target) {
//                start = mid+1;
//            }
//            else if (arr[mid] > target) {
//                end = mid - 1;
//            }else {
//                return mid;
//            }
//        }
//        return -1;
//    }

//    public static int xPowerSomething(int k, int n) {
//        int low = 1;
//        int high = n;
//        int ans = 0;
//
//        while (low <= high) {
//            int mid = (low + high) / 2;
//
//            if(Math.pow(mid,k) <= n) {
//                ans = mid;
//                low = mid + 1;
//            } else {
//                high = mid - 1;
//            }
//        }
//        return ans;
//    }

    // for finding mid there is another formula which is mid = low + (high - low)/2
    // we use this formula to handle the number overflow case.

    //Search in Rotated Sorted Array LC:33

//    public static int searchInRotatedArray(int [] arr, int target) {
//        int low = 0;
//        int high = arr.length - 1;
//
//        while(low <= high) {
//            int mid = low + (high - low) / 2;
//
//            if(arr[mid] == target) {
//                return mid;
//            } else if (arr[mid] >= arr[low]) { // this will loop into bigger value
//                if(target >= arr[low] && arr[mid] > target) {
//                    high = mid - 1;
//                }else {
//                    low = mid + 1;
//                }
//            } else {
//                if(target <= arr[high] && arr[mid] < target) {
//                    low = mid + 1;
//                }else {
//                    high = mid - 1;
//                }
//            }
//        }
//        return -1;
//    }


}