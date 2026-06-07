class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        int[] arr = new int[n];
        int i = 0;
        int j = 1;
        while (i < n && j < n) {
            if (s.charAt(i) != s.charAt(j)) {
                j++;
                if (j == n) {
                    i++;
                    j = i + 1;
                }
            } else {
                arr[i]++;
                arr[j]++;
                i++;
                j = i + 1;
            }
        }
        for (int k = 0; k < n; k++) {
            if (arr[k] == 0)
                return k;
        }
        return -1;
    }
}
