class Solution {

    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }

        HashMap<String, Integer>  wordCountMapS = getCharCountMap(s);
        HashMap<String, Integer>  wordCountMapT = getCharCountMap(t);

        if(wordCountMapS.equals(wordCountMapT)){
            return true;
        }

    return false;
    }

    public HashMap<String, Integer> getCharCountMap (String word){

        HashMap<String, Integer>  charCountMap = new HashMap<String, Integer>();

        for(int i=0; i < word.length(); i++){
            String theChar = String.valueOf(word.charAt(i));
            boolean existsInMap = charCountMap.containsKey(theChar);

            if(existsInMap){
                int numOfOccurencies = charCountMap.get(theChar);
                charCountMap.put(theChar, numOfOccurencies + 1);
            } else {
                charCountMap.put(theChar, 1);
            }
        }

        return charCountMap;
    }

}
