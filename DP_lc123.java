// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/

class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int left[]=new int[n];
        int right[]=new int[n];
        int minl=prices[0];
        left[0]=0;
        for(int i=1;i<n;i++)
        {
            left[i]=Math.max(left[i-1],prices[i]-minl);
            minl=Math.min(minl,prices[i]);
        }
        int maxr=prices[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right[i]=Math.max(right[i+1],maxr-prices[i]);
            maxr=Math.max(maxr,prices[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            ans=Math.max(ans,left[i]+right[i]);
        }
        return ans;
        
    }
}