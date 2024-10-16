class Solution {
    public int findClosestNumber(int[] nums) {
        int closet = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(nums[i]) < Math.abs(closet))
                closet = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (closet < 0 && Math.abs(closet) == nums[i])
                return Math.abs(closet);
        }
        return closet;
    }
}