import java.util.Arrays;

class ImprovedSolution {
    
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false; // Anagrams must have the same length
        }
    
        // Convert strings to character arrays for efficient manipulation
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
    
        // Sort both arrays
        Arrays.sort(sChars);
        Arrays.sort(tChars);
    
        // Compare sorted arrays
        return Arrays.equals(sChars, tChars);
    }

    public static void main(String[] args) {
        boolean isAnagram = isAnagram("anagram", "nagaram");
        System.out.printf("Is anagram: %s", isAnagram);
    }

}
