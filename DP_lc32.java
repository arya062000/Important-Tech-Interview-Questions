// https://leetcode.com/problems/longest-valid-parentheses/

class Solution {
    public int longestValidParentheses(String s) {
        char a[]=s.toCharArray();
        int curr=0;
        int ans=0;
        int v=0;
        Stack<Integer> c=new Stack<>();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]=='(')
            {
                c.push(curr);
                curr=0;;
            }
                
                
            else
            {
                if(c.size()==0)
                    curr=0;
                else
                {
                   
                    curr=curr+c.peek()+2;
                    c.pop();
                    ans=Math.max(ans,curr);
                    
                }
                    
            }
        }
        return ans;
        
    }
}