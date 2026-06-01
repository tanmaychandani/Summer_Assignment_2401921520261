class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int k=0;
        int p=0;
        int j=0;
        while(i<nums.length  && j<nums.length)
        {
            if(nums[i]==nums[j])j++;
            else 
            {
               i++;
               nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
