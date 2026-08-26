class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> compIndex = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int complement = target - curr;
            if (compIndex.containsKey(complement)) {        
                res[0] = compIndex.get(complement);
                res[1] = i;

                return res;
            } 

            compIndex.put(curr, i);
        }

        return res;
    }
}
