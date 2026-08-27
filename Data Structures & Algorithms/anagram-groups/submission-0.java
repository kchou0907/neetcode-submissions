class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map, List<String>> grouping = new HashMap<>();
        for (String currStr : strs) {
            Map<Character, Integer> charCount = new HashMap<Character, Integer>();

            for (int i = 0; i < currStr.length(); i++) {
                char currChar = currStr.charAt(i);
                if (!charCount.containsKey(currChar)) {
                    charCount.put(currChar, 0);
                }

                charCount.put(currChar, charCount.get(currChar) + 1);
            }

            if (!grouping.containsKey(charCount)) {
                grouping.put(charCount, new LinkedList<String>());
            }
            grouping.get(charCount).add(currStr);
        }
        
        List<List<String>> res = new LinkedList<>();

        for (Map<Character, Integer> currGroup : grouping.keySet()) {
            res.add(grouping.get(currGroup));
        } 

        return res;
    }
}
