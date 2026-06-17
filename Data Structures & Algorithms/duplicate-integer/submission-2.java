class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> setNum = new HashSet<>();
        for (int num : nums) {
            if (!setNum.add(num)) {
                return true;
            }
        }
        return false;
    }
}