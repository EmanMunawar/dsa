public class ValidPalindromeOptimal {
    public static void main(String[] args){
        String text1 = "madam";
        System.out.println("Original Text:" + text1);
        System.out.println("Is madam Palindrome?" + isPalindrome(text1));
        String text2 = "eman";
        System.out.println("Original Text:" + text2);
        System.out.println("Is eman Palindrome?" + isPalindrome(text2));
        System.out.println();
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity = O(n^2)");
        System.out.println("Space Complexity = O(n)");
        System.out.println("===============================");
    }
    public static boolean isPalindrome(String text){
        int left  = 0;
        int right = text.length()-1;
        while(left < right){
            while(left<right && !Character.isLetterOrDigit(text.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(text.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(text.charAt(left)) != Character.toLowerCase(text.charAt(right))){
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
}
