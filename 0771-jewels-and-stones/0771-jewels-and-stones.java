class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        HashMap<Integer, String> check = new HashMap<Integer, String>();
        for(int i = 0; i < jewels.length(); i++){
            // System.out.println(jewels.charAt(i));
            check.put(i,String.valueOf(jewels.charAt(i)));
        }
        for(String i: check.values()){
            for(int j = 0; j < stones.length(); j++){
                if(i.equals(String.valueOf(stones.charAt(j)))) ans++;
            }
        }

        // System.out.println(check);
        return ans;
    }
}