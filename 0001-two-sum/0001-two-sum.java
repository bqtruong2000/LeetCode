class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            int n = target - nums[i];
            if(map.containsKey(n) && i != map.get(n))  return new int[] {i, map.get(n)};
        }
        return new int[]{};
    }
}