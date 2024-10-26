class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        //Solution 1:
        // int ans = 0;
        // HashMap<Integer, String> check = new HashMap<Integer, String>();
        // for(int i = 0; i < jewels.length(); i++){
        //     check.put(i,String.valueOf(jewels.charAt(i)));
        // }
        // for(String i: check.values()){
        //     for(int j = 0; j < stones.length(); j++){
        //         if(i.equals(String.valueOf(stones.charAt(j)))) ans++;
        //     }
        // }
        // return ans;

        //Solution 2:
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < jewels.length(); i++){
            if(!map.containsKey(jewels.charAt(i))) map.put(jewels.charAt(i), i);
        }
        for(int i = 0; i < stones.length(); i++){
            if(map.containsKey(stones.charAt(i))) ans++;
        }
        return ans;
    }
}