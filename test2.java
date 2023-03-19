public class ReverseString {
    public static void main(String[] args) {
        String originalString = "Vishnu";
        String reversedString = reverseString(originalString);

        System.out.println("Original string: " + originalString);
        System.out.println("Reversed string: " + reversedString);
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
