class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> mapAnagrams= new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            if (!mapAnagrams.containsKey(new String(chars))){
                mapAnagrams.put(new String(chars), new ArrayList<>(List.of(str)));
            } else {
                mapAnagrams.get(new String(chars)).add(str);
            }
        }
        return new ArrayList<>(mapAnagrams.values());
    }
}
