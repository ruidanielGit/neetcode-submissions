class Solution {
    public int lengthOfLastWord(String s) {
        int size = 0;
        boolean startCount = false;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (c != ' ') {
                startCount = true;
                size++;
            }

            if (startCount && s.charAt(i) == ' ') {
                return size;
            }
        }

        return size;
    }
}