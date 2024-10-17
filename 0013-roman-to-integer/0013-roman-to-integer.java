class Solution {
    public int romanToInt(String s) {
        
        Map<Character, Integer> rm = new HashMap<Character, Integer>();
        rm.put('I', 1);
        rm.put('V', 5);
        rm.put('X', 10);
        rm.put('L', 50);
        rm.put('C', 100);
        rm.put('D', 500);
        rm.put('M', 1000);

        int sum = rm.get(s.charAt(s.length() - 1));
        

        for (int i = s.length() - 2; i >= 0; i--) {
            // If current value is less than the next one, subtract it
            if (rm.get(s.charAt(i)) < rm.get(s.charAt(i + 1))) {
                sum -= rm.get(s.charAt(i));
            } else {
                sum += rm.get(s.charAt(i));
            }
        }
        return sum;
    }
}
