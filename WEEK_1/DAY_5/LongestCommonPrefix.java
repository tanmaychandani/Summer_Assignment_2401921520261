class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        if(n==1)return strs[0];
        int min=0;
        int p=strs[0].length();
        for(int i=0;i<n;i++)
        {
            if(strs[i]=="")return strs[i];
            if(strs[i].length()<p)
            {
                p=strs[i].length();
                min=i;
            }
        }
        String pre=strs[min];
        String z="";
        for(int i=0;i<n;i++)
        {
            String x=strs[i];
            String y=x.substring(0,pre.length());
            for(int j=0;j<pre.length();j++)
            {
                if(pre.charAt(j)!=y.charAt(j))break;
                z=z+y.charAt(j);
            }
            if(z.length()<pre.length())pre=z;
            if(z=="")break;
            z="";
        }
        return pre;
    }
}
