class Solution {


    public boolean hasDuplicate(int[] nums) {
        

        for (int i= 0; i < nums.length; i++){
            int count = 0;
            for (int j=nums.length-1 ; j>=0; j--){
                if (nums[i]==nums[j]){
                    count++;
                }
            }
            if(count >= 2){
                return true;
            }
        }

        return false;
    }
}