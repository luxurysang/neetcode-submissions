class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> setNum = new HashSet<>();
        for (int num : nums) {
            if (setNum.contains(num)) {
                return true;
            }
            setNum.add(num);
        }
        return false;
    }
}