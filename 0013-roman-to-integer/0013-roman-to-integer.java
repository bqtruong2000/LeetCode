class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        Map<Character, Integer> rm = new HashMap<Character, Integer>();
        rm.put('I', 1);
        rm.put('V', 5);
        rm.put('X', 10);
        rm.put('L', 50);
        rm.put('C', 100);
        rm.put('D', 500);
        rm.put('M', 1000);

        

        for(int i = s.length() - 1; i >= 0; ) {
            if(i > 0 && rm.get(s.charAt(i)) > rm.get(s.charAt(i - 1))){
                sum += rm.get(s.charAt(i)) - rm.get(s.charAt(i - 1));
                i -= 2;
            }else{
                sum += rm.get(s.charAt(i));
                i--;
            }
        }
        return sum;
    }
}
