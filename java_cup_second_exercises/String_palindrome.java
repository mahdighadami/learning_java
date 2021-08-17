public class String_palindrome {
    public static void main (String[] argument) {
        String string01 = "radar";
        System.out.println(string_palindrome(string01));
    }

    static boolean string_palindrome (String str) {
        boolean result = true;
        int n = str.length();
        char[] strArray = new char[n];
        for (int i = 0; i < n; i++) {
            strArray[n - 1 - i] = str.charAt(i);
        }
        for (int j = 0; j < n; j++) {
            if (str.charAt(j) != strArray[j]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
