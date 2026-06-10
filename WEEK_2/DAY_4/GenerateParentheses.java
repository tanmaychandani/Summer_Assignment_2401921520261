class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> al=new ArrayList<>();
        helper(0,0,al,"",n);
        return al;
    }
    public static void helper(int l,int r,List<String>al,String x,int n)
    {
        if(l<n)
        helper(l+1,r,al,x+"(",n);
        if(r<l)
        helper(l,r+1,al,x+")",n);
        if(r==n)
        {
            al.add(x);
            return;
        }
    }
}
