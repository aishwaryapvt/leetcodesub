class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length;i++)
        {
            int temp = nums[i];
            for(int j=i+1; j<nums.length;++j)
            {
                int sol=temp+nums[j];
                if (sol==target)
                {
                    int[] arr={i,j};
                    return(arr);
                }
                else
                {
                    continue;
                }
            }
        }
        return null;
    }
}
