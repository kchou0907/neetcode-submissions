class Solution {
    public boolean isPalindrome(String s) {
        String filtered = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int i = 0;
        int j = filtered.length() - 1;

        while (i < j) {
            if (filtered.charAt(i) != filtered.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
