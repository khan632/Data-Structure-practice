import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
/*
        String s1 = "98999999990";
        printSubStringIncreasingOrder("Areebiya");
        converter("999");

         to long
        long l1 = Long.parseLong(s1);
         to interger
        int i1 = Integer.parseInt(s1);
        String str = "81615";
        System.out.println(countCBNumber(str));
 */
//============================ArrayList and Wrapper class ====================
//        Integer b1 = 10;
//        Integer b2 = 10;
//        Integer b3 = 177;
//        Integer b4 = 177;
//        System.out.println(b1 == b2);// true
//        System.out.println(b3 == b4);// false

        // ARRAYLIST //

        //Initialisations
        ArrayList<Integer> list = new ArrayList<>();

        // Add element in Arraylist
        // add method add element at the end of the list
        list.add(10); // [10]
        list.add(20); // [10, 20]
        list.add(100); // [10, 20, 100]
        list.add(230); // [10, 20, 100, 230]
        System.out.println(list);
        System.out.println(list.size());

        // add element at any index
        // add element at given index and move remaining value one index ahead
        list.add(1, 12); // [10, 12, 20, 100, 230]
        list.add(0, -5); // [-5, 10, 12, 20, 100, 230]
        System.out.println(list);
        System.out.println(list.size());
        // time complexity of normal add method is O(1)
        // time complexity of add at any index method is O(N)

        // get element from Arraylist
        // return the data of given index of arraylist

        System.out.println(list.get(1));
        System.out.println(list.get(3));

        // update any element in ArrayList
        // will update value of given index and set to given value
        list.set(2, 991);
        list.set(1, -11);
        System.out.println(list);

        // remove element from Arraylist
        // remove the given index from the list
        System.out.println(list.remove(2));
        System.out.println(list);

        // size of arraylist
        // print the size of the list
        System.out.println(list.size());

        // sort the list
        Collections.sort(list);
        System.out.println(list);

        // print arraylist

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();

        // for each loop for printing array or arrayList
        

    }

    // p1: print sub string in increasing order
//    public static void printSubStringIncreasingOrder(String s) {
//        // find length of each subString
//        for (int len = 1; len <= s.length(); len++) {
//            for (int j = len; j <= s.length(); j++) {
//                int i = j - len;
//                System.out.print(s.substring(i, j) + " ");
//            }
//            System.out.println();
//        }
//    }

    // p3: convert string to integer of long
    // convert to integer if length is 9 else to long

//    public static int converter(String s) {
//        int ans = 0;
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            ans = ans * 10 + (ch - 48);
//        }
//        return ans;
//    }

    // p4: longest substring CB number: https://codeskiller.codingblocks.com/problems/165

//        public static int countCBNumber(String s) {
//            int cbNumber = 0;
//            boolean[] visited = new boolean[s.length()];
//            for (int len = 1; len <= s.length(); len++) {
//                for (int j = len; j <= s.length(); j++) {
//                    int i = j - len;
//                    String subStr = s.substring(i,j);
//                    long subStrToNum = Long.parseLong(subStr);
//                    if(isCBNumber(subStrToNum) && isVisited(visited, i, j-1)) {
//                        for (int k = i; k <= j - 1; k++) {
//                            visited[k] = true;
//                        }
//                        cbNumber++;
//                    }
//                }
//            }
//            return cbNumber;
//        }

    // p2: check given number if CB number or not

//    public static boolean isCBNumber(long num) {
//        if( num == 0 || num == 1) return false;
//
//        int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
//
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == num) return true;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if(num % arr[i] == 0) return false;
//        }
//        return true;
//    }

//        public static boolean isVisited(boolean[] visited, int i, int j) {
//            for (int k = i; k <= j; k++) {
//                if (visited[k]) return false;
//            }
//            return true;
//    }
    //===================== ArrayList and Wrapper class ===============
}