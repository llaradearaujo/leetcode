/*You are given two strings word1 and word2. 
Merge the strings by adding letters in alternating order, starting with word1. 
If a string is longer than the other, append the additional letters onto the end of the merged string.*/
class Merge {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merge = new StringBuilder();
        int minLen = Math.min(word1.length(), word2.length());


        for (int i = 0; i< minLen; i++){
        merge.append(word1.charAt(i));
        merge.append(word2.charAt(i));
        }

        merge.append(word1.substring(minLen));
        merge.append(word2.substring(minLen));


        return merge.toString();
        
    }
}

