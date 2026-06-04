class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String x=s;
        String y="";
        for(int i=0;i<x.length();i++)
        {
            char ch=x.charAt(i);
            if((ch>=48 && ch<=57) || (ch>=97 && ch<=122))
            {
                y=y+ch;
            }
        }
        int i=0;
        int j=y.length()-1;
        while(i<j)
        {
            if(y.charAt(i)!=y.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}
