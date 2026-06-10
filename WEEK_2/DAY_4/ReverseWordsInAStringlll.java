class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        if(n==0)return s;
        s=s+" ";
        n=s.length();
        String x="";
        for(int i=0;i<n;i++)
        {
            x=s.charAt(i)+x;
        }
        String y="";
        int z=0;
        for(int i=0;i<n;i++)
        {
            if(x.charAt(i)==32)
            {
                y=x.substring(z,i+1)+y;
                z=i+1;
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(x.charAt(i)==32)
            {
                y=x.substring(i)+" "+y;
                break;
            }
        }
        return y.trim();
    }
}
