class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int[] q = new int[n];
        int head = 0, tail = 0;
        for (int i = 0; i < n; i++) {
            while (head < tail && q[head] < i - k + 1) {
                head++;
            }
            while (head < tail && nums[q[tail - 1]] < nums[i]) {
                tail--;
            }
            q[tail++] = i;
            if (i >= k - 1) {
                ans[i - k + 1] = nums[q[head]];
            }
        }
        return ans;
    }
}
