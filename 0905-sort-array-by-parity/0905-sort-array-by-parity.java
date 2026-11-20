class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int ans[] = new int[nums.length];
        int j = 0;
        int k = nums.length-1;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] %2 == 0) {
                ans[j] = nums[i];
                j++;
            }
            else {
                ans[k] = nums[i];
                k--;

                // or
                // ans[nums.length-i-1]= nums[i];
            }
        }
        return ans;
    }
}