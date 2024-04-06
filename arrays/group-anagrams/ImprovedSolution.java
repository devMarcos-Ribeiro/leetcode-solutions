import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImprovedSolution {
    
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramGroups = new HashMap<>();
    
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            anagramGroups.putIfAbsent(sortedString, new ArrayList<>());
            anagramGroups.get(sortedString).add(str);
        }
    
        return new ArrayList<>(anagramGroups.values());
    }

    public static void main(String[] args) {
        List<List<String>> groupedAnagrams = groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
        System.out.printf("Grouped anagrams: %s", groupedAnagrams);
    }
}
