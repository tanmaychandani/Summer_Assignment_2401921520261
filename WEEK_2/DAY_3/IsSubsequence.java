class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=t.length();
        int x=s.length();
        if(x==0)return true;
        if(n==0)return false;
        int i=0;
        int j=0;
        int c=0;
        while(i<n && j<x)
        {
            if(t.charAt(i)==s.charAt(j))
            {
                c++;
                i++;
                j++;
                if(c==x)return true;
            }
            else
            {
                i++;
            }
        }
        return false;
    }
}
