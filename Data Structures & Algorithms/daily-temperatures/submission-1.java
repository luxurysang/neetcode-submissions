class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        if (temperatures == null || temperatures.length == 0) {
            return new int[]{};
        }

        int n = temperatures.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int l = i;
            int r = l + 1;
            int count = 1;
            int current = temperatures[l];

            while (r < n) {
                if (temperatures[r] > current) {
                    result[i] = count;
                    break;
                }

                r++;
                count++;
            }
        }

        return result;
    }
}