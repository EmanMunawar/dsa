public class IsSubsequenceBrute {
    public static void main(String[] args) {
        // Strings to check Subsequency
        String a = "vehicle";
        String b = "vehicle-car";
        System.out.println("Is Subsequence for (a & b): " + isSubsequence(a,b));
        String c = "eman";
        String d = "name";
        System.out.println("Is Subsequence for (c & d): " + isSubsequence(c,d));
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity = O(n*m)");
        System.out.println("Space Complexity = O(1)");
        System.out.println("===============================");

    }
    public static boolean isSubsequence(String first, String second) {   // function to check subsequency
        int start = 0;  // suppose
        for (int i = 0; i < first.length(); i++) {  // traverse each character of string
            boolean found = false;
            for (int j = start; j < second.length(); j++) {
                if (first.charAt(i) == second.charAt(j)) {
                    found = true;
                    start = j + 1;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;

    }


}