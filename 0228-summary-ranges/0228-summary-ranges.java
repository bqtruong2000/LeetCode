class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> range = new ArrayList<String>();
        if (nums.length == 0) return range;
        String rangeStart = String.valueOf(nums[0]);
        String rangeEnd = String.valueOf(nums[0]);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1] + 1){
                rangeEnd = String.valueOf(nums[i]);
            }else{
                processRange(rangeStart, rangeEnd, range);
                rangeStart = String.valueOf(nums[i]);
                rangeEnd = String.valueOf(nums[i]);
            }
        }
        processRange(rangeStart, rangeEnd, range);
        return range;
    }

    void processRange(String start, String end, List<String> range){
        if(!start.equals(end)){
            String str = "";
            str = start + "->" + end;
            range.add(str);
        }
        else{
            range.add(start);
        }
    }
}