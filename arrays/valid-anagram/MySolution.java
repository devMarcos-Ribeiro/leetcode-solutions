class MySolution {
    public static boolean isAnagram(String s, String t) {
        // Break the incoming strings into arrays
        String[] splittedS = s.split("");
        String[] splittedT = t.split("");
        String anagram = "";

        for (int i = 0; i < splittedS.length; i++) {
            for (int j = 0; j < splittedT.length; j++) {
                if (splittedS[i] != "" && splittedS[i].equals(splittedT[j])) {
                    // If one letter from the s String is found in the t String I'll concatenate them and "remove"
                    // the letter from both arrays to make sure that it will not duplicate the letters
                    anagram += splittedT[j];
                    splittedT[j] = "";
                    splittedS[i] = "";
                }
            }
        }

        // Compare if the generated string is equal to the incoming string. If they are, that means its an anagram.
        return anagram.equals(s);
    }

    public static void main(String[] args) {
        boolean isAnagram = isAnagram("ARARA", "RARAA");
        System.out.printf("Is anagram: %s", isAnagram);
    }
}