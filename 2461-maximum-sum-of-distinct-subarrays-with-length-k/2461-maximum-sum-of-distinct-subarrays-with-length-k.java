class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet();

        int i=0;
        long sum = 0l;
        long maxi = 0l;

        for(int j=0; j<nums.length; j++) {
            while(set.contains(nums[j])) {
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }

            set.add(nums[j]);
            sum += nums[j];

            if(j-i+1 == k) {
                maxi = Math.max(maxi, sum);
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }
        }
        return maxi;
    }
}