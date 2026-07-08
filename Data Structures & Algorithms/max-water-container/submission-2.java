class Solution {
    public int maxArea(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        int n = heights.length;
        int result = 0;
        int l = 0;;
        for (int i = 0; i < n; i++) {
            if (l > i+1) {
                continue;
            }
            l = i;
            int r = n - 1;
            while (l < r) {
                int area = Math.min(heights[l],heights[r]) * (r-l);
                if (result < area) {
                    result = area;
                } else {
                    r--;
                }
            }
            
        }

        return result;
    }
}
