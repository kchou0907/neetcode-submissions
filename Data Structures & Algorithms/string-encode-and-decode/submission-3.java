class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.size(); i++) {
            String currStr = strs.get(i);
            sb.append(currStr.length());
            sb.append(';');
            sb.append(currStr);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new LinkedList<>();
        int i = 0;
        
        while (i < str.length()) {
            int j = i;
                        while (str.charAt(j) != ';') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            res.add(str.substring(i, j));
            i = j;
        }

        return res;
    }
}
