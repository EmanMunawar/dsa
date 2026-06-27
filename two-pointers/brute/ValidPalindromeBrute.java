public class ValidPalindromeBrute {
    public static void main(String[] args){
        String text1 = "madam";
        System.out.println("Original Text:" + text1);
        System.out.println("Is madam Palindrome?" + isPalindrome(text1));
        String text2 = "op";
        System.out.println("Original Text:" + text2);
        System.out.println("Is eman Palindrome?" + isPalindrome(text2));
        System.out.println();
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity = O(n^2)");
        System.out.println("Space Complexity = O(n)");
        System.out.println("===============================");
    }
    public static boolean isPalindrome(String text){
        String clean = "";
        for(int i=0;i<text.length(); i++){
            char ch = text.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                clean = clean + Character.toLowerCase(ch);
            }
        }
        String reversed = "";
        for(int i = clean.length()-1; i>=0; i--){
            reversed = reversed + clean.charAt(i);
        }
        return clean.equals(reversed);
    }
}
