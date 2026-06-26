public class IsSubsequenceOptimal {
    public static void main(String[] args) {

        String a = "vehicle";
        String b = "vehicle-car";
        System.out.println("Is Subsequence for (a & b): " + isSubsequence(a,b));
        String c = "eman";
        String d = "name";
        System.out.println("Is Subsequence for (c & d): " + isSubsequence(c,d));
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity = O(n+m)");
        System.out.println("Space Complexity = O(1)");
        System.out.println("===============================");

    }


    public static boolean isSubsequence(String first, String second) {   // function to check subsequency

        int i = 0;
        int j = 0;


        while ( i < first.length() && j < second.length()) {   // Traverse both strings using loop


            if (first.charAt(i) == second.charAt(j)) {  // If characters match, move both pointers
                i++;
            }
            j++;  // Always move pointer of string b

        }
        if (i == first.length()) {    // If all characters of a and b are matched
            return true;

        }
        return false;
    }

}