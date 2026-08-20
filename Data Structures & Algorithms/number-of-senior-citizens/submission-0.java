class Solution {
    public int countSeniors(String[] details) {

        int oldPeopleCount = 0;

        // nº of adults
        for(String detail : details){
            String age = String.valueOf(detail.charAt(11)) + String.valueOf(detail.charAt(12));

            if(Integer.valueOf(age) > 60){
                oldPeopleCount++;
            }
        }

        return oldPeopleCount;
    }
}