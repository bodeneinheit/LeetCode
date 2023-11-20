class Solution {
    public String reverseStr(String s, int k) {
        // Convert the string to a char array to make it mutable
        char[] sArray = s.toCharArray();
        
        // Iterate through the string with a step size of 2k
        for (int i = 0; i < sArray.length; i += 2 * k) {
            // Reverse the first k characters if there are at least k characters remaining
            int start = i;
            int end = Math.min(i + k - 1, sArray.length - 1);
            reverse(sArray, start, end);
        }
        
        // Convert the char array back to a string and return
        return new String(sArray);
    }
    
    // Helper method to reverse the characters in a specified range of a char array
    private void reverse(char[] array, int start, int end) {
        while (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
