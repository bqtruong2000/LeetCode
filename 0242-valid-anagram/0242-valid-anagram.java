class Solution {
    public boolean isAnagram(String s, String t) {
        /*    // Solution 1:
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();

        if (str1.length != str2.length)
            return false;

        Arrays.sort(str1);
        Arrays.sort(str2);

        String a = new String(str1);
        String b = new String(str2);

        // return a.equals(b);
        return Arrays.equals(str1, str2); */

        //Solution 2:
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for(char c: s.toCharArray()) sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        for(char c: t.toCharArray()) tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        return sMap.equals(tMap);
    }
}