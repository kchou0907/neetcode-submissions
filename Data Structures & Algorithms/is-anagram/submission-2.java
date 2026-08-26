class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> charCount = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);

            if (!charCount.containsKey(currChar)) {
                charCount.put(currChar, 0);
            }

            charCount.put(currChar, charCount.get(currChar) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char currChar = t.charAt(i);

            if (!charCount.containsKey(currChar)) {
                return false;
            }

            int count = charCount.get(currChar);

            if (count == 0) {
                return false;
            }
            charCount.put(currChar, count - 1);
        }

        for (Character curr : charCount.keySet()) {
            if (charCount.get(curr) != 0) {
                return false;
            }
        }

        return true;
    }
}
