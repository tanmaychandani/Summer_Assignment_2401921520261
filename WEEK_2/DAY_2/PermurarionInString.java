class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 > n2) return false;
        int[] a = new int[26];
        int[] b = new int[26];
        for (int i = 0; i < n1; i++) {
            a[s1.charAt(i) - 'a']++;
            b[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(a, b)) return true;
        for (int i = n1; i < n2; i++) {
            b[s2.charAt(i) - 'a']++;
            b[s2.charAt(i - n1) - 'a']--;

            if (Arrays.equals(a, b)) return true;
        }
        return false;
    }
}
