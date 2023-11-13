class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int maxlen = Math.max(len1,len2);
        StringBuilder Final =new StringBuilder();

        for(int i =0;i<maxlen;i++){
            if(i<len1){
                Final.append(word1.charAt(i));
            }
            if(i<len2){
                Final.append(word2.charAt(i));
            }
        }
        return Final.toString();
    }
}