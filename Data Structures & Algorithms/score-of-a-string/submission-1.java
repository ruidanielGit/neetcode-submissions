class Solution {
    public int scoreOfString(String s) {
        
        int sum = 0;

        for(int i=0; i< s.length()-1; i++){
            char first = s.charAt(i);
            char second = s.charAt(i+1);
            
            sum+= Math.abs(Integer.valueOf(first) - Integer.valueOf(second));
        }

        return sum;
    }
}