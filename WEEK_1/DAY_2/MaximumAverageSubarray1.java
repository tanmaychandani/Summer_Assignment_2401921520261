class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        if(n==1)return nums[0];
        long s=0;
        for(int i=0;i<k;i++)
        {
            s+=nums[i];
        }
        long max=s;
        int i=0;
        if(k==n)return (double)s/k;
        for(int j=k;j<n;j++)
        {
            s=s-nums[i]+nums[j];
            i++;
            if(s>max)max=s;
        }
        return (double)max/k;
    }
}
