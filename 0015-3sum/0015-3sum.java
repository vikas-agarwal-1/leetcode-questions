class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Brute approach
        // int n = nums.length;
        // Set<List<Integer>> uniqueTriplets = new HashSet();
        // for(int i=0; i<n; i++) {
        //     for(int j=i+1; j<n; j++) {
        //         for(int k=j+1; k<n; k++) {
        //             if(nums[i] + nums[j] + nums[k] == 0) {
        //                 List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
        //                 // temp.add(nums[i]);
        //                 // temp.add(nums[j]);
        //                 // temp.add(nums[k]);
        //                 Collections.sort(temp);
        //                 uniqueTriplets.add(temp);
        //             }
        //         }
        //     }
        // }
        // List<List<Integer>> result = new ArrayList<>(uniqueTriplets);
        // return result;

        // optimal approach

        Arrays.sort(nums);
        int n = nums.length;
        
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<n; i++) {
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j=i+1, k= n-1;
            while(j<k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0)  {
                    List<Integer> list = new ArrayList();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    result.add(list);
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]) j++;
                    while(j<k && nums[k] == nums[k+1]) k--;
                }
                else if(sum < 0) {
                    j++;
                }
                else {
                    k--;
                }
            }
        }
        return result;
    }
}