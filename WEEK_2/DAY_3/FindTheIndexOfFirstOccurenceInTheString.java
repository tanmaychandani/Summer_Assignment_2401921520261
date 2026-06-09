class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length();i++)
        {
            String s=haystack.substring(i);
            if(s.startsWith(needle)) return i;
        }
        return -1;
    }
}
