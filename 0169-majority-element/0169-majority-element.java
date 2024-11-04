class Solution {
    public int majorityElement(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++) map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        
        for(Integer c: map.keySet()){
            if(map.get(c) > nums.length/2) return c.intValue();
        }

        return result;
    }
}