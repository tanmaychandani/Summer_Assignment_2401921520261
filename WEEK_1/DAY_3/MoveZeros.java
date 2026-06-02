class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        if(n==1)return;
        int i=0;
        int j=1;
        while(j<n)
        {
            if(nums[i]==0)
            {
                if(nums[j]!=0)
                {
                    int t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                    i++;
                    j++;
                }
                else 
                j++;
            }
            else
            {
                i++;
                j++;
            }
        }
        return ;
    }
}
