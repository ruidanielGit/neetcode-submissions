class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int lowestIndex = 0;
        boolean found = false;

        if(s.length() == 0){
            return true;
        }

        for(int i = 0; i< s.length(); i++){
            found = false;
            for(int j = lowestIndex; j < t.length(); j++){

                if(s.charAt(i) == t.charAt(j)){
                    // iguais
                    lowestIndex = j + 1; 
                    found = true;
                    break;
                }
            }

            if(found == false){
                return false;
            }
        }
    
        return found;
    }
}