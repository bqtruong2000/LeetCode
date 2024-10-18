class Solution {
    public boolean isSubsequence(String s, String t) {
        int check = s.length();
        int count = 0;
        int k = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = k; j < t.length(); j++){
                if (t.charAt(j) == s.charAt(i)) {
                    count++;
                    k = j + 1;
                    break;
                }
            }
        }
        return count == check;
    }
}