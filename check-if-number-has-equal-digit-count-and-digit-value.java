class Solution {
    public static boolean digitCount(String num) {
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0'; // = i
            int count = 0;
            for (int j = 0; j < num.length(); j++) {
                int currentDigit = num.charAt(j) - '0'; // = j
                if (currentDigit == i) {
                    count++;
                }
            }
            if (count != digit) {
                return false;
            }
        }
        return true;
    }
}
