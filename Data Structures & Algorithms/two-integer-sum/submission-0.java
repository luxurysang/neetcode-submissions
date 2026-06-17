class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapNums= new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (mapNums.containsKey(target - nums[i])) {
                return new int[] {mapNums.get(target - nums[i]), i};
            }
            mapNums.put(nums[i], i);
        }   
        return new int[0];
    }
}
