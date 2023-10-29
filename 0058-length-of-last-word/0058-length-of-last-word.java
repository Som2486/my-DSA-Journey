class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int i = s.lastIndexOf(' ');
        int j = i+1;
        String str = s.substring(j);
        int k = str.length();
        return k;
    }
}