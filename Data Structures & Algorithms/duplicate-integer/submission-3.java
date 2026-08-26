class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();

        for (int curr : nums) {
            if (!counts.containsKey(curr)) {
                counts.put(curr, 0);
            }

            int currCount = counts.get(curr);
            if (currCount == 1) {
                return true;
            } else {
                counts.put(curr, currCount + 1);
            }
        }

        return false;
    }
}