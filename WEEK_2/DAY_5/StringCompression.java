class Solution 
{
    public int compress(char[] chars) 
    {
        int write = 0; 
        int read = 0;
        int n = chars.length;
        while (read<n) {
            char currentChar=chars[read];
            int count=0;
            while (read<n && chars[read]==currentChar) {
                read++;
                count++;
            }
            chars[write++]=currentChar;
            if (count>1) {
                String countStr=String.valueOf(count); 
                for (char c:countStr.toCharArray())
                {
                    chars[write++] = c;
                }
            }
        }
        return write;
    }
}
