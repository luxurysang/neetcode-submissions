class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length == 0) {
            return new int[]{}; 
        }
        int l = 0;
        int r = numbers.length - 1;
        for (int i = 0; i < numbers.length; i++) {
            int mid = l + (r - l) / 2;
            if (numbers[l] != numbers[r] && numbers[l] + numbers[r] > target) {
                r--;
            }
            if (numbers[l] != numbers[r] && numbers[l] + numbers[r] < target) {
                l++;
            }
            if (numbers[l] != numbers[r] && numbers[l] + numbers[r] == target) {
                return new int[]{l + 1,r + 1};
            }
        }

        return new int[]{};
    }
}
