class Solution
{
    public int LongestBitonicSequence(int[] nums)
    {
        // Code here
        int n=nums.length;
        int left[]=new int[n];
        left[0]=1;
        for(int i=1;i<n;i++)
        {
            int x=1;
            for(int j=0;j<i;j++)
            {
                if(nums[j]<nums[i])
                x=Math.max(x,left[j]+1);
            }
            left[i]=x;
        }
        int right[]=new int[n];
        right[n-1]=1;
        for(int i=n-2;i>=0;i--)
        {
            int x=1;
            for(int j=n-1;j>i;j--)
            {
                if(nums[j]<nums[i])
                x=Math.max(x,right[j]+1);
            }
            right[i]=x;
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            ans=Math.max(ans,left[i]+right[i]-1);
        }
        return ans;
    }
}