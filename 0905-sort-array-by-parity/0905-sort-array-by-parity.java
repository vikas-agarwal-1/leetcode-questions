class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // brute approach
        // int ans[] = new int[nums.length];
        // int j = 0;
        // int k = nums.length-1;

        // for(int i=0; i<nums.length; i++) {
        //     if(nums[i] %2 == 0) {
        //         ans[j] = nums[i];
        //         j++;
        //     }
        //     else {
        //         ans[k] = nums[i];
        //         k--;
        //     }
        // }
        // return ans;

        int i=0, j = nums.length-1;

        while(i<j) {
            if(nums[i] %2 == 0) {
                i++;
            }
            else if(nums[j] %2 != 0) {
                j--;
            }
            else {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }
}