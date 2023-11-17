class Solution {
    public boolean canChange(String start, String target) {
        int n = start.length();

        // check if same L and R
        if (!start.replaceAll("_", "").equals(target.replaceAll("_", ""))) {
            return false;
        }

        int i = 0, j = 0;

        while (i < n && j < n) {
            // Skip blanks
            while (i < n && start.charAt(i) == '_') {
                i++;
            }
            while (j < n && target.charAt(j) == '_') {
                j++;
            }

            // Check if the characters at the current positions are the same
            if (i < n && j < n && start.charAt(i) != target.charAt(j)) {
                return false;
            }

            // Check if 'L' can move left in start or 'R' can move right in target
            if ((i < n && start.charAt(i) == 'L' && i < j) || (j < n && target.charAt(j) == 'R' && i > j)) {
                return false;
            }

            i++;
            j++;
        }

        return true;
    }
}
