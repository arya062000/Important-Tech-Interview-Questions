// https://leetcode.com/problems/sort-colors/

class Solution {
    public void sortColors(int[] nums) {
        int c0=0;
        int c1=0;
        int c2=0;
        for(int n:nums)
        {
            if(n==0)
                c0++;
            else if(n==1)
                c1++;
            else c2++;
        }
        int k=-1;
        while(c0>0)
        {
            k++;
            nums[k]=0;
            c0--;
            
            
        }
         while(c1>0)
        {
             k++;
            nums[k]=1;
            c1--;
          
            
        }
         while(c2>0)
        {
             k++;
            nums[k]=2;
            c2--;
         
        }
        
    }
}