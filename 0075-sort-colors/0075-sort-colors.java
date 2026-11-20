class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        int i=0, j=0, k = n-1;
        while(j <= k) {
            if(arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
            else if(arr[j] == 1) {
                j++;
            }
            else {
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                k--;
            }
        }
    }
}