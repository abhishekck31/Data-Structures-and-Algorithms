public class ReverseString1 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversedStr = reverseString(str);
        System.out.println("Reversed String: " + reversedStr);
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
        }
    }
}