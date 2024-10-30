class Solution {
    public int maxNumberOfBalloons(String text) {
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c: text.toCharArray()){
            if("balloon".indexOf(c) != -1) map.put(c, map.getOrDefault(c, 0) + 1);
        }
        if(!map.containsKey('a') || !map.containsKey('b') || !map.containsKey('l') || !map.containsKey('o') || !map.containsKey('n')) return 0;
        int a = map.get('a');
        int b = map.get('b');
        int l = map.get('l') / 2;
        int o = map.get('o') / 2;
        int n = map.get('n');

        return Math.min(a, Math.min(b, Math.min(l, Math.min(o,n))));
    }
}