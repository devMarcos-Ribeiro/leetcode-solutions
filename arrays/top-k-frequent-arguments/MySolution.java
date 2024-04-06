import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MySolution {
    
    public static int[] topKFrequent(int[] nums, int k) {
        final Map<Integer, Integer> numberAndFrequencyMap = new LinkedHashMap<>();

        for (int num : nums) {
            numberAndFrequencyMap.put(num, numberAndFrequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entriesToSort = new ArrayList<>(numberAndFrequencyMap.entrySet());
        entriesToSort.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = entriesToSort.get(i).getKey();
        }
        
        return result;
    }

    public static void main(String[] args) {
        for (int i : topKFrequent(new int[]{1,1,1,2,2,3}, 2)) {
            System.out.println(i);
        }
    }
}
