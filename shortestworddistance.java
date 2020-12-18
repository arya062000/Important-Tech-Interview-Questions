class shortestworddistance
{
    public int dist(String words[] String w1,String w2)
    {
        int a1=-1;
        int a2=-2;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<words.length;i++)
        {
            if(words[i].equals(w1))
            a1=i;
            if(words[i].equals(w2))
            a2=i;
            ans=Math.min(ans,Math.abs(a2-a1));
        }
        return ans;

    }
}