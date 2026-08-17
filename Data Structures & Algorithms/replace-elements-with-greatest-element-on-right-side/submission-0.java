class Solution {
    public int[] replaceElements(int[] arr) {
        
        int maxSoFar = -1;
        
        for (int j=arr.length - 1; j >= 0; j--){
            int temp = arr[j];

            arr[j] = maxSoFar;

            if(maxSoFar < temp) {
                maxSoFar = temp; 
            }
        }

        return arr;
    }
}