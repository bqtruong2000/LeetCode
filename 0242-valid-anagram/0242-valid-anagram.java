class Solution {
    public boolean isAnagram(String s, String t) {
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();

        if (str1.length != str2.length)
            return false;

        Arrays.sort(str1);
        Arrays.sort(str2);

        String a = new String(str1);
        String b = new String(str2);

        // return a.equals(b);
        return Arrays.equals(str1, str2);
    }
}