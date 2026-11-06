// class Solution {
//     public int[] getSubarrayBeauty(int[] nums, int k, int x) {
//         List<Integer> list = new ArrayList();
//         List<Integer> answer = new ArrayList();
//         int n = nums.length;
//         int i =0, j=0;

//         while(j<n) {
//             if(nums[j] < 0) {
//                 list.add(nums[j]);
//             }
          
//             if(j-i+1 == k) {
//                 if(list.size() < x) {
//                     answer.add(0);
//                 }
//                 else {
//                     Collections.sort(list);
//                     answer.add(list.get(x-1));  
//                 }
//                 if(nums[i] < 0) {
//                     list.remove(Integer.valueOf(nums[i]));
//                 }
//                 i++;
//             }
//             j++; 
//         }
//         return answer.stream().mapToInt(Integer::intValue).toArray();
        


//         // process to convert arrary list into the array 
//         //  int[] result = new int[answer.size()];
        
//         // // 2. Manually copy the elements over
//         // for (int i = 0; i < answer.size(); i++) {
//         //     result[i] = answer.get(i); // Automatically unboxes Integer to int
//         // }
//     }
// }









class Solution {

    public int[] getSubarrayBeauty(int[] nums, int k, int x) {

        int n = nums.length;

        int[] freq = new int[51];
        int[] answer = new int[n - k + 1];

        int i = 0;
        int j = 0;
        int idx = 0;

        while (j < n) {

            // Step 1: Add incoming negative number
            if (nums[j] < 0) {
                freq[-nums[j]]++;
            }

            // Step 2: Check window size
            if (j - i + 1 == k) {

                // Step 3: Find xth smallest negative number
                int count = 0;
                int beauty = 0;

                for (int p = 50; p >= 1; p--) {

                    count += freq[p];

                    if (count >= x) {
                        beauty = -p;
                        break;
                    }
                }

                answer[idx++] = beauty;

                // Step 4: Remove outgoing element
                if (nums[i] < 0) {
                    freq[-nums[i]]--;
                }

                // Step 5: Slide window
                i++;
            }

            j++;
        }

        return answer;
    }
}