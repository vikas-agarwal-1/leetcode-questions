class Solution {
    // private int maxiFunc(int prefix, int suffix) {
    //     for(int i=0; )
    // }
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int prefix = 1, suffix = 1;
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;

            prefix *= nums[i];
            suffix *= nums[n-i-1];

            // maxiFunc(maxi, maxiFunc(prefix, suffix));
            maxi = Math.max(maxi, Math.max(prefix, suffix));
        }
        return maxi;
    }
}