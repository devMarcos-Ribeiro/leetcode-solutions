import java.util.HashMap;
import java.util.Map;

class MySolution {
 
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        final Map<Integer, Integer> numbersMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
        
            if (numbersMap.containsKey(complement)) {
                result[0] = numbersMap.get(complement);
                result[1] = i;
                return result;
            }
        
            numbersMap.put(nums[i], i);
        }

        return result;
    }

    public static void main(String[] args) {
        final int[] twoSumResult = twoSum(new int[]{3,2,4}, 6);
        System.out.println(twoSumResult.toString());
    }
}
