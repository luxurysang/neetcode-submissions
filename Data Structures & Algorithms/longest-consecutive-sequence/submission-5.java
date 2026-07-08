class Solution {
    public int longestConsecutive(int[] nums) {
        int result = 0;
        if (nums == null || nums.length == 0 ) {
            return 0;
        }
        Set<Integer> setNum = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            setNum.add(nums[i]);
        }
        int current = 0;
        for (int num : nums) {
            if (!setNum.contains(num - 1)) {
                current = num;
                int subResult = 1;
                while (setNum.contains(current + 1)) {
                    current = current + 1;
                    subResult = subResult + 1;
                }
                result = Math.max(result,subResult);
            }
        }

        return result;
    }
}
