public class Solution {
    public static int arrangeCoins(int n) {
        int c = 0;
        int i = 1;
        while (n >= i) {
            n -= i;
            i++;
            c++;
        }
        return c;
    }
}
