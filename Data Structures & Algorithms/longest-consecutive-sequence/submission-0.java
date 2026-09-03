class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> uNums = new HashSet<>();

        for (int curr : nums) {
            uNums.add(curr);
        }

        Set<Integer> starts = new HashSet<>();
        for (int curr : uNums) {
            if (!uNums.contains(curr - 1)) {
                starts.add(curr);
            }
        }

        int longest = 0;
        for (int curr : starts) {
            int seqLen = 0;
            while (uNums.contains(curr)) {
                curr++;
                seqLen++;
            }
            longest = Math.max(longest, seqLen);
        }

        return longest;

    }
}
