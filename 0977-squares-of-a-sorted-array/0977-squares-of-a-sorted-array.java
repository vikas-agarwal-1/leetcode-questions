class Solution {
    public int[] sortedSquares(int[] nums) {
        // brute approach
        // for(int i =0; i<nums.length; i++) {
        //     nums[i] = nums[i] * nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;

        // optimal approach
        int n = nums.length;
        int ans[] = new int[n];

        int left = 0;
        int right = n - 1;

        for (int i = n - 1; i >= 0; i--) {

            int a = nums[left] * nums[left];
            int b = nums[right] * nums[right];

            if (a > b) {
                ans[i] = a;
                left++;
            } else {
                ans[i] = b;
                right--;
            }
        }

        return ans;
    }
}