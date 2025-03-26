package katas_java;

public class MergedAlternately {

    public String mergedTwoString(String word1, String word2) {

        StringBuilder wordMerged = new StringBuilder();

        int lengthWord = word1.length() + word2.length();
        int countLengthWord1 = 0;
        int countLengthWord2 = 0;

        for(int i = 0; i < lengthWord; i++) {
            if(countLengthWord1 < word1.length()) {
                wordMerged.append(word1.charAt(countLengthWord1));
                countLengthWord1++;
            }

            if(countLengthWord2 < word2.length()) {
                wordMerged.append(word2.charAt(countLengthWord2));
                countLengthWord2++;
            }

        }

        return wordMerged.toString();

    }
}
