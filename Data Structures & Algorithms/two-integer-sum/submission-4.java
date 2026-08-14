class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        int lowest = 0;
        int highest = 0;

        for (int i = 0; i < nums.length; i++){
            for (int j = nums.length - 1; j >= 0; j--){
                if(i != j && nums[i] + nums[j] == target){
                    if(i < j){
                        lowest = i;
                        highest = j;
                    } else{
                        lowest = j;
                        highest = i;
                    }
                }
            }
        }

        result[0] = lowest;
        result[1] = highest;

        return result;  
    }
}
