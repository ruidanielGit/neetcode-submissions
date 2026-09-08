class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> result = new ArrayList();
        
        for(String word : words){
            int count = 0;
            for(int i = 0; i<words.length; i++){
                if(words[i].contains(word)){
                    count++;
                }
            }
            if(count > 1){
                result.add(word);
            }
        }

        return result;
    }
}