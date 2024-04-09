public class MySolution {
    
    public static int[] productExceptSelf(int[] nums) {
        int[] products = new int[nums.length];
        int finalProduct = 1;
        int zeroCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
                continue;
            }

            finalProduct *= nums[i];
        }

        if(zeroCount >= 2) {
            return products;
        }

        for (int i = 0; i < products.length; i++) {
            products[i] = (nums[i] == 0) ? finalProduct : (zeroCount > 0 ? 0 : finalProduct / nums[i]);
        }

        return products;
    }

    public static void main(String[] args) {
        for (int value: productExceptSelf(new int[]{-1,1,0,-3,3})) {
            System.out.println(value);
        }
    }
}
