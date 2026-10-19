class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int maxi = arr[0];
        for(int i=0; i<n; i++) {
            if(maxi < arr[i]) {
                maxi = arr[i];
            }
        }
        for(int i=0; i<n; i++) {
            if(maxi == arr[i]) {
                return i;
            }
        }
        return -1;

        // int low = 0, high = n-1;

        // while(low < high) {
        //     int mid = low + (high-low) / 2;
        //     if(arr[mid] > arr[mid + 1] && arr[mid] > arr[mid-1]) {
        //         return mid;
        //     }
        //     else if(arr[mid] > arr[mid+1]) {
        //         high = mid+1;
        //     }
        //     else {
        //         low = mid-1;
        //     }
        // }
        // return low;
    }
}