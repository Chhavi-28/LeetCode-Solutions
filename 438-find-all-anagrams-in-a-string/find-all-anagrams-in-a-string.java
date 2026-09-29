class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length()) {
            return ans;
        }

        for (int i = 0; i <= s.length() - p.length(); i++) {

            String sub = s.substring(i, i + p.length());

            if (isAnagram(sub, p)) {
                ans.add(i);
            }
        }

        return ans;
    }

    private boolean isAnagram(String s, String p) {

        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (char ch : p.toCharArray()) {
            freq[ch - 'a']--;
        }

        for (int x : freq) {
            if (x != 0) {
                return false;
            }
        }

        return true;
    }
}