class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n != m) return false;
        int[] ans = new int[26];
        int[] ans2 = new int[26];
        for(int i = 0;i<n ;i++){
            char st = s.charAt(i);
            char tt = t.charAt(i);
           ans[st-'a']++;
           ans2[tt-'a']++;
        }
        for(int i = 0;i<26;i++){
            if(ans[i] != ans2[i]){
                return false;
            }
        }
        return true;

    }
}
