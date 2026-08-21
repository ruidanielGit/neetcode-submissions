class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int maxNumber = 0;
        int count = 0;


        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                count = 0;
            }
            if(nums[i]==1){
                count++;
            }

            if(count > maxNumber){
                maxNumber = count;
            }
        }
        
        return maxNumber;
    }
}