class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] forwards = new int[nums.length];
        int[] back = new int[nums.length];

        // [0, 1, 2, 8]
        int currProd = nums[0];
        forwards[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            forwards[i] = currProd;
            currProd *= nums[i];
        }

        // [48, 24, 6, 0]
        currProd = nums[nums.length - 1];
        back[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            back[i] = currProd;
            currProd *= nums[i];
        }

        int[] res = new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = forwards[i] * back[i];
        }

        return res;
    }
}  
