import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MySolution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        final List<List<String>> result = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            List<String> anagramGroup = new ArrayList<>();
            char[] sSplitted = strs[i].toCharArray();
            Arrays.sort(sSplitted);
            for (int j = 0; j < strs.length; j++) {
                if(strs[j] != "") {
                    char[] tSplitted = strs[j].toCharArray();
                    Arrays.sort(tSplitted);
                    if(Arrays.equals(sSplitted, tSplitted)) {
                        anagramGroup.add(strs[j]);
                        strs[j] = "";
                    }
                }
            }
            if(!anagramGroup.isEmpty()) {
                result.add(anagramGroup);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<List<String>> groupedAnagrams = groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
        System.out.printf("Grouped anagrams: %s", groupedAnagrams);
    }
}
