public class ImprovedSolution {
    
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        // Initialize arrays to store the products from left and right
        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];
        
        // Calculate products of elements to the left of each element
        leftProducts[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }
        
        // Calculate products of elements to the right of each element
        rightProducts[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
        }
        
        // Multiply the left and right products to get the final result
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }
        
        return result;
    }

    public static void main(String[] args) {
        for (int value: productExceptSelf(new int[]{-1,1,0,-3,3})) {
            System.out.println(value);
        }
    }
}
