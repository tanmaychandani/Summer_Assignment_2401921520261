class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxp = 0;
        int bp = prices[0];
        for (int i = 1; i < n; i++) {
            int p = prices[i] - bp;
            if (p > maxp)
                maxp = p;
            if (prices[i] < bp)
                bp = prices[i];
        }
        return maxp;
    }
}
