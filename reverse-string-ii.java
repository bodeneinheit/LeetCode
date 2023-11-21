class Solution {
    public String reverseStr(String s, int k) {
        char[] sArray = s.toCharArray();

        for (int i = 0; i < sArray.length; i += 2 * k) {
            int start = i;
            int end = Math.min(i + k - 1, sArray.length - 1);
            while (start < end) {
                char temp = sArray[start];
                sArray[start] = sArray[end];
                sArray[end] = temp;
                start++;
                end--;
            }
        }
        return new String(sArray);
    }
}
