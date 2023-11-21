public class Solution {
    public boolean repeatedSubstringPattern(String str) {
        int length = str.length();
        for (int i = length / 2; i > 0; i--) {
            if (len % i == 0) {
                int m = length / i;
                String sub = str.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < m; j++) {
                    sb.append(sub);
                }
                if (sb.toString().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
