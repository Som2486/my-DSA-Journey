class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        int[] bit = new int[32];

        for (int i = 0; i < 32; i++) {
            for (int num : nums) {
                bit[i] += num >> i & 1;
                bit[i] %= 3;
            }
        }

        for (int i = 0; i < 32; i++) {
            result |= (bit[i] << i);
        }

        return result;
    }
}