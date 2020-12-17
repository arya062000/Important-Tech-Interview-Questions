// https://leetcode.com/problems/happy-number/
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        set.add(n);
        while(n!=1)
        {
            String s=Integer.toString(n);
            String str[]=s.split("");
            int x=0;
            for(int i=0;i<str.length;i++)
            {
                x+=(Integer.parseInt(str[i])*Integer.parseInt(str[i]));
            }
            
            if(set.contains(x))
                return false;
            set.add(x);
            n=x;
            
            
        }
        return true;
        
    }
}