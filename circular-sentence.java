class Solution {
    public static boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        int length = words.length;
        if (length == 0) {
            return false;
        } else {
            for (int i = 0; i < length - 1; i++) {
                if (words[i].charAt(words[i].length() - 1) != words[i + 1].charAt(0)) {
                    return false;
                }
            }
        }
        return words[length - 1].charAt(words[length - 1].length() - 1) == words[0].charAt(0);
    }
}
