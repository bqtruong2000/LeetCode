class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
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
        return longest;
    }
}

/* 0ms
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i=0;i<strs.length;i++)
        {
            while (strs[i].indexOf(prefix) != 0)
            {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
*/