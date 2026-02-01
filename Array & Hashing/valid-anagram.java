class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int viTriS = s.charAt(i) - 'a';
            count[viTriS] = count[viTriS] + 1;
            int viTriT = t.charAt(i) - 'a';
            count[viTriT] = count[viTriT] - 1;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}