class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longest = "";
        for(int i = 0 ; i < strs[0].length(); i++){
            char currentChar = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++){
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return longest;
                }
            }
            longest += currentChar;
        }
        
        // System.out.println(longest);
        return longest;
    }
}