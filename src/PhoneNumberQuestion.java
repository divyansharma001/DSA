public class PhoneNumberQuestion {

    // Mappings for digits to letters
    static String[] mappings = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };

    public static void main(String[] args) {
        combinations("", "23");
    }

    static void combinations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';
        String letters = mappings[digit]; // Get the corresponding letters for the digit

        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            combinations(p + ch, up.substring(1));
        }

    }
}
