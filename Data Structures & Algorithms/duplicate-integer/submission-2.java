class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();
        boolean hasDupe = false;
        for (int i = 0; i < nums.length; i++) {
            int currNum = nums[i];
            if (seen.contains(currNum)) {
                hasDupe = true;
            } else {
                seen.add(currNum);
            }
        }

        return hasDupe;
    }
}
