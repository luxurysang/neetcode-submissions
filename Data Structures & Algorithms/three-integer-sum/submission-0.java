

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // Bỏ qua phần tử trùng
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {

                int target = nums[i] + nums[l] + nums[r];

                if (target == 0) {

                    List<Integer> subResult = new ArrayList<>();
                    subResult.add(nums[i]);
                    subResult.add(nums[l]);
                    subResult.add(nums[r]);
                    result.add(subResult);

                    l++;
                    r--;

                    // Bỏ qua duplicate bên trái
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }

                    // Bỏ qua duplicate bên phải
                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;
                    }

                } else if (target < 0) {

                    l++;

                } else {

                    r--;

                }
            }
        }

        return result;
    }
}