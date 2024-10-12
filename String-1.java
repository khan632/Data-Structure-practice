
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

//        String is a class in java and a non primitive type data structure and cretaed in heap memory
//
//         initialisation in two different style
//         s1 --> with new keyword it will create string in heap memory
//         s2 --> without new keyword it will create in stringpool or intern pool inside heap memory
//         stringpool only allow unique value no duplicate value store at
//         new address it will return same address

//        String s1 = "hey";
//        String s2 = "hey";
//        String s3 = new String("areeb");
//        String s4 = new String("areeb");

//        System.out.println(s1 == s2); // return true because both return same address
//        System.out.println(s3 == s4); // return false because return differnet value

//         s1 = s1 + "areeb";
//          string is immutable because of above expression
//         when we try to add any string whether with new keyword or non new keyword string
//         it will create a new string with new address with added new string in it in
//         heap memory with new address

//        System.out.println(s1);
        System.out.println("hey" + 10 + 20 + "jay"); // hey1020jay it will start as string and then add number
        System.out.println(10 + 20 + 30 + "hey" + "jay"); // 60heyjay it will start as number than add string

//         compare value of string
//        System.out.println(s2.equals(s3));

//         custom value comparator
//        System.out.println(isEqual(s1, s2));

//         check for palindrome string
        String str = "yadav";
        System.out.println(isPalindrome(str));

//       check lexograpjycally which one is bigger or smaller
        String s1 = "komal";
        String s2 = "kunal";
        String s3 = "ankit";
        String s4 = "ankita";
        System.out.println(s1.compareTo(s2));
//         it will either any one of them
//         1. +ve value means s1 > s2 s1 will comes second
//         2. -ve value means s1 < s2 s1 will comes first
//         3. equal value
//         if length is not same then it will check on length of string not on ascii value of character

        System.out.println(CompareTo(s1, s2));
        System.out.println(CompareTo(s3, s4));
        printAllSubstring("Areeb");
        printAllPalindromeSubstring("uddin");
        System.out.println(getUnique("areeb"));
        System.out.println(getUnique("amn"));
    }

//     p1: create custom isEqual method of string

    public static boolean isEqual(String s1, String s2) {
        if (s1 == s2) return true;
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

//     p2: check string is palindorme or not
    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

//     p3: find lexcographical data
    public static int CompareTo(String s1, String s2) {
        int minLength = Math.min(s1.length(), s2.length());

        for (int i = 0; i < minLength; i++) {
            if(s1.charAt(i) != s2.charAt(i)) return s1.charAt(i) - s2.charAt(i);
        }
        return s1.length() - s2.length();
    }

//     p4: print all substring of a string
    public static void printAllSubstring(String str) {
        for (int i = 0; i < str.length(); i++) {
            for(int j = i+1; j <= str.length(); j++) {
                System.out.print(str.substring(i,j)+ " ");
            }
            System.out.println();
        }
    }

//     p5: print all substring which is palindrome
    public static void printAllPalindromeSubstring(String str) {
        for (int i = 0; i < str.length(); i++) {
            for(int j = i+1; j <= str.length(); j++) {
                String substring = str.substring(i,j);
                if(isPalindrome((substring))){
                    System.out.print(substring+ " ");
                }
            }
            System.out.println();
        }
    }

//     p6: return boolean if string contain only unquie character

    public static boolean getUnique(String str) {
        int [] freqArr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freqArr[ch - 97] = freqArr[ch - 97] + 1;
        }

        for (int j : freqArr) {
            if (j > 1) return false;
        }
        return true;
    }
}