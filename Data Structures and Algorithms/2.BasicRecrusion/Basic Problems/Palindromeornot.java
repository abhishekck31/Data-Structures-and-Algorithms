public class Palindromeornot {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = checkPalindromeHelper(str);
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
    private static boolean checkPalindromeHelper(String str) {
        return checkPalindromeHelper(str, 0, str.length() - 1);
    }
    private static boolean checkPalindromeHelper(String str, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return checkPalindromeHelper(str, left + 1, right - 1);
    }
}
