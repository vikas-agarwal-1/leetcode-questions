// class Solution {
//     public int numOfSubarrays(int[] arr) {
//         // List<Integer> list = new ArrayList();
//         int MOD = 1000000007;
//         int count = 0;

//         for(int i=0; i<arr.length; i++) {
//             int sum = 0;
//             for(int j=i; j<arr.length; j++) {
//                 sum += arr[j];
//                 // list.add(sum);
//                 if(sum % 2 != 0) {
//                     count = (count + 1) % MOD;
//                 }
//             }
//         }

//         // for(Integer num: list) {
//         //     if(num%2 !=0) {
//         //         count++;
//         //     }
//         // }
//         return count;
//     }
// }


class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1_000_000_007;
        
        // Start with evenCount = 1 to account for an empty prefix sum of 0 (which is even)
        int evenCount = 1; 
        int oddCount = 0;
        
        int prefixSum = 0;
        int totalSubarrays = 0;
        
        for (int num : arr) {
            prefixSum += num;
            
            if (prefixSum % 2 == 0) {
                // Current prefix sum is even; pair it with previous odd prefix sums
                totalSubarrays = (totalSubarrays + oddCount) % MOD;
                evenCount++;
            } else {
                // Current prefix sum is odd; pair it with previous even prefix sums
                totalSubarrays = (totalSubarrays + evenCount) % MOD;
                oddCount++;
            }
        }
        
        return totalSubarrays;
    }
}