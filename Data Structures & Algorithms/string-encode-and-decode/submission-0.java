class Solution {

    public String encode(List<String> strs) {
        if (strs == null || strs.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        if (str == null || str.length() == 0) {
            return result;
        }

        int i = 0;
        while (i < str.length()) {
            int index = str.indexOf('#', i);
            
            int length =  Integer.parseInt(str.substring(i, index));

            String word = str.substring(index + 1, index + 1 + length);

            result.add(word);
            i = index + 1 + length;
        }

        return result;

    }
}
