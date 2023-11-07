class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> intersect = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && !intersect.contains(nums1[i])) intersect.add(nums1[i]);
            }
        }
        int[] returnIntersect = new int[intersect.size()];
        for (int i = 0; i < intersect.size(); i++) {
            returnIntersect[i] = intersect.get(i);
        }
        return returnIntersect;
    }
}